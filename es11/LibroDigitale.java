
public class LibroDigitale extends Libro{
    private int dimensioni;
    private String estensioniFile;
    
    public LibroDigitale(int dimensioni, String estensioniFile, String autore, String titolo, String isbn, int annoPublicazione, String casaEditrice,
    double prezzoDiVendita) {
        super(autore, titolo, isbn, annoPublicazione, casaEditrice, prezzoDiVendita);
        this.dimensioni = dimensioni;
        this.estensioniFile = estensioniFile;
    }
    
    public int getDimensioni() {
        return dimensioni;
    }
    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }
    public String getEstensioniFile() {
        return estensioniFile;
    }
    public void setEstensioniFile(String estensioniFile) {
        this.estensioniFile = estensioniFile;
    }

    @Override
    public String toString() {
        return super.toString() + " (Digitale, " + dimensioni + "KB, " + estensioniFile + ")";
    }
}
