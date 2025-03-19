public class Prodotto {
    private int codice;
    private double peso;

    public Prodotto(int codice, double peso) {
        this.codice = codice;
        this.peso = peso;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Prodotto - codice:" + codice + ", peso:" + peso + "\n";
    }
    
}
