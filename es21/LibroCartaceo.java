public class LibroCartaceo extends Libro {
    private double peso;
    private boolean copertinaRigida;
    private int quantitaInMagazzino;

    public LibroCartaceo(double peso, boolean copertinaRigida, String nomeAutore, String cognomeAutore,
                         String codiceFiscaleAutore, String titolo, String isbn, int annoPubblicazione,
                         String casaEditrice, double prezzoDiVendita, int quantitaInMagazzino) {
        super(nomeAutore, cognomeAutore, codiceFiscaleAutore, titolo, isbn, annoPubblicazione, casaEditrice, prezzoDiVendita);
        this.peso = peso;
        this.copertinaRigida = copertinaRigida;
        this.quantitaInMagazzino = 1;
    }

    public void incrementaQuantita() {
        this.quantitaInMagazzino++;
    }

    public void decrementaQuantita() {
        if (this.quantitaInMagazzino > 0) {
            this.quantitaInMagazzino--;
        }
    }

    public int getQuantitaInMagazzino() {
        return quantitaInMagazzino;
    }

    public void setQuantitaInMagazzino(int quantitaInMagazzino) {
        this.quantitaInMagazzino = quantitaInMagazzino;
    }


    public double getPeso() {
        return peso;
    }

    public boolean isCopertinaRigida() {
        return copertinaRigida;
    }

    @Override
    public String getDettagliSpecifici() {
        return "Peso: " + peso + "kg, Copertina: " + (copertinaRigida ? "Rigida" : "Morbida");
    }

    @Override
    public  Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
