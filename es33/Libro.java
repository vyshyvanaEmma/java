public class Libro extends Prodotto {

    private String titolo;
    private double peso;

    public Libro(String codice, double peso, String titolo) {
        super(codice);
        this.titolo = titolo;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Libro: titolo=" + titolo + ", peso=" + peso + "]";
    }

}
