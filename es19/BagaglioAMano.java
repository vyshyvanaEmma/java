public class BagaglioAMano extends Bagaglio{
    
    public static double ecc = 8;
    private static double tariffa = 8.5;

    public BagaglioAMano(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double getTariffa() {
        return tariffa;
    }
    @Override
    public double getEcc() {
        return ecc;
    }
    
}