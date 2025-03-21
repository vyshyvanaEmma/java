//package vyshyvana_verifica; 
public class BigliettoCartaceo extends Biglietto{
    private String indrizzo_spedizione;

    public BigliettoCartaceo(String codiceBiglietto, double prezzoDiVendita, int quantitaPosti, String titoloSpettacolo, String indrizzo_spedizione) {
        super(codiceBiglietto, prezzoDiVendita, quantitaPosti, titoloSpettacolo);
        this.indrizzo_spedizione = indrizzo_spedizione;

    }

    public String getIndrizzo_spedizione() {
        return indrizzo_spedizione;
    }

    public void setIndrizzo_spedizione(String indrizzo_spedizione) {
        this.indrizzo_spedizione = indrizzo_spedizione;
    }

    @Override
    public String toString() {
        return "Biglietto - titolo di spettacolo:" + getTitoloSpettacolo() + ", codice del biglietto:" + getCodiceBiglietto() + ", quantita posti " + getQuantitaPosti() + ", prezzo di vendita" + getPrezzoDiVendita() + ", indirizzo di spedizione" + indrizzo_spedizione + "\n";
    }
    
}