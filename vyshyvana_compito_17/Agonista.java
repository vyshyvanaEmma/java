public class Agonista extends Tesserato{
    
    private int gareSvolte;
    private static double SCONTO = 2;

    public Agonista(String nome, String cognome, String codiceFiscale, String codicetTessera, double mesiAbbonamento, int gareSvolte) {
        super(nome, cognome, codiceFiscale, codicetTessera, mesiAbbonamento);
        this.gareSvolte = gareSvolte;
    }


    @Override
    public double costoAbbonamento(){
        double tot = 0;
        tot = this.costoAbbonamento() * this.getMesiAbbonamento() - ((this.gareSvolte * SCONTO) / 100);
        if(tot < 0){
            return 0;
        }
        return tot;
    }

    public int getGareSvolte() {
        return gareSvolte;
    }


    public void setGareSvolte(int gareSvolte) {
        this.gareSvolte = gareSvolte;
    }

    @Override
    public String toString() {
        return "/nAgonista, gare svolte: " + gareSvolte + "/n";
    }

}
