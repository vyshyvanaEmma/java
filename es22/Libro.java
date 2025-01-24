
abstract class Libro implements Cloneable {
    private Autore autore;
    private String titolo;
    private String isbn;
    private int annoPubblicazione;
    private String casaEditrice;
    private double prezzoDiVendita;

    public Libro(String nome, String cognome, String codiceFiscale, String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita) {
        this.autore = new Autore(nome, cognome, codiceFiscale);
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPubblicazione = annoPubblicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
    }

    public Autore getAutore() {
        return autore;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}