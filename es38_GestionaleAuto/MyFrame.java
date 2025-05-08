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
    JLabel labelNome;
    JLabel labelTel;
    JLabel labelCittaPart;
    JLabel labelCittaDest;
    JLabel labelData;

    private JTextField campoCognome, campoNome, campoTel, campoCittaPart, campoCittaDest, campoData;
    private JLabel messaggioLabel;
    private ArrayList<Prenotazione> prenotazioni = new ArrayList<>();;
    private int numPrenotazioni = 0;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 2, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Prenota il biglietto");
        this.getContentPane().setBackground(Color.MAGENTA);

        campoCognome = new JTextField();
        // campoCognome.setBounds(200, 50, 200, 30);
        campoNome = new JTextField();
        // campoNome.setBounds(200, 90, 200, 30);
        campoTel = new JTextField();
        // campoTel.setBounds(200, 130, 200, 30);
        campoCittaPart = new JTextField();
        // campoCIttaPart.setBounds(200, 170, 200, 30);
        campoCittaDest = new JTextField();
        // campoCIttaDest.setBounds(200, 210, 200, 30);
        campoData = new JTextField();
        // campoData.setBounds(200, 250, 200, 30);

        labelCognome = new JLabel();
        labelCognome.setText("Cognome: ");
        // labelCognome.setBounds(50,50,100,30);
        labelNome = new JLabel();
        labelNome.setText("Nome: ");
        // labelNome.setBounds(50,90,100,30);
        labelTel = new JLabel();
        labelTel.setText("Telefono: ");
        // labelTel.setBounds(50,130,100,30);
        labelCittaPart = new JLabel();
        labelCittaPart.setText("Citta' Partenza: ");
        // labelCittaPart.setBounds(50,170,150,30);
        labelCittaDest = new JLabel();
        labelCittaDest.setText("Citta' Destinazione: ");
        // labelCittaDest.setBounds(50,210,150,30);
        labelData = new JLabel();
        labelData.setText("Data: ");
        // labelCittaDest.setBounds(50,250,100,30);

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));

        conferma = new JButton("Conferma");
        conferma.addActionListener(this);
        // conferma.setBounds(150, 350, 100, 30);
        annula = new JButton("Annulla");
        annula.addActionListener(this);
        // annula.setBounds(300, 350, 100, 30);

        messaggioLabel = new JLabel(" ", JLabel.CENTER);
        messaggioLabel.setBackground(Color.CYAN);
        messaggioLabel.setForeground(Color.GRAY);
        messaggioLabel.setFont(new Font("Arial", Font.BOLD, 15));
        

        this.add(new JLabel());
        this.add(messaggioLabel);
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

        panelButton.add(annula);
        panelButton.add(conferma);

        this.add(panelButton);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == conferma) {
            if (campoCognome.getText().isEmpty() || 
            campoNome.getText().isEmpty() || 
            campoTel.getText().isEmpty() || 
            campoCittaPart.getText().isEmpty() || 
            campoCittaDest.getText().isEmpty() || 
            campoData.getText().isEmpty()) {
            
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

            prenotazioni.add(p);
            numPrenotazioni++;

            int conta = 0;
            for (int i = 0; i < numPrenotazioni; i++) {
                if (prenotazioni.get(i).getData().equals(p.getData())) {
                    conta++;
                }
            }

            messaggioLabel.setForeground(Color.GREEN);
            messaggioLabel.setText("Prenotazione registrata, con numero: " + p.getData() + ": " + conta);
            labelCognome.setText("");
            labelNome.setText("");
            labelTel.setText("");
            labelCittaPart.setText("");
            labelCittaDest.setText("");
            labelData.setText("");
        }
        if (e.getSource() == annula) {
            campoCognome.setText("");
            campoNome.setText("");
            campoTel.setText("");
            campoCittaPart.setText("");
            campoCittaDest.setText("");
            campoData.setText("");

            messaggioLabel.setForeground(Color.DARK_GRAY);
            messaggioLabel.setText("Prenotazione annulata");
        }
    }
}
