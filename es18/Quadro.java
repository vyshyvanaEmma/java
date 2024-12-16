public class Quadro extends OpereArte{

    private double altezza, base;

    public Quadro(String titolo, Artista artista, double quotazione, double altezza, double base){
        super(titolo, artista, quotazione);
        this.altezza = altezza;
        this.base = base;
    }

    @Override
    public double restituireIngombro(){
        return this.base * this.altezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
}