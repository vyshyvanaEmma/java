package es38_GestionaleAuto;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyCancellazioneFrame extends JFrame implements ActionListener{
    
    JButton cancella;
    JTextField campoCodFisc;
    JLabel messaggioResult;
    
    Agenzia agenzia;

    MyCancellazioneFrame(Agenzia agenzia){

        this.agenzia = new Agenzia();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 1, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Cancellazione proprietario");
        this.getContentPane().setBackground(new Color(255, 240, 245));

        JLabel label = new JLabel("Inserisci il codice fiscale del proprietario:", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 14));

        campoCodFisc = new JTextField();
        campoCodFisc.setFont(new Font("Courier New", Font.PLAIN, 14));
        campoCodFisc.setHorizontalAlignment(JTextField.CENTER);

        cancella = new JButton();
        cancella.setFont(new Font("Verdana", Font.BOLD, 12));
        cancella.addActionListener(this);

        messaggioResult = new JLabel(" ");
        messaggioResult.setFont(new Font("Arial", Font.ITALIC, 12));

        
        this.add(label);
        this.add(campoCodFisc);
        this.add(cancella);
        this.add(messaggioResult);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancella){
            if(campoCodFisc.getText().isEmpty()){
                messaggioResult.setForeground(Color.RED);
                messaggioResult.setText("Inserisci un codice fiscale!");
                return; 
            }

            if (agenzia.rimuoviProprietario(campoCodFisc.getText())) {
                messaggioResult.setForeground(new Color(0, 100, 0));
                messaggioResult.setText("Proprietario rimosso con successo!");
                campoCodFisc.setText("");
            } else {
                messaggioResult.setForeground(Color.RED);
                messaggioResult.setText("Nessun proprietario trovato con questo codice fiscale!");
            }
        }
    }
}
