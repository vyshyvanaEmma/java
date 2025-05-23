

public class LibroCartaceo extends Libro{
    private double peso;
    private boolean copertinaRigida;
    private static int qtainMagazzino = 0;
    
    public LibroCartaceo(double peso, boolean copertinaRigid, String nome, String cognome, String codFiscale, String titolo, String isbn, int annoPublicazione, String casaEditrice,
    double prezzoDiVendita) {
        super(nome, cognome, codFiscale, titolo, isbn, annoPublicazione, casaEditrice, prezzoDiVendita);
        this.peso = peso;
        this.copertinaRigida = copertinaRigida;
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public boolean isCopertinaRigida() {
        return copertinaRigida;
    }
    public void setCopertinaRigida(boolean copertinaRigida) {
        this.copertinaRigida = copertinaRigida;
    }
    public static int getQtainMagazzino() {
        return qtainMagazzino;
    }
    public static void setQtainMagazzino(int qtainMagazzino) {
        LibroCartaceo.qtainMagazzino = qtainMagazzino;
    }
    @Override
    public String toString() {
        return super.toString() + " (Cartaceo, " + peso + "kg, " + (copertinaRigida ? "Copertina rigida" : "Copertina morbida") + ")";
    }
}
