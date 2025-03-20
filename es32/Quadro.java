package es32;

public class Quadro extends OperaArte {

    private double base, altezza;

    public Quadro(String titolo, double valoreOpera, Artista artista, double base, double altezza) {
        super(titolo, valoreOpera, artista);
        this.base = base;
        this.altezza = altezza;
    }

    public double ingombro(){
        return altezza * base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Quadro - base:" + base + ", altezza:" + altezza + ", titolo: " + getTitolo() + ", valore:" + getValoreOpera() + "Artista: " + getArtista().getNomeArtista() + " " + getArtista().getCognomeArtista() + "\n";
    }
    
}