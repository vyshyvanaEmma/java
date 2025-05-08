package es37Viaggio;

import java.util.ArrayList;

public class GestPrenotazioni {
    private ArrayList<Prenotazione> prenotazioni;

    public GestPrenotazioni() {
        this.prenotazioni = new ArrayList<>();
    }

    public boolean aggiungiPrenotazione(Prenotazione nuovo) {
        prenotazioni.add(nuovo);
        return true;
    }

    public int contaPrenotazioniPerData(String data) {
        int count = 0;
        for (Prenotazione p : prenotazioni) {
            if (p.getData().equalsIgnoreCase(data)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }
}