
public class Libro {
    private Autore autore;

    private String titolo;
    private String isbn;
    private int annoPublicazione;
    private String casaEditrice;
    private double prezzoDiVendita;

    public Libro(String nome, String cognome, String codFiscale, String titolo, String isbn, int annoPublicazione, String casaEditrice,
            double prezzoDiVendita) {
        this.autore = new Autore(nome,cognome,codFiscale);
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPublicazione = annoPublicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
    }

    public Libro(Libro copyLibro){
        this.autore = new Autore(copyLibro.getAutore().getNome(),copyLibro.getAutore().getCognome(),copyLibro.getAutore().getCodFiscale());
        this.titolo = copyLibro.getTitolo();
        this.isbn = copyLibro.getIsbn();
        this.annoPublicazione = copyLibro.getAnnoPublicazione();
        this.casaEditrice = copyLibro.getCasaEditrice();
        this.prezzoDiVendita = copyLibro.getPrezzoDiVendita();
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
    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }
    @Override
    public String toString() {
        return titolo + " (ISBN: " + isbn + ")";
    }

}
