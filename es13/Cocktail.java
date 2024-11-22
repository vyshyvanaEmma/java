package es13;
import java.util.ArrayList;

public class Cocktail {

    private String nomeC;
    private ArrayList<Componenti> componentiC;


    public Cocktail(String nomeC){
        this.nomeC = nomeC;
        this.componentiC = new ArrayList<Componenti>();
    }

    public Cocktail(Cocktail cocktailCopy){
        this.nomeC = cocktailCopy.nomeC;
        this.componentiC =  new ArrayList<Componenti> (cocktailCopy.getComponentiC());
    }

    public boolean aggiugiComponente(Componenti c){
        for(int i = 0; i < componentiC.size(); i++){
            if(componentiC.get(i).getNome().equals(c.getNome())){
                return false;
            }
        }
        componentiC.add(c);
        return true;
    }

    public boolean rimozioneComponente(Componenti c){
        for(int i = 0; i < componentiC.size(); i++){
            if(componentiC.get(i).getNome().equals(c.getNome())){
                componentiC.remove(i);
                return true;
            }
        }
        return false;
    }

    public double prezzoCocktail(){
        double somma = 0;
        for(int i= 0; i < componentiC.size(); i++){
            somma += componentiC.get(i).getCostoUnitario();
        }
        if(this instanceof CocktailAlcolico ca){
            somma += ca.getGradazione() * CocktailAlcolico.costoCAlc;
        }
        return somma;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }
    public ArrayList<Componenti> getComponentiC() {
        return componentiC;
    }

    public void setComponentiC(ArrayList<Componenti> componentiC) {
        this.componentiC = componentiC;
    }

}
