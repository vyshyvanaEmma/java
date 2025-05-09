package es39;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMainFrame extends JFrame implements ActionListener{
    
    JButton utente, amministrazione;
    Amministrazione amministranzioneP;

    MyMainFrame(){

        amministranzioneP = new Amministrazione();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 2));
        this.setSize(500, 500);
        this.setTitle("Recenzione");
        this.getContentPane().setBackground(new Color(240, 248, 255));
        
        utente = new JButton("UTENTE");
        amministrazione = new JButton("AMIMINISTRAZIONE");

        utente.addActionListener(this);
        amministrazione.addActionListener(this);

        this.add(utente);
        this.add(amministrazione);
        this.setVisible(true);
    }

       @Override
    public void actionPerformed(ActionEvent e) {
        Amministrazione n = new Amministrazione();
        if(e.getSource() == utente){
            MyFrame am = new MyFrame(amministranzioneP);
            n = am.getA();
        }
        if(e.getSource() == amministrazione){
            new Risultati(n);
        }
    }


    
}
