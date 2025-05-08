package es38_GestionaleAuto;

import java.awt.Color;
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
    
    private ArrayList<Proprietario> proprietari = new ArrayList<>();;

    MyCancellazioneFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 2, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Prenota il biglietto");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel();
        label.setText("Inserisci il codice fiscale del proprietario");

        campoCodFisc = new JTextField();

        cancella = new JButton();
        cancella.addActionListener(this);

        messaggioResult = new JLabel(" ");

        this.add(cancella);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancella){
            if(campoCodFisc.getText().isEmpty()){
                messaggioResult.setForeground(Color.RED);
                messaggioResult.setText("Compila il campo!");
                return; 
            }

            boolean trovato = false;

            for(int i = 0; i < proprietari.size(); i++){
                Proprietario p = proprietari.get(i);

                if(p.getCodFisc().equals(campoCodFisc.getText())){
                    trovato = true;
                    proprietari.remove(i);
                }
            }

            if(trovato == false){
                messaggioResult.setForeground(Color.RED);
                messaggioResult.setText("Il proprietario con questo codice fiscale non esiste");
                return; 
            }
        }
    }
}
