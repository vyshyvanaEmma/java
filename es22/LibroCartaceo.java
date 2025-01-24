
class LibroCartaceo extends Libro {
    private double peso;
    private boolean copertinaRigida;
    private int quantitaInMagazzino;

    public LibroCartaceo(double peso, boolean copertinaRigida, String nome, String cognome, String codiceFiscale, String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita, int quantitaInMagazzino) {
        super(nome, cognome, codiceFiscale, titolo, isbn, annoPubblicazione, casaEditrice, prezzoDiVendita);
        this.peso = peso;
        this.copertinaRigida = copertinaRigida;
        this.quantitaInMagazzino = quantitaInMagazzino;
    }

    public int getQuantitaInMagazzino() {
        return quantitaInMagazzino;
    }

    public void setQuantitaInMagazzino(int quantitaInMagazzino) {
        this.quantitaInMagazzino = quantitaInMagazzino;
    }
}