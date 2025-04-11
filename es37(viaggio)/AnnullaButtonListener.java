//package es37(viaggio);
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnnullaButtonListener implements ActionListener{
    private JTextField cognomeField, nomeField, telField, partField, destField, dataField;
    private JLabel messaggioLabel;
    
    public AnnullaButtonListener(JTextField cognomeField, JTextField nomeField, JTextField telField,
            JTextField partField, JTextField destField, JTextField dataField, JLabel messaggioLabel) {
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
        cognomeField.setText(" ");
        nomeField.setText(" ");
        telField.setText(" ");
        partField.setText(" ");
        destField.setText(" ");
        dataField.setText(" ");
        messaggioLabel.setText("Prenotazione anulata");
        messaggioLabel.setForeground(Color.BLUE);
    }

    
}
