package es32;

public class OperaArte {
    private String titolo;
    private double valoreOpera;
    private Artista artista;

    public OperaArte(String titolo, double valoreOpera, Artista artista) {
        this.titolo = titolo;
        this.valoreOpera = valoreOpera;
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getValoreOpera() {
        return valoreOpera;
    }

    public void setValoreOpera(double valoreOpera) {
        this.valoreOpera = valoreOpera;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "OperaArte - titolo:" + titolo + ", valore: " + valoreOpera + ", artista:" + artista.getNomeArtista()
                + " " + artista.getCognomeArtista() + "\n";
    }

}