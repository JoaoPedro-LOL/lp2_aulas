package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CriacaoPanel extends JPanel {

    public JTextField Nome;
    public JComboBox<String> Classe;
    public JRadioButton Facil, Medio, Dificil;
    public ButtonGroup Dificuldade;
    public JCheckBox Magia, Cura, Furtividade, Forca;
    public JSlider sliderNivel;
    public JLabel lblValorNivel;

    public ResumoPanel resumoPanel;

    public CriacaoPanel(ResumoPanel resumo) {
        this.resumoPanel = resumo;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nome do personagem:"), gbc);

        Nome = new JTextField(12);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(Nome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("CClasse:"), gbc);

        String[] cClasses = { "Mago", "Guerreiro", "Arqueiro", "Ladino" };
        Classe = new JComboBox<>(cClasses);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(Classe, gbc);

        JPanel pnlDificuldade = new JPanel(new GridLayout(3, 1));

        Facil = new JRadioButton("Fácil");
        Medio = new JRadioButton("Médio");
        Dificil = new JRadioButton("Difícil");

        Dificuldade = new ButtonGroup();
        Dificuldade.add(Facil);
        Dificuldade.add(Medio);
        Dificuldade.add(Dificil);

        pnlDificuldade.add(Facil);
        pnlDificuldade.add(Medio);
        pnlDificuldade.add(Dificil);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(pnlDificuldade, gbc);

        JPanel pnlHabilidades = new JPanel(new GridLayout(4, 1));
        
        Magia = new JCheckBox("Magia");
        Cura = new JCheckBox("Cura");
        Furtividade = new JCheckBox("Furtividade");
        Forca = new JCheckBox("Força");

        pnlHabilidades.add(Magia);
        pnlHabilidades.add(Cura);
        pnlHabilidades.add(Furtividade);
        pnlHabilidades.add(Forca);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(pnlHabilidades, gbc);

        JPanel pnlNivel = new JPanel();
        pnlNivel.setLayout(new BorderLayout());
        pnlNivel.setBorder(BorderFactory.createTitledBorder("Nível inicial:"));

        sliderNivel = new JSlider(1, 10, 1);
        sliderNivel.setMajorTickSpacing(1);
        sliderNivel.setPaintTicks(true);
        sliderNivel.setPaintLabels(true);

        lblValorNivel = new JLabel("1", SwingConstants.CENTER);
        lblValorNivel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        lblValorNivel.setPreferredSize(new Dimension(30, 20));

        sliderNivel.addChangeListener(e -> lblValorNivel.setText(String.valueOf(sliderNivel.getValue())));

        pnlNivel.add(sliderNivel, BorderLayout.CENTER);
        pnlNivel.add(lblValorNivel, BorderLayout.EAST);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add(pnlNivel, gbc);

        JPanel pnlBotoes = new JPanel(new FlowLayout());
        JButton btnCriar = new JButton("Criar personagem");
        JButton btnLimpar = new JButton("Limpar");

        btnCriar.addActionListener(e -> criarPersonagem());
        btnLimpar.addActionListener(e -> limparCampos());

        pnlBotoes.add(btnCriar);
        pnlBotoes.add(btnLimpar);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(pnlBotoes, gbc);
    }

    public void criarPersonagem() {
        String nome = Nome.getText();
        String cClasse = (String) Classe.getSelectedItem();

        String dificuldade = "";
        if (Facil.isSelected())
            dificuldade = "Fácil";
        else if (Medio.isSelected())
            dificuldade = "Médio";
        else if (Dificil.isSelected())
            dificuldade = "Difícil";

        ArrayList<String> habilidades = new ArrayList<>();
        if (Magia.isSelected())
            habilidades.add("Magia");
        if (Cura.isSelected())
            habilidades.add("Cura");
        if (Furtividade.isSelected())
            habilidades.add("Furtividade");
        if (Forca.isSelected())
            habilidades.add("Força");

        int nivel = sliderNivel.getValue();

    }

    public void limparCampos() {
        Nome.setText("");
        Classe.setSelectedIndex(0);
        Dificuldade.clearSelection();
        Magia.setSelected(false);
        Cura.setSelected(false);
        Furtividade.setSelected(false);
        Forca.setSelected(false);
        sliderNivel.setValue(1);
        resumoPanel.limparResumo();
    }
}