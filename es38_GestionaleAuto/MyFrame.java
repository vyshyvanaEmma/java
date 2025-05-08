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

    private JTextField campoCognome, campoCodFisc, campoTarga;
    private JLabel messaggioLabel;
    private ArrayList<Proprietario> proprietari = new ArrayList<>();;
    private int numPrenotazioni = 0;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(8, 2, 10, 10));
        this.setSize(500, 500);
        this.setTitle("Prenota il biglietto");
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        campoCognome = new JTextField();
        // campoCognome.setBounds(200, 50, 200, 30);
        campoCodFisc = new JTextField();
        // campoNome.setBounds(200, 90, 200, 30);
        campoTarga = new JTextField();
        // campoTel.setBounds(200, 130, 200, 30);

        labelCognome = new JLabel();
        labelCognome.setText("Cognome: ");
        // labelCognome.setBounds(50,50,100,30);
        labelCodFisc = new JLabel();
        labelCodFisc.setText("Nome: ");
        // labelNome.setBounds(50,90,100,30);
        labelTarga = new JLabel();
        labelTarga.setText("Telefono: ");
        // labelTel.setBounds(50,130,100,30);

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
        this.add(labelCodFisc);
        this.add(campoCodFisc);
        this.add(labelTarga);
        this.add(campoTarga);

        panelButton.add(annula);
        panelButton.add(conferma);

        this.add(panelButton);

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

            proprietari.add(p);
            numPrenotazioni++;

            messaggioLabel.setForeground(Color.GREEN);
            messaggioLabel.setText("Prenotazione registrata");
            labelCognome.setText("");
            labelCodFisc.setText("");
            labelTarga.setText("");
        }
        if (e.getSource() == annula) {
            campoCognome.setText("");
            campoCodFisc.setText("");
            campoTarga.setText("");

            messaggioLabel.setForeground(Color.DARK_GRAY);
            messaggioLabel.setText("Prenotazione annulata");
        }
    }
}
