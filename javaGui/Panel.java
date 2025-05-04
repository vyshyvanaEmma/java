package javaGui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Panel {
    public static void main(String[] args) {
        //Panel

        ImageIcon icon = new ImageIcon("images.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 75,75);

        //panel creation
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
        //add label to a panel
        bluePanel.add(label);
        //add panel
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
