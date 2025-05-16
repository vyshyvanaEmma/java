
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Risultati extends JFrame {
    
    public Risultati(Campionato campionato, Calciatore c) {

        this.setTitle("Risultati di inserimento del calciattore");
        this.setSize(1000, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        if(campionato.aggiungiGiocatore(c)){
            aggiungiStat(mainPanel, "Il giocatore è stato aggiunto", "SI");
        } else{
            aggiungiStat(mainPanel, "Il giocatore è stato aggiunto", "NO");
        }
        aggiungiStat(mainPanel, "Numero di calciattori della stessa squadra", campionato.numCalciatoriStessaSquadra(c) + ", del giocatore: " + c.getCodFiscCalc() + ", di squadra: " + c.getNomeSquadra());
        aggiungiStat(mainPanel, "Il totale di tutti i calciatori", campionato.totGoal() + " ");
        
        this.add(mainPanel);
        this.setVisible(true);
    }
    
    private void aggiungiStat(JPanel panel, String label, String value) {
        JLabel lbl = new JLabel(label);
        Font stileFont = new Font("Consolas", Font.PLAIN, 14);
        lbl.setFont(stileFont);
        Color stileColor = new Color(120, 120, 230, 220);
        lbl.setForeground(stileColor);
        JLabel val = new JLabel(value);
        Font risFont = new Font("Consolas", Font.PLAIN, 14);
        val.setFont(risFont);
        Color risColor = new Color(170, 220, 80, 200);
        val.setForeground(risColor);
        val.setHorizontalAlignment(JLabel.CENTER);
        
        panel.add(lbl);
        panel.add(val);
    }
}