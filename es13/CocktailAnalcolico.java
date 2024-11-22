package es13;

public class CocktailAnalcolico extends Cocktail {
    private boolean stato;
    public CocktailAnalcolico(String nomeC, boolean stato){
        super(nomeC);
        this.stato = stato;
    }

    public CocktailAnalcolico(CocktailAnalcolico cocktailAnalcolicoCopy){
        super(cocktailAnalcolicoCopy.getNomeC());
        this.stato = cocktailAnalcolicoCopy.stato;
    }

    public boolean isStato() {
        return stato;
    }
    public void setStato(boolean stato) {
        this.stato = stato;
    }


}   
