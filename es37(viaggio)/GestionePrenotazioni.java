
//package es37(viaggio);
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class GestionePrenotazioni {
    private ArrayList<Prenotazione> prenotazioni = new ArrayList<>();

    public GestionePrenotazioni() {
        this.prenotazioni = new ArrayList<Prenotazione>();
    }

    public boolean aggiungiPrenot(Prenotazione pren) {
        if (prenotazioni != null) {
            this.prenotazioni.add(pren);
            return true;
        }
        return false;
    }

    public int contaPrenotazioniPerData(String dataStr) {
        int conta = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            for (Prenotazione p : prenotazioni) {
                if (p.getData() != null) {
                    String dataPrenot = sdf.format(p.getData());
                    if (dataPrenot.equals(dataStr)) {
                        conta++;
                    }
                }
            }
        } catch (Exception ex) {
            return 0;
        }

        return conta;
    }

}
