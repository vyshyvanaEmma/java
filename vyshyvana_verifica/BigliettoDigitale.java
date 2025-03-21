//package vyshyvana_verifica;
public class BigliettoDigitale extends Biglietto{
    private String emailSpedizione;

    public BigliettoDigitale(String codiceBiglietto, double prezzoDiVendita, int quantitaPosti, String titoloSpettacolo, String emailSpedizione) {
        super(codiceBiglietto, prezzoDiVendita, quantitaPosti, titoloSpettacolo);
        this.emailSpedizione = emailSpedizione;
    }

    public String getEmailSpedizione() {
        return emailSpedizione;
    }

    public void setEmailSpedizione(String emailSpedizione) {
        this.emailSpedizione = emailSpedizione;
    }
        @Override
    public String toString() {
        return "Biglietto - titolo di spettacolo:" + getTitoloSpettacolo() + ", codice del biglietto:" + getCodiceBiglietto() + ", quantita posti " + getQuantitaPosti() + ", prezzo di vendita" + getPrezzoDiVendita() + ", email di spedizione" + emailSpedizione + "\n";
    }
}