package es37;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    private JTextField display;
    private ButtonListener btnListener;
    private JTextArea storiaArea;

    public MyFrame() {

        setTitle("Calcolatrice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(0, 50));
        add(display, BorderLayout.NORTH); 

        storiaArea = new JTextArea(8, 30); 
        storiaArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(storiaArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Storia"));
        add(scrollPane, BorderLayout.SOUTH);

        btnListener = new ButtonListener(display, storiaArea); 

        JMenuBar menuBar = new JMenuBar();

        JMenu calcMenu = new JMenu("Calcolatrice");
        JMenuItem standartItem = new JMenuItem("Standart");
        JMenuItem scienceItem = new JMenuItem("Scientifica");
        JMenuItem rappItem = new JMenuItem("Rappresentazione grafica");
        JMenuItem progItem = new JMenuItem("Programmatore");
        JMenuItem dataItem = new JMenuItem("Calcolo della data");

        calcMenu.add(standartItem);
        calcMenu.add(scienceItem);
        calcMenu.add(rappItem);
        calcMenu.add(progItem);
        calcMenu.add(dataItem);

        JMenu convMenu = new JMenu("Convertitore");
        JMenuItem valutaItem = new JMenuItem("Valuta");
        JMenuItem volItem = new JMenuItem("Volume");
        JMenuItem lunghezzaItem = new JMenuItem("Lunghezza");
        JMenuItem pesoItem = new JMenuItem("Peso");
        JMenuItem tempItem = new JMenuItem("Temperatura");
        JMenuItem energiaItem = new JMenuItem("Energia");
        JMenuItem areaItem = new JMenuItem("Area");
        JMenuItem velocitaItem = new JMenuItem("Velocita");
        JMenuItem orarioItem = new JMenuItem("Orario");
        JMenuItem potenzaItem = new JMenuItem("Potenza");
        JMenuItem datiItem = new JMenuItem("Dati");
        JMenuItem pressioneItem = new JMenuItem("Pressione");
        JMenuItem angoloItem = new JMenuItem("Angolo");

        convMenu.add(valutaItem);
        convMenu.add(volItem);
        convMenu.add(lunghezzaItem);
        convMenu.add(pesoItem);
        convMenu.add(tempItem);
        convMenu.add(energiaItem);
        convMenu.add(areaItem);
        convMenu.add(velocitaItem);
        convMenu.add(orarioItem);
        convMenu.add(potenzaItem);
        convMenu.add(datiItem);
        convMenu.add(pressioneItem);
        convMenu.add(angoloItem);

        JMenu settingsMenu = new JMenu("Impostazioni");

        menuBar.add(calcMenu);
        menuBar.add(convMenu);
        menuBar.add(settingsMenu);

        setJMenuBar(menuBar);

        JPanel pannello = new JPanel();
        pannello.setLayout(new GridLayout(5, 4, 5, 5));

        String[] bottoni = {
            "%", "CE", "C", "⌫",
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        
        for (String testo : bottoni) {
            JButton btn = new JButton(testo);
            btn.setFont(new Font("Arial", Font.BOLD, 18));

            if ("C".equals(testo)) {
                btn.addActionListener(e -> btnListener.resetta());
            } else if ("⌫".equals(testo)) {
                btn.addActionListener(e -> {
                    String corrente = display.getText();
                    if (corrente.length() > 1) {
                        display.setText(corrente.substring(0, corrente.length() - 1));
                    } else {
                        display.setText("0");
                    }
                });
            } else {
                btn.addActionListener(btnListener);
            }

            pannello.add(btn);
        }

        add(pannello, BorderLayout.CENTER);
        setVisible(true);
    }
}
