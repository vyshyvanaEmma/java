public abstract class Bagaglio{
    private String nome;
    private double peso;

    public Bagaglio(String nome, double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Il peso non può essere negativo.");
        }
        this.nome = nome;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public abstract double getEcc();
    public abstract double getTariffa();

}