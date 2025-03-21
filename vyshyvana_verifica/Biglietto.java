
public class Biglietto{
    private String titoloSpettacolo, codiceBiglietto;
    private int quantitaPosti;
    private double prezzoDiVendita;

    public Biglietto(String codiceBiglietto, double prezzoDiVendita, int quantitaPosti, String titoloSpettacolo) {
        this.codiceBiglietto = codiceBiglietto;
        this.prezzoDiVendita = prezzoDiVendita;
        this.quantitaPosti = quantitaPosti;
        this.titoloSpettacolo = titoloSpettacolo;
    }

    public String getTitoloSpettacolo() {
        return titoloSpettacolo;
    }

    public void setTitoloSpettacolo(String titoloSpettacolo) {
        this.titoloSpettacolo = titoloSpettacolo;
    }

    public String getCodiceBiglietto() {
        return codiceBiglietto;
    }

    public void setCodiceBiglietto(String codiceBiglietto) {
        this.codiceBiglietto = codiceBiglietto;
    }

    public int getQuantitaPosti() {
        return quantitaPosti;
    }

    public void setQuantitaPosti(int quantitaPosti) {
        this.quantitaPosti = quantitaPosti;
    }

    public double getPrezzoDiVendita() {
        return prezzoDiVendita;
    }

    public void setPrezzoDiVendita(double prezzoDiVendita) {
        this.prezzoDiVendita = prezzoDiVendita;
    }
    
    @Override
    public String toString() {
        return "Biglietto - titolo di spettacolo:" + titoloSpettacolo + ", codice del biglietto:" + codiceBiglietto + ", quantita posti " + quantitaPosti + ", prezzo di vendita" + prezzoDiVendita + "\n";
    }
    
}