package es37;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {
    private JTextField display;
    private StringBuilder inputCorrente;
    private double primoNum = 0;
    private String operazione;


    public ButtonListener(JTextField display) {
        this.display = display;
        this.inputCorrente = new StringBuilder();
    }

    private void calcola(){
        double ris = 0;
        double secondoNum = Double.parseDouble(display.getText());

        switch(operazione){
            case "+":
                ris = primoNum + secondoNum;
                break;
            case "-":
                ris = primoNum - secondoNum;
                break;
            case "*":
                ris = primoNum * secondoNum;
                break;
            case "/":
                ris = primoNum / secondoNum;
            default:
                System.out.println("Errore dell'operazione");
                break;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e){
        JButton b = (JButton) e.getSource();
        String btnText = b.getText();

        if("+-*/".contains(btnText)){
            primoNum = Double.parseDouble(display.getText());
            operazione  = btnText;
            inputCorrente.setLength(0);
        } else if("=".equals(btnText)){
            calcola();
        } else{
            inputCorrente.append(btnText);
            display.setText(inputCorrente.toString());
        }
    }

    public void resetta(){
        inputCorrente.setLength(0);
        primoNum = 0;
        operazione = "";
        display.setText("0");
    }
}
