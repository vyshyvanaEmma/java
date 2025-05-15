package gui;

public class Libro {
    private String codiceISBN, titolo;
    private double prezzo;

    public Libro(String codiceISBN, String titolo, double prezzo) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.prezzo = prezzo;
    }
    
    public String getCodiceISBN() {
        return codiceISBN;
    }
    public void setCodiceISBN(String codiceISBN) {
        this.codiceISBN = codiceISBN;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    
}
