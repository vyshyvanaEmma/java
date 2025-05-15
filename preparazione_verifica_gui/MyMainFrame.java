package preparazione_verifica_gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMainFrame extends JFrame implements ActionListener{

    JButton inserire, cancella;

    MyMainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        this.setLayout(new BorderLayout());
        this.setTitle("Gestione Proprietari");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        JLabel titolo = new JLabel("Gestionale Auto", JLabel.CENTER);
        titolo.setFont(new Font("Arial", Font.BOLD, 20));

        mainPanel.add(titolo, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        JButton inserire = createButton("Inserire un nuova proprietario");
        JButton cancella = createButton("Cancella un proprietario");

        buttonPanel.add(inserire);
        buttonPanel.add(cancella);

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        this.add(mainPanel);
        this.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial", Font.PLAIN, 14));
        btn.setBackground(new Color(240, 240, 240));
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == inserire){
            //new MyI();
        } else if(e.getSource() == cancella){
            new MyCancellaFrame();
        } else{
            System.out.println("errore");
        }
    }
}
