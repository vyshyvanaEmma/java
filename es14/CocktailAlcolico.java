package es14;

public class CocktailAlcolico extends Cocktail {
    private double gradazione;
    public static int costoCAlc = 2;

    public CocktailAlcolico(String nomeC, double gradazione){
        super(nomeC);
        this.gradazione = gradazione;
    }

    public CocktailAlcolico(CocktailAlcolico cocktailAlcolicoCopy){
        super(cocktailAlcolicoCopy.getNomeC());
        this.gradazione = cocktailAlcolicoCopy.gradazione;
    }


    public double getGradazione() {
        return gradazione;
    }

    public void setGradazione(double gradazione) {
        this.gradazione = gradazione;
    }

}
