public class BagaglioStiva extends Bagaglio{

    public static double ecc = 25;
    private static double tariffa = 5;

    public BagaglioStiva(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public  double getEcc() {
        return ecc;
    }
    @Override
    public  double getTariffa() {
        return tariffa;
    }


    
}