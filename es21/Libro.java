
public abstract class Libro implements Ordinabile, Cloneable, Comparable<Libro> {
    private Autore autore;
    private String titolo;
    private String isbn;
    private int annoPublicazione;
    private String casaEditrice;
    private double prezzoDiVendita;

    public Libro(String nome, String cognome, String codFiscale, String titolo, String isbn, int annoPublicazione, String casaEditrice, double prezzoDiVendita) {
        this.autore = new Autore(nome, cognome, codFiscale);
        this.titolo = titolo;
        this.isbn = isbn;
        this.annoPublicazione = annoPublicazione;
        this.casaEditrice = casaEditrice;
        this.prezzoDiVendita = prezzoDiVendita;
    }

    public Libro(Libro copyLibro) {
        this.autore = new Autore(copyLibro.getAutore());
        this.titolo = copyLibro.getTitolo();
        this.isbn = copyLibro.getIsbn();
        this.annoPublicazione = copyLibro.getAnnoPublicazione();
        this.casaEditrice = copyLibro.getCasaEditrice();
        this.prezzoDiVendita = copyLibro.getPrezzoDiVendita();
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

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public double getPrezzoDiVendita() {
        return prezzoDiVendita;
    }

    public abstract String getDettagliSpecifici();

    @Override
    public String toString() {
        return titolo + " (ISBN: " + isbn + ", Prezzo: " + prezzoDiVendita + "€)";
    }

    @Override
    public int compareTo(Libro altro) {
        return Double.compare(this.prezzoDiVendita, altro.prezzoDiVendita);
    }

    @Override
    public String getChiaveOrdinamento() {
        return titolo;
    }
    @Override
    public Object clone() {
        return new Libro(this); 
    }
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Libro(this); 
        }
    }


}
