

public class LibroCartaceo extends Libro{
    private double peso;
    private boolean copertinaRigida;
    private static int qtainMagazzino = 0;
    
    public LibroCartaceo(double peso, boolean copertinaRigid, String autore, String titolo, String isbn, int annoPublicazione, String casaEditrice,
    double prezzoDiVendita) {
        super(autore, titolo, isbn, annoPublicazione, casaEditrice, prezzoDiVendita);
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
    
}
