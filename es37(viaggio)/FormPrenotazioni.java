//package es37(viaggio);

import java.awt.*;
import javax.swing.*;

public class FormPrenotazioni extends JPanel {
    public FormPrenotazioni(GestionePrenotazioni gest) {
        setSize(300, 400);
        setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Prenota il tuo biglietto!"));
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(creaPanelCampo("Cognome: ")); // funzione sotto
        JTextField cognomeField = new JTextField(20);
        centerPanel.add(cognomeField);

        centerPanel.add(creaPanelCampo("Nome: ")); // funzione sotto
        JTextField nomeField = new JTextField(20);
        centerPanel.add(nomeField);

        centerPanel.add(creaPanelCampo("Telefono: ")); // funzione sotto
        JTextField telField = new JTextField(20);
        centerPanel.add(telField);

        centerPanel.add(creaPanelCampo("Citta' di partenza: ")); // funzione sotto
        JTextField cittaPartField = new JTextField(20);
        centerPanel.add(cittaPartField);

        centerPanel.add(creaPanelCampo("Citta' di partenza: ")); // funzione sotto
        JTextField cittaDestField = new JTextField(20);
        centerPanel.add(cittaDestField);

        centerPanel.add(creaPanelCampo("Data (dd/MM/yyyy): ")); // funzione sotto
        JTextField dataField = new JTextField(20);
        centerPanel.add(dataField);

        add(centerPanel, BorderLayout.CENTER);

        JLabel messaggioLabel = new JLabel(" ");
        messaggioLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(messaggioLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton confermaButton = new JButton("Conferma");
        JButton annullaButton = new JButton("Annulla");

        confermaButton
                .addActionListener(new ConfermaButtonListener(gest, cognomeField, nomeField, telField, cittaPartField,
                        cittaDestField, dataField, messaggioLabel));

        annullaButton.addActionListener(new AnnullaButtonListener(cognomeField, nomeField, telField, cittaPartField,
                cittaDestField, dataField, messaggioLabel));

        buttonPanel.add(confermaButton);
        buttonPanel.add(annullaButton);
        add(buttonPanel, BorderLayout.SOUTH);

    }

    private JPanel creaPanelCampo(String labelTesto) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(labelTesto));
        return panel;
    }
}
