package es20;

public class BagaglioStiva extends Bagaglio{

    public static double LIMITE_PESO = 25;
    private static double COSTO_SUPPLEMENTO = 5;

    public BagaglioStiva(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public  boolean eEccedente() {
        return getPeso() > LIMITE_PESO;
    }
    @Override
    public  double calcolaSupplemento() {
        if(eEccedente()){
            return (getPeso() - LIMITE_PESO) * COSTO_SUPPLEMENTO;
        }
        return 0;
    }
    
}