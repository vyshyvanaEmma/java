package es14;

public class Componenti {
    private String nome;
    private int quantita;
    private double costoUnitario;


    public Componenti(String nome, int quantita, double costoUnitario){
        this.nome = nome;
        this.quantita = quantita;
        this.costoUnitario = costoUnitario;
    }

    public Componenti(Componenti copyComponenti){
        this.nome = copyComponenti.getNome();
        this.quantita = copyComponenti.getQuantita();
        this.costoUnitario = copyComponenti.getCostoUnitario();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantita() {
        return quantita;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public double getCostoUnitario() {
        return costoUnitario;
    }
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }


}
