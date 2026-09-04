package JavaSwing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class ResumoPanel extends JPanel {

    private JTextArea txtResumo;

    public ResumoPanel() {
        setBorder(BorderFactory.createTitledBorder(null, "Resumo do personagem", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLUE));
        setLayout(new BorderLayout());

        txtResumo = new JTextArea();
        txtResumo.setEditable(false); 



        JScrollPane scrollPane = new JScrollPane(txtResumo);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void atualizarResumo(String nome, String classe, String dificuldade, List<String> habilidades, int nivel) {


        String texto = "★ PERSONAGEM CRIADO ★\n" +
                       "-------------------------------------\n" +
                       "Nome: " + nome + "\n" +
                       "Classe: " + classe + "\n" +
                       "Dificuldade: " + dificuldade + "\n" +
                       "Habilidades: " + habilidades + "\n" +
                       "Nível inicial: " + nivel + "\n" +
                       "-------------------------------------";

        txtResumo.setText(texto);
    }

    public void limparResumo() {
        txtResumo.setText("");
    }
}