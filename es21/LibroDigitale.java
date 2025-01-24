public class LibroDigitale extends Libro {
    private int dimensioni;
    private String estensioneFile;

    public LibroDigitale(String nome, String cognome, String codFiscale, String titolo, String isbn, int annoPublicazione,
                         String casaEditrice, double prezzoDiVendita, int dimensioni, String estensioneFile) {
        super(nome, cognome, codFiscale, titolo, isbn, annoPublicazione, casaEditrice, prezzoDiVendita);
        this.dimensioni = dimensioni;
        this.estensioneFile = estensioneFile;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public String getEstensioneFile() {
        return estensioneFile;
    }

    @Override
    public String getDettagliSpecifici() {
        return "Dimensioni: " + dimensioni + "KB, Estensione file: " + estensioneFile;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}