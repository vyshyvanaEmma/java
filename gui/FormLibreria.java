package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormLibreria extends JFrame implements ActionListener {

    Libreria libreria;

    JButton conferma, annulla;
    JLabel labelTitolo, labelCodISBN, labelPrezzo, labelT;
    JTextField fieldTitolo, fieldCOdISBN, fieldPrezzo;
    JTextArea messaggiArea;

    FormLibreria() {
        libreria = new Libreria();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(20, 20));
        this.setSize(500, 500);
        this.setTitle("Catalogo Libreria");
        this.getContentPane().setBackground(new Color(245, 245, 245));

        // Titolo
        labelT = new JLabel("CATALOGO LIBRERIA", JLabel.CENTER);
        labelT.setFont(new Font("Segoe UI", Font.BOLD, 24));
        labelT.setForeground(new Color(30, 30, 30));
        this.add(labelT, BorderLayout.NORTH);

        // Dati input
        JPanel datiPanel = new JPanel(new GridLayout(3, 2, 15, 15));
        datiPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        datiPanel.setBackground(new Color(245, 245, 245));

        labelCodISBN = new JLabel("Codice ISBN");
        fieldCOdISBN = new JTextField();

        labelTitolo = new JLabel("Titolo");
        fieldTitolo = new JTextField();

        labelPrezzo = new JLabel("Prezzo");
        fieldPrezzo = new JTextField();

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 16);
        labelCodISBN.setFont(labelFont);
        labelTitolo.setFont(labelFont);
        labelPrezzo.setFont(labelFont);

        datiPanel.add(labelCodISBN);
        datiPanel.add(fieldCOdISBN);
        datiPanel.add(labelTitolo);
        datiPanel.add(fieldTitolo);
        datiPanel.add(labelPrezzo);
        datiPanel.add(fieldPrezzo);

        this.add(datiPanel, BorderLayout.CENTER);

        // Bottoni
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        buttonPanel.setBackground(new Color(245, 245, 245));

        conferma = createButton("Conferma", new Color(56, 142, 60));
        annulla = createButton("Annulla", new Color(211, 47, 47));

        buttonPanel.add(conferma);
        buttonPanel.add(annulla);

        // Area messaggi
        messaggiArea = new JTextArea(4, 40);
        messaggiArea.setEditable(false);
        messaggiArea.setOpaque(false);
        messaggiArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        messaggiArea.setForeground(new Color(33, 33, 33));
        messaggiArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Sud
        JPanel sudPanel = new JPanel(new BorderLayout());
        sudPanel.setBackground(new Color(245, 245, 245));
        sudPanel.add(buttonPanel, BorderLayout.NORTH);
        sudPanel.add(messaggiArea, BorderLayout.SOUTH);

        this.add(sudPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    private JButton createButton(String text, Color bgColor) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setBackground(bgColor);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == conferma) {
            String isbn = fieldCOdISBN.getText().trim();
            String titolo = fieldTitolo.getText().trim();
            String prezzoStr = fieldPrezzo.getText().trim();

            if (isbn.isEmpty() || titolo.isEmpty() || prezzoStr.isEmpty()) {
                messaggiArea.setForeground(new Color(211, 47, 47)); // rosso
                messaggiArea.setText("Tutti i campi sono obbligatori.");
                return;
            }

            if (!isNumeroValido(prezzoStr)) {
                messaggiArea.setForeground(new Color(211, 47, 47));
                messaggiArea.setText("Il prezzo deve essere un numero positivo (usa il punto per i decimali).");
                return;
            }

            double prezzo = Double.parseDouble(prezzoStr);
            if (prezzo <= 0) {
                messaggiArea.setForeground(new Color(211, 47, 47));
                messaggiArea.setText("Il prezzo deve essere maggiore di zero.");
                return;
            }

            Libro l = new Libro(isbn, titolo, prezzo);
            libreria.addPrenotazione(l);

            int copie = libreria.numStessoISBN(l);
            int totale = libreria.getLibri().size();

            messaggiArea.setForeground(new Color(56, 142, 60)); // verde
            mostraMessaggi(isbn, copie, totale);

        } else if (e.getSource() == annulla) {
            fieldCOdISBN.setText("");
            fieldTitolo.setText("");
            fieldPrezzo.setText("");
            messaggiArea.setForeground(new Color(100, 100, 100));
            messaggiArea.setText("Campi cancellati.");
        }
    }

    private void mostraMessaggi(String isbn, int copie, int totale) {
        String testo = "";
        testo += "Codice libro inserito:  " + isbn + "\n";
        testo += "Copie del libro presenti in libreria:  " + copie + "\n";
        testo += "Libri totali inseriti:  " + totale;
        messaggiArea.setText(testo);
    }

    private boolean isNumeroValido(String s) {
        if (s == null || s.isEmpty()) return false;
        int punti = 0;
        for (char c : s.toCharArray()) {
            if (c == '.') punti++;
            else if (!Character.isDigit(c)) return false;
        }
        return punti <= 1;
    }
}
