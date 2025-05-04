//package es37(viaggio);
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class ConfermaButtonListener implements ActionListener{
    private GestionePrenotazioni gest;
    private JTextField cognomeField, nomeField, telField, partField, destField, dataField;
    private JLabel messaggioLabel;
    
    public ConfermaButtonListener(GestionePrenotazioni gest,JTextField cognomeField, JTextField nomeField, JTextField telField,
            JTextField partField, JTextField destField, JTextField dataField, JLabel messaggioLabel) {
        this.gest = gest;
        this.cognomeField = cognomeField;
        this.nomeField = nomeField;
        this.telField = telField;
        this.partField = partField;
        this.destField = destField;
        this.dataField = dataField;
        this.messaggioLabel = messaggioLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(cognomeField.getText().trim().isEmpty() ||
            nomeField.getText().trim().isEmpty()
            ||
            telField.getText().trim().isEmpty()
            ||
            partField.getText().trim().isEmpty()
            ||
            destField.getText().trim().isEmpty()
            ||
            dataField.getText().trim().isEmpty()
        ){
            messaggioLabel.setText("Errore. Tutti i campi devono essere inseriti");
            messaggioLabel.setForeground(Color.RED);
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date data;
        try{
            data = sdf.parse(dataField.getText().trim());

            if(data.before(new Date())){
                messaggioLabel.setText("errore, la data non puo esssere in passatto");
                messaggioLabel.setForeground(Color.RED);
                return;
            }
        } catch(ParseException ex){
                messaggioLabel.setText("Errore, formato della data non valido");
                messaggioLabel.setForeground(Color.RED);
                return;
        }

        Prenotazione nuovPrenotazione = new Prenotazione(nomeField.getText().trim(), cognomeField.getText().trim(),
        telField.getText().trim(), partField.getText().trim(), destField.getText().trim(), data);

        gest.aggiungiPrenot(nuovPrenotazione);
        int conta = gest.contaPrenotazioniPerData(dataField.getText());

        messaggioLabel.setText("Prenotazione registrata! ID: " + conta);
        messaggioLabel.setForeground(Color.GREEN);

        cognomeField.setText(" ");
        nomeField.setText(" ");
        telField.setText(" ");
        partField.setText(" ");
        destField.setText(" ");
        dataField.setText(" ");
    }

    
}
