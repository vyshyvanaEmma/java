package javaGui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener extends JFrame implements MouseListener{

    JLabel label;

    MyMouseListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse"); //when you clicked the mouse
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse"); //when you hold the mouse
        label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse"); //when you released the mouse
        label.setBackground(Color.GREEN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component"); //when you entered the component
        label.setBackground(Color.BLUE);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component"); //when you exited the component (enter and live)
        label.setBackground(Color.RED);
        
    }
}
