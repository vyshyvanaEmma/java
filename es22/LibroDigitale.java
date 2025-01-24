
class LibroDigitale extends Libro {
    private int dimensioni;
    private String estensioneFile;

    public LibroDigitale(String nome, String cognome, String codiceFiscale, String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita, int dimensioni, String estensioneFile) {
        super(nome, cognome, codiceFiscale, titolo, isbn, annoPubblicazione, casaEditrice, prezzoDiVendita);
        this.dimensioni = dimensioni;
        this.estensioneFile = estensioneFile;
    }
}