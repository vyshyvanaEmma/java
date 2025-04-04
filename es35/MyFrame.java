
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    
    public MyFrame() {
        setTitle("Calcolatrice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        JTextField schermo = new JTextField();
        schermo.setEditable(false);
        add(schermo, BorderLayout.NORTH);

        JPanel pannello = new JPanel();
        pannello.setLayout(new GridLayout(4, 4, 5, 5));

        String[] bottoni = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : bottoni) {
            JButton button = new JButton(text);
            pannello.add(button);
        }

        add(pannello, BorderLayout.CENTER);
        setVisible(true);
    }
}
