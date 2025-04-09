package es37;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonListener implements ActionListener {
    private JTextField display;
    private JTextArea storiaArea;
    private StringBuilder inputCorrente;
    private double primoNum = 0;
    private String operazione;
    private boolean nuovoInput = true;

    public ButtonListener(JTextField display, JTextArea storiaArea) {
        this.display = display;
        this.storiaArea = storiaArea;
        this.inputCorrente = new StringBuilder();
    }

    private void aggiungiAllaStoria(String testo) {
        storiaArea.append(testo + "\n");
    }

    private void calcola() {
        double secondoNum;
        try {
            secondoNum = Double.parseDouble(display.getText());
        } catch (NumberFormatException e) {
            display.setText("Errore");
            aggiungiAllaStoria("Errore: input non valido");
            resetta();
            return;
        }

        double risultato = 0;
        String espressione = formattaNumero(primoNum) + " " + operazione + " " + formattaNumero(secondoNum);

        switch (operazione) {
            case "+":
                risultato = primoNum + secondoNum;
                break;
            case "-":
                risultato = primoNum - secondoNum;
                break;
            case "*":
                risultato = primoNum * secondoNum;
                break;
            case "/":
                if (secondoNum == 0) {
                    display.setText("Errore: div/0");
                    aggiungiAllaStoria(espressione + " = Errore (div/0)");
                    resetta();
                    return;
                }
                risultato = primoNum / secondoNum;
                break;
            case "%":
                risultato = primoNum % secondoNum;
                break;
            default:
                display.setText("Operazione non valida");
                return;
        }

        String risultatoStr = formattaNumero(risultato);
        display.setText(risultatoStr);
        aggiungiAllaStoria(espressione + " = " + risultatoStr);
        inputCorrente.setLength(0);
        inputCorrente.append(risultatoStr);
        nuovoInput = true;
        operazione = null;
    }

    private String formattaNumero(double numero) {
        if (numero == (long) numero)
            return String.format("%d", (long) numero);
        else
            return String.valueOf(numero);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton bottone = (JButton) e.getSource();
        String testo = bottone.getText();

        if ("+-*/%".contains(testo)) {
            if (inputCorrente.length() > 0) {
                primoNum = Double.parseDouble(display.getText());
                operazione = testo;
                nuovoInput = true;
            }
        } else if ("=".equals(testo)) {
            if (operazione != null && inputCorrente.length() > 0) {
                calcola();
            }
        } else if ("CE".equals(testo)) {
            aggiungiAllaStoria("Reset calcolatrice");
            resetta();
        } else if ("⌫".equals(testo)) {
            if (inputCorrente.length() > 0) {
                inputCorrente.deleteCharAt(inputCorrente.length() - 1);
                display.setText(inputCorrente.length() > 0 ? inputCorrente.toString() : "0");
            }
        } else {
            if (nuovoInput) {
                inputCorrente.setLength(0);
                nuovoInput = false;
            }

            if (".".equals(testo) && inputCorrente.toString().contains(".")) {
                return;
            }

            if ("0".equals(testo) && inputCorrente.length() == 0) {
                return;
            }

            inputCorrente.append(testo);
            display.setText(inputCorrente.toString());
        }
    }

    public void resetta() {
        inputCorrente.setLength(0);
        primoNum = 0;
        operazione = null;
        display.setText("0");
        nuovoInput = true;
    }
}
