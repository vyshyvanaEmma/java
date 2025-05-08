package es38_GestionaleAuto;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame implements ActionListener {

    JButton conferma;
    JButton annula;
    JLabel labelCognome;
    JLabel labelCodFisc;
    JLabel labelTarga;

    JTextField campoCognome, campoCodFisc, campoTarga;
    JLabel messaggioLabel, contaLabel, totLabel;
    Agenzia agenzia;

    MyFrame(Agenzia agenzia) {

        this.agenzia = new Agenzia();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 2, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Inserimento proprietario");
        this.getContentPane().setBackground(new Color(240, 248, 255));

        Font fontLabel = new Font("Arial", Font.BOLD, 14);
        Font fontField = new Font("Courier New", Font.PLAIN, 14);

        campoCognome = new JTextField();
        // campoCognome.setBounds(200, 50, 200, 30);
        campoCodFisc = new JTextField();
        // campoNome.setBounds(200, 90, 200, 30);
        campoTarga = new JTextField();
        // campoTel.setBounds(200, 130, 200, 30);

        labelCognome = new JLabel();
        labelCognome.setText("Cognome: ");
        labelCognome.setFont(fontLabel);
        // labelCognome.setBounds(50,50,100,30);
        labelCodFisc = new JLabel();
        labelCodFisc.setText("Codice Fiscale: ");
        labelCodFisc.setFont(fontLabel);
        // labelNome.setBounds(50,90,100,30);
        labelTarga = new JLabel();
        labelTarga.setText("Targa: ");
        labelTarga.setFont(fontLabel);

        // labelTel.setBounds(50,130,100,30);

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        conferma = new JButton("Conferma");
        conferma.setFont(new Font("Verdana", Font.BOLD, 12));
        conferma.addActionListener(this);
        // conferma.setBounds(150, 350, 100, 30);
        annula = new JButton("Annulla");
        annula.setFont(new Font("Verdana", Font.BOLD, 12));
        annula.addActionListener(this);
        // annula.setBounds(300, 350, 100, 30);

        messaggioLabel = new JLabel(" ", JLabel.CENTER);
        messaggioLabel.setFont(new Font("Arial", Font.ITALIC, 12));

        contaLabel = new JLabel(" ", JLabel.CENTER);
        totLabel = new JLabel(" ", JLabel.CENTER);

        this.add(labelCognome);
        this.add(campoCognome);
        this.add(labelCodFisc);
        this.add(campoCodFisc);
        this.add(labelTarga);
        this.add(campoTarga);

        this.add(new JLabel()); 

        panelButton.add(annula);
        panelButton.add(conferma);

        this.add(panelButton);
        this.add(messaggioLabel);
        this.add(contaLabel);
        this.add(totLabel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == conferma) {
            if (campoCognome.getText().isEmpty() || 
            campoCodFisc.getText().isEmpty() || 
            campoTarga.getText().isEmpty()) {
            
            messaggioLabel.setForeground(Color.RED);
            messaggioLabel.setText("Compila tutti i campi!");
            return; 
            }
            Proprietario p = new Proprietario(
                campoCognome.getText(),
                campoCodFisc.getText(),
                campoTarga.getText());

            if (agenzia.aggiungiProprietario(p)) {
                messaggioLabel.setForeground(new Color(0, 100, 0));
                messaggioLabel.setText("Proprietario registrato con successo!");
                
                int conteggio = agenzia.contaAutoPerProprietario(p.getCodFisc());
                contaLabel.setForeground(Color.BLUE);
                contaLabel.setText("Auto per questo proprietario: " + conteggio);
                
                totLabel.setForeground(Color.BLUE);
                totLabel.setText("Totale proprietari: " + agenzia.getTotaleProprietari());
                
                campoCognome.setText("");
                campoCodFisc.setText("");
                campoTarga.setText("");
            } else {
                messaggioLabel.setForeground(Color.RED);
                messaggioLabel.setText("ERRORE: Targa già presente!");
                contaLabel.setText("");
                totLabel.setText("");
            }
        }
        
        if (e.getSource() == annula) {
            campoCognome.setText("");
            campoCodFisc.setText("");
            campoTarga.setText("");

            messaggioLabel.setForeground(Color.DARK_GRAY);
            messaggioLabel.setText("Operazione annullata");
            contaLabel.setText("");
            totLabel.setText("");
        }
    }
}
