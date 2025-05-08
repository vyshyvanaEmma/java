package es37Viaggio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPrenotazioni extends JFrame implements ActionListener {

    private JButton conferma, annulla;
    private JTextField campoCognome, campoNome, campoTel, campoCittaPart, campoCittaDest, campoData;
    private JLabel labelCognome, labelNome, labelTel, labelCittaPart, labelCittaDest, labelData, messaggioLabel;
    private GestPrenotazioni gestPrenotazioni;

    FormPrenotazioni() {
        this.gestPrenotazioni = new GestPrenotazioni();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(10, 2, 10, 10));
        this.setSize(600, 500);
        this.setTitle("Prenotazione Biglietto");
        this.getContentPane().setBackground(new Color(240, 248, 255));

        JLabel titolo = new JLabel("Prenota il tuo biglietto", JLabel.CENTER);
        titolo.setFont(new Font("Arial", Font.BOLD, 20));
        titolo.setForeground(new Color(70, 70, 70));

        campoCognome = new JTextField();
        campoNome = new JTextField();
        campoTel = new JTextField();
        campoCittaPart = new JTextField();
        campoCittaDest = new JTextField();
        campoData = new JTextField();

        Font fontLabel = new Font("Arial", Font.BOLD, 14);

        labelCognome = new JLabel("Cognome: ");
        labelCognome.setFont(fontLabel);
        
        labelNome = new JLabel("Nome: ");
        labelNome.setFont(fontLabel);
        
        labelTel = new JLabel("Telefono: ");
        labelTel.setFont(fontLabel);
        
        labelCittaPart = new JLabel("Città Partenza: ");
        labelCittaPart.setFont(fontLabel);
        
        labelCittaDest = new JLabel("Città Destinazione: ");
        labelCittaDest.setFont(fontLabel);
        
        labelData = new JLabel("Data (gg/mm/aaaa): ");
        labelData.setFont(fontLabel);

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        conferma = new JButton("Conferma");
        conferma.setFont(new Font("Verdana", Font.BOLD, 12));
        conferma.addActionListener(this);

        annulla = new JButton("Annulla");
        annulla.setFont(new Font("Verdana", Font.BOLD, 12));
        annulla.addActionListener(this);

        messaggioLabel = new JLabel(" ", JLabel.CENTER);
        messaggioLabel.setFont(new Font("Arial", Font.ITALIC, 14));

        this.add(titolo);
        this.add(labelCognome);
        this.add(campoCognome);
        this.add(labelNome);
        this.add(campoNome);
        this.add(labelTel);
        this.add(campoTel);
        this.add(labelCittaPart);
        this.add(campoCittaPart);
        this.add(labelCittaDest);
        this.add(campoCittaDest);
        this.add(labelData);
        this.add(campoData);
        this.add(new JLabel());
        this.add(new JLabel());
        panelButton.add(annulla);
        panelButton.add(conferma);
        this.add(panelButton);
        this.add(messaggioLabel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == conferma) {
            if (campoNome.getText().isEmpty() || campoCognome.getText().isEmpty()
                    || campoTel.getText().isEmpty() || campoCittaPart.getText().isEmpty()
                    || campoCittaDest.getText().isEmpty() || campoData.getText().isEmpty()) {

                messaggioLabel.setForeground(Color.RED);
                messaggioLabel.setText("Compila tutti i campi!");
                return;
            }

            Prenotazione p = new Prenotazione(
                    campoCognome.getText(),
                    campoNome.getText(),
                    campoTel.getText(),
                    campoCittaPart.getText(),
                    campoCittaDest.getText(),
                    campoData.getText());

            if (gestPrenotazioni.aggiungiPrenotazione(p)) {
                int numPrenotazioni = gestPrenotazioni.contaPrenotazioniPerData(p.getData());
                messaggioLabel.setForeground(new Color(0, 100, 0));
                messaggioLabel.setText("Prenotazione registrata! Prenotazioni in data " + 
                                     p.getData() + ": " + numPrenotazioni);
            } else {
                messaggioLabel.setForeground(Color.RED);
                messaggioLabel.setText("Errore durante la registrazione!");
            }

        } else if (e.getSource() == annulla) {
            campoCognome.setText("");
            campoNome.setText("");
            campoTel.setText("");
            campoCittaPart.setText("");
            campoCittaDest.setText("");
            campoData.setText("");

            messaggioLabel.setForeground(Color.DARK_GRAY);
            messaggioLabel.setText("Prenotazione annullata");
        }
    }
}