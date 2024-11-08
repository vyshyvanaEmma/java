package es10;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Ordine {
    private int codiceOrdine;
    private GregorianCalendar dataOrdine;
    private ArrayList<DettaglioOrdine> dettagli;

    public Ordine(int codiceOrdine, GregorianCalendar dataOrdine, DettaglioOrdine dettagli) {
        this.codiceOrdine = codiceOrdine;
        this.dataOrdine = dataOrdine;
        this.dettagli = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordine Codice: ").append(codiceOrdine).append("\n");
        sb.append("Data: ").append(data.getTime()).append("\n");
        sb.append("Dettagli:\n");
        for (DettaglioOrdine dettaglio : dettagli) {
            sb.append(dettaglio.toString()).append("\n");
        }
        return sb.toString();
    }

    public boolean aggiungiAdOrdine(DettaglioOrdine a){
        return dettagli.add(a);
    }

    public void eliminaDaOrdine(int codiceProdotto) {
        for (int i = 0; i < dettagli.size(); i++) {
            if (dettagli.get(i).getProdotto().getCodice() == codiceProdotto) {
                dettagli.remove(i);
                break;
            }
        }
    }

    public void modificaOrdine(int codiceProdotto, int nuovaQuantità) {
        for (DettaglioOrdine dettaglio : dettagli) {
            if (dettaglio.getProdotto().getCodice() == codiceProdotto) {
                dettaglio.setQuantita(nuovaQuantità);
                break;
            }
        }
    }


    public float calcolaTotale() {
        float totale = 0.0f;
        for (DettaglioOrdine dettaglio : dettagli) {
            totale += dettaglio.getProdotto().getPrezzo() * dettaglio.getQuantita();
        }
        return totale;
    }

    public float calcolaTotale(float sconto) {
        float totale = calcolaTotale();
        return totale * (1 - sconto / 100);
    }

    public void stampaDescrizioneOrdine() {
        System.out.println(this.toString());
    }
}

    

    public int getCodiceOrdine() {
        return codiceOrdine;
    }
    public void setCodiceOrdine(int codiceOrdine) {
        this.codiceOrdine = codiceOrdine;
    }
    public GregorianCalendar getDataOrdine() {
        return dataOrdine;
    }
    public void setDataOrdine(GregorianCalendar dataOrdine) {
        this.dataOrdine = dataOrdine;
    }
    public DettaglioOrdine getDettagli() {
        return dettagli;
    }
    public void setDettagli(DettaglioOrdine dettagli) {
        this.dettagli = dettagli;
    }
    
}
