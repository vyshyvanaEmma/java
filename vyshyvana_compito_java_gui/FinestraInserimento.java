
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FinestraInserimento extends JFrame implements ActionListener {

    Campionato campionato;
    JButton conferma, annulla;
    JLabel codFisc, numGoal, nomeSquadra, titolo, messaggio;
    JTextField fieldCodFisc, fieldNumGoal, fieldNomeSquadra;

    FinestraInserimento() {
        campionato = new Campionato();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(20, 20));
        this.setSize(500, 500);
        this.setTitle("Gestione giocatori di calcio di un campionato");

        Color sfonfoColor = new Color(240, 230, 224, 220);

        this.getContentPane().setBackground(sfonfoColor);

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 16);
        Font titoloFont = new Font("MV Boli", Font.PLAIN, 24);

        Color titoloColor = new Color(120, 120, 230, 250);

        titolo = new JLabel("I DATI DEL CALCIATORE", JLabel.CENTER);
        titolo.setFont(titoloFont);
        titolo.setForeground(titoloColor);
        this.add(titolo, BorderLayout.NORTH);

        JPanel datiPanel = new JPanel(new GridLayout(3, 2, 15, 15));
        datiPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        Color datiColor = new Color(100, 140, 80, 110);
        datiPanel.setBackground(datiColor);

        codFisc = new JLabel("Codice fiscale: ");
        fieldCodFisc = new JTextField();

        numGoal = new JLabel("N° goal: ");
        fieldNumGoal = new JTextField();

        nomeSquadra = new JLabel("Nome squadra: ");
        fieldNomeSquadra = new JTextField();

        codFisc.setFont(labelFont);
        numGoal.setFont(labelFont);
        nomeSquadra.setFont(labelFont);

        datiPanel.add(codFisc);
        datiPanel.add(fieldCodFisc);
        datiPanel.add(numGoal);
        datiPanel.add(fieldNumGoal);
        datiPanel.add(nomeSquadra);
        datiPanel.add(fieldNomeSquadra);

        this.add(datiPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));
        Color buttonsColor = new Color(100, 140, 200, 110);
        buttonPanel.setBackground(buttonsColor);

        Color confermaColor = new Color(56, 142, 60);
        Color annullaColor = new Color(211, 47, 47);

        conferma = creaBottonne("Conferma", confermaColor);
        annulla = creaBottonne("Annulla", annullaColor);

        buttonPanel.add(conferma);
        buttonPanel.add(annulla);

        messaggio = new JLabel(" ");
        messaggio.setFont(labelFont);
        messaggio.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel sudPanel = new JPanel(new BorderLayout());
        sudPanel.setBackground(new Color(245, 245, 245));
        sudPanel.add(buttonPanel, BorderLayout.NORTH);
        sudPanel.add(messaggio, BorderLayout.SOUTH);

        this.add(sudPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    private JButton creaBottonne(String text, Color colore) {
        JButton btn = new JButton(text);
        Font buttonFont = new Font("Consolas", Font.PLAIN, 24);
        btn.setFont(buttonFont);
        btn.setBackground(colore);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == conferma) {
            String codFiscString = fieldCodFisc.getText();
            String numGoalString = fieldNumGoal.getText();
            String nomeSquadraString = fieldNomeSquadra.getText();

            if (codFiscString.isEmpty() || numGoalString.isEmpty() || nomeSquadraString.isEmpty()) {
                messaggio.setForeground(Color.RED);
                messaggio.setText("Tutti i campi sono obbligatori.");
                return;
            }

            if (!isNumeroValido(numGoalString)) {
                messaggio.setForeground(Color.RED);
                messaggio.setText("Il prezzo deve essere un numero positivo");
                return;
            }

            int numeroGoal = Integer.parseInt(numGoalString);

            if (numeroGoal < 0) {
                messaggio.setForeground(Color.RED);
                messaggio.setText("Il numero di goal deve essere un valore positivo");
                return;
            }

            Calciatore c = new Calciatore(codFiscString, nomeSquadraString, numeroGoal);

            new Risultati(campionato, c);

        } else if (e.getSource() == annulla) {
            fieldCodFisc.setText("");
            fieldNumGoal.setText("");
            fieldNomeSquadra.setText("");
            messaggio.setForeground(Color.GREEN);
            messaggio.setText("Campi cancellati.");
        }
    }

    private boolean isNumeroValido(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
