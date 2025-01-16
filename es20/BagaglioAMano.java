package es20;
public class BagaglioAMano extends Bagaglio{
    
    public static double LIMITE_PESO = 8;
    private static double COSTO_SUPPLEMENTO = 8.5;

    public BagaglioAMano(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public boolean eEccedente() {
        return getPeso() > LIMITE_PESO;
    }
    @Override
    public double calcolaSupplemento() {
        if(eEccedente()){
            return (getPeso() - LIMITE_PESO) * COSTO_SUPPLEMENTO;
        }
        return 0;
    }
    
}