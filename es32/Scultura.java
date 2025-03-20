package es32;

public class Scultura extends OperaArte {
    private double peso;
    private double base, altezza, profondita;

    public Scultura(String titolo, double valoreOpera, Artista artista, double peso, double base, double altezza,
            double profondita) {
        super(titolo, valoreOpera, artista);
        this.peso = peso;
        this.base = base;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public double ingombro() {
        return altezza * base;
    }

    public double superficie() {
        return 2 * (base * altezza + base * profondita + altezza * profondita);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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

    public double getProfondita() {
        return profondita;
    }

    public void setProfondita(double profondita) {
        this.profondita = profondita;
    }

}