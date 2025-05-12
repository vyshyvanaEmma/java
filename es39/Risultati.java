package es39;

import javax.swing.*;
import java.awt.*;

public class Risultati extends JFrame {
    
    public Risultati(Amministrazione amministrazione) {
        setTitle("Risultati Valutazioni");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        addStat(mainPanel, "Voti massimi (9):", amministrazione.contaVotiMax() + "");
        addStat(mainPanel, "Voti femmine:", amministrazione.contaVotF() + "");
        addStat(mainPanel, "Voti maschi:", amministrazione.contaVotM() + "");
        addStat(mainPanel, "Media femmine:", String.format("%.2f", amministrazione.mediaVotiF()));
        addStat(mainPanel, "Media maschi:", String.format("%.2f", amministrazione.mediaVotiM()));
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void addStat(JPanel panel, String label, String value) {
        JLabel lbl = new JLabel(label);
        JLabel val = new JLabel(value);
        val.setHorizontalAlignment(JLabel.RIGHT);
        
        panel.add(lbl);
        panel.add(val);
    }
}