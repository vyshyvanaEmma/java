package es30;

public class Libro {
    private String titolo;
    private String isbn;
    private int annoPubblicazione;
    private String casaEditrice;
    private double prezzoDiVendita;
    private Autore autore;  

    public Libro(String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita, Autore autore) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
        this.autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public double getPrezzoDiVendita() {
        return prezzoDiVendita;
    }

    public Autore getAutore() {
        return autore;  
    }
}
