package es39;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener, ChangeListener {
    
    private JRadioButton femminaBtn, maschioBtn;
    private JSlider votoSlider;
    private JLabel votoLabel, messaggioLabel;
    private Amministrazione amministrazione;
    
    public MyFrame(Amministrazione amministrazione) {
        this.amministrazione = amministrazione;
        
        setTitle("Inserisci Valutazione");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Pannello sesso
        JPanel sessoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sessoPanel.add(new JLabel("Sesso:"));
        
        ButtonGroup sessoGroup = new ButtonGroup();
        femminaBtn = new JRadioButton("Femmina");
        maschioBtn = new JRadioButton("Maschio");
        
        sessoGroup.add(femminaBtn);
        sessoGroup.add(maschioBtn);
        
        sessoPanel.add(femminaBtn);
        sessoPanel.add(maschioBtn);
        
        // Pannello voto
        JPanel votoPanel = new JPanel(new BorderLayout());
        votoLabel = new JLabel("Voto: 5", JLabel.CENTER);
        
        votoSlider = new JSlider(1, 9, 5);
        votoSlider.setMajorTickSpacing(2);
        votoSlider.setMinorTickSpacing(1);
        votoSlider.setPaintTicks(true);
        votoSlider.setPaintLabels(true);
        votoSlider.addChangeListener(this);
        
        votoPanel.add(votoLabel, BorderLayout.NORTH);
        votoPanel.add(votoSlider, BorderLayout.CENTER);
        
        // Pulsante invio
        JButton invioBtn = new JButton("Invia Valutazione");
        invioBtn.addActionListener(this);
        
        // Messaggio
        messaggioLabel = new JLabel(" ", JLabel.CENTER);
        messaggioLabel.setForeground(Color.RED);
        
        mainPanel.add(sessoPanel);
        mainPanel.add(votoPanel);
        mainPanel.add(invioBtn);
        mainPanel.add(messaggioLabel);
        
        add(mainPanel);
        setVisible(true);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        votoLabel.setText("Voto: " + votoSlider.getValue());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (!femminaBtn.isSelected() && !maschioBtn.isSelected()) {
            messaggioLabel.setText("Seleziona un sesso!");
            return;
        }
        
        char sesso = femminaBtn.isSelected() ? 'f' : 'm';
        int voto = votoSlider.getValue();
        
        amministrazione.aggiungiVoto(new Voto(voto, sesso));
        messaggioLabel.setForeground(Color.BLUE);
        messaggioLabel.setText("Grazie per la tua valutazione!");
    }
}