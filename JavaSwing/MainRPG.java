package JavaSwing;
import javax.swing.*;
import java.awt.*;

public class MainRPG extends JFrame {

    public MainRPG() {
        setTitle("Gerador de Personagem de RPG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));


        ResumoPanel resumoPanel = new ResumoPanel();
        CriacaoPanel criacaoPanel = new CriacaoPanel(resumoPanel);


        add(criacaoPanel, BorderLayout.WEST);
        add(resumoPanel, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainRPG().setVisible(true);
        });
    }
}