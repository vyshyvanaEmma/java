package es39;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMainFrame extends JFrame implements ActionListener {
    
    private JButton utenteBtn, adminBtn;
    private Amministrazione amministrazione;
    
    public MyMainFrame() {
        amministrazione = new Amministrazione();
        
        setTitle("Valutazioni Museo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout(20, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        
        JLabel title = new JLabel("Sistema Valutazioni", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        mainPanel.add(title, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        
        utenteBtn = createButton("Modalità Utente");
        adminBtn = createButton("Modalità Amministratore");
        
        buttonPanel.add(utenteBtn);
        buttonPanel.add(adminBtn);
        
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        
        add(mainPanel);
    }
    
    private JButton createButton(String text) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Arial", Font.PLAIN, 14));
        btn.setBackground(new Color(240, 240, 240));
        btn.setFocusPainted(false);
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == utenteBtn) {
            new MyFrame(amministrazione);
        } else if (e.getSource() == adminBtn) {
            new Risultati(amministrazione);
        }
    }
    
}