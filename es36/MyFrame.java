package es36;

import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Calcolatrice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

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
        pannello.setLayout(new GridLayout(4, 4, 5, 5));

        String[] bottoni = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : bottoni) {
            JButton button = new JButton(text);
            pannello.add(button);
        }

        add(pannello, BorderLayout.CENTER);
        setVisible(true);
    }
}
