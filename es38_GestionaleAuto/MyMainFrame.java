package es38_GestionaleAuto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMainFrame extends JFrame implements ActionListener{

    JButton inserimento, cancellazione;
    private Agenzia agenzia;

    MyMainFrame(){

        this.agenzia = new Agenzia();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 1, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Gestione Proprietari");
        this.getContentPane().setBackground(new Color(230, 230, 250));
        
        JLabel titolo = new JLabel("GESTIONE PROPRIETARI AUTO", JLabel.CENTER);
        titolo.setFont(new Font("Arial", Font.BOLD, 20));
        titolo.setForeground(new Color(70, 70, 70));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        inserimento = new JButton("INSERISCI");
        inserimento.setFont(new Font("Verdana", Font.PLAIN, 14));
        inserimento.addActionListener(this);
        cancellazione = new JButton("CANCELLA");
        cancellazione.setFont(new Font("Verdana", Font.PLAIN, 14));
        cancellazione.addActionListener(this);

        panel.add(inserimento);
        panel.add(cancellazione);

        this.add(titolo);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == inserimento){
            new MyFrame(agenzia);
        } else if(e.getSource() == cancellazione){
            new MyCancellazioneFrame(agenzia);
        }
    }

}
