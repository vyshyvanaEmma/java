package es37;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    private JTextField display;
    private ButtonListener btnListener;

    public MyFrame() {

        setTitle("Calcolatrice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField("0");
        display.setEditable(false);

        btnListener = new ButtonListener(display);

        JMenuBar menuBar = new JMenuBar();

        JMenu calcMenu = new JMenu("Calcolatrice");
        JMenuItem standartItem = new JMenuItem("Standart");
        JMenuItem scienceItem = new JMenuItem("Sscientifica");
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

        JTextField schermo = new JTextField();
        schermo.setEditable(false);
        add(schermo, BorderLayout.NORTH);

        JPanel pannello = new JPanel();
        pannello.setLayout(new GridLayout(5, 4, 5, 5));

        String[] bottoni = {
                "%", "CE", "C", "⌫",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "0", ".", "C", "="
        };

        for (String testo : bottoni) {
            JButton btn = new JButton(testo);

            if ("C".equals(testo)) {
                btn.addActionListener(e -> btnListener.resetta());
            } else if ("⌫".equals(testo)) {
                btn.addActionListener(e -> {
                    String corrente = display.getText();
                    if (corrente.length() > 1) {
                        display.setText(corrente.substring(0, corrente.length() - 1));
                    }
                });

            } else {
                btn.addActionListener(btnListener);
            }
            pannello.add(btn);

            btn.addActionListener(btnListener);

            add(pannello, BorderLayout.CENTER);
            setVisible(true);

        }

    }
}
