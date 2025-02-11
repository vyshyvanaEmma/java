package es25;

abstract class Libro{
    private String titolo;
    private String isbn;
    private int annoPubblicazione;
    private String casaEditrice;
    private double prezzoDiVendita;

    public Libro(String nome, String cognome, String codiceFiscale, String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita) {
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
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

}