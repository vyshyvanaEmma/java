public class Tablet extends Prodotto {
    private String modello;

    public Tablet(int codice, double peso, String modello) {
        super(codice, peso);
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Tablet - modello:" + modello + ", codice: " + getCodice() + ", peso: " + getPeso() + "\n";
    }

    

}
