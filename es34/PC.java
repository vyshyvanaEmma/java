public class PC extends Prodotto {
    private String descrizione;

    public PC(int codice, double peso, String descrizione) {
        super(codice, peso);
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "PC - descrizione=" + descrizione + " codice: " + getCodice() + " peso: " +getPeso() + "\n";
    }

}
