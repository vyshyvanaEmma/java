public class Scultura extends OpereArte {
    private double base, altezza, profondita;

    public Scultura(String titolo, Artista artista, double quotazione, double base, double altezza, double profondita) {
        super(titolo, artista, quotazione);
        this.altezza = altezza;
        this.base = base;
        this.profondita = profondita;
    }

    @Override
    public double restituireIngombro() {
        return this.base * this.altezza * this.profondita;
    }

    public double calcolaSuperficie() {
        double areaBase = this.base * this.profondita; 
        double areaLaterale1 = this.base * this.altezza; 
        double areaLaterale2 = this.altezza * this.profondita; 

        return 2 * (areaBase + areaLaterale1 + areaLaterale2);
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