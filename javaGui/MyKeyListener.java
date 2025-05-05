package javaGui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyKeyListener() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("images.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setIcon(icon);
        //label.setBackground(Color.RED);
        //label.setOpaque(true);

        this.getContentPane().setBackground(Color.BLACK); // set background color of frame to black
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // char
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // int 
        //use codes of keys 
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY() );
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar()); // stamp a insert char in terminal
        System.out.println("You released key code: " + e.getKeyCode()); // stamp a number of char in terminal
    }

}
