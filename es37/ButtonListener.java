package es37;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {
    private JTextField display;
    private StringBuilder inputCorrente;

    public ButtonListener(JTextField display) {
        this.display = display;
        this.inputCorrente = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
        String btnText = b.getText();

        inputCorrente.append(btnText);
        display.setText(inputCorrente.toString());

    }

    public void cancella(){
        inputCorrente.setLength(0);
        display.setText("0");
    }
}
