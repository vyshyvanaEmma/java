package es38_GestionaleAuto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMainFrame extends JFrame implements ActionListener{

    JButton inserimento, cancellazione;

    MyMainFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 2, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Prenota il biglietto");
        this.getContentPane().setBackground(Color.MAGENTA);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));

        inserimento = new JButton();
        inserimento.addActionListener(this);
        cancellazione = new JButton();
        cancellazione.addActionListener(this);

        JLabel ins = new JLabel("Inserisci un nuovo proprietario");
        JLabel canc = new JLabel("Cancella un proprietario");

        panel.add(inserimento);
        panel.add(cancellazione);

        this.add(ins);
        this.add(canc);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == inserimento){
            new MyFrame();
        } else if(e.getSource() == cancellazione){
            new MyCancellazioneFrame();
        }
    }

}
