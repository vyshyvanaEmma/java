
public class Libro {
    private String autore;
    private String titolo;
    private String isbn;
    private int annoPublicazione;
    private String casaEditrice;
    private double prezzoDiVendita;

    public Libro(String autore, String titolo, String isbn, int annoPublicazione, String casaEditrice,
            double prezzoDiVendita) {
        this.autore = autore;
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPublicazione = annoPublicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
    }

    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getAnnoPublicazione() {
        return annoPublicazione;
    }
    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }
    public String getCasaEditrice() {
        return casaEditrice;
    }
    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }
    public double getPrezzoDiVendita() {
        return prezzoDiVendita;
    }
    public void setPrezzoDiVendita(double prezzoDiVendita) {
        this.prezzoDiVendita = prezzoDiVendita;
    }

    @Override
    public String toString() {
        return titolo + " (ISBN: " + isbn + ")";
    }

}
