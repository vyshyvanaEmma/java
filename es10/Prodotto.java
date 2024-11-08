package es10;

public class Prodotto{
    private int codice;
    private String descrizione;
    private float prezzo;

    public Prodotto(int codice, String descrizione, float prezzo) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    @Override public String toString(){
        return "/nCodice: " + getCodice() + " Descrizione: " + getDescrizione() + " Prezzo: " + getPrezzo();
    }

    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public float getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    

}