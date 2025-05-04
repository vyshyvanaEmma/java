//package es37(viaggio);

import javax.swing.JFrame;

public class PrenotazioneGUI {
    public static void main(String[] args) {
        GestionePrenotazioni gest = new GestionePrenotazioni();
        JFrame frm = new JFrame("Prenotazione Biglietti");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(400, 500);
        FormPrenotazioni form = new FormPrenotazioni(gest);
        frm.add(form);
        frm.setVisible(true); 
    }
}
