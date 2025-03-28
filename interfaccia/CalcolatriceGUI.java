import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalcolatriceGUI {

    private JFrame frame;
    private JTextField campoTesto;
    private Calcolatrice calcolatrice;

    private double risultato;
    private String operazione;
    private boolean nuovaOperazione;

    public CalcolatriceGUI() {
        calcolatrice = new Calcolatrice();
        risultato = 0;
        operazione = "";
        nuovaOperazione = true;

        frame = new JFrame("Calcolatrice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        campoTesto = new JTextField();
        campoTesto.setFont(new Font("Arial", Font.PLAIN, 24));
        campoTesto.setEditable(false);
        frame.add(campoTesto, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String testo : buttons) {
            JButton button = new JButton(testo);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
    }

    public void mostra() {
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            if ("1234567890.".contains(comando)) {
                if (nuovaOperazione) {
                    campoTesto.setText(comando);
                    nuovaOperazione = false;
                } else {
                    campoTesto.setText(campoTesto.getText() + comando);
                }
            } else if (comando.equals("=")) {
                double num2 = Double.parseDouble(campoTesto.getText());
                switch (operazione) {
                    case "+":
                        risultato = calcolatrice.somma(risultato, num2);
                        break;
                    case "-":
                        risultato = calcolatrice.sottrai(risultato, num2);
                        break;
                    case "*":
                        risultato = calcolatrice.moltiplica(risultato, num2);
                        break;
                    case "/":
                        try {
                            risultato = calcolatrice.dividi(risultato, num2);
                        } catch (ArithmeticException ex) {
                            campoTesto.setText("Errore");
                            return;
                        }
                        break;
                }
                campoTesto.setText(String.valueOf(risultato));
                operazione = "";
                nuovaOperazione = true;
            } else {
                if (!operazione.isEmpty())
                    return;
                operazione = comando;
                risultato = Double.parseDouble(campoTesto.getText());
                nuovaOperazione = true;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcolatriceGUI calcolatriceGUI = new CalcolatriceGUI();
            calcolatriceGUI.mostra();
        });
    }
}
