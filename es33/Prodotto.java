public class Prodotto {
    private String codice;

    public Prodotto(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    

    @Override
    public String toString() {
        return "Prodotto: codice=" + codice ;
    }

    

}
