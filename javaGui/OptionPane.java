package javaGui;

import javax.swing.JOptionPane;

public class OptionPane {
    public static void main(String[] args) {
        //JOption
        
       /* JOptionPane.showMessageDialog(null, "whis is some usels info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Here's more usels info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tour computer has a virus", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Call tech support now", "title", JOptionPane.ERROR_MESSAGE);
        */

        int answer = JOptionPane.showConfirmDialog(null, "do youu even code?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("What is your name?");

        
    }
}
