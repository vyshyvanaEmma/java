package es13;

import java.util.ArrayList;

public class CocktailBar {
    private String nome;
    private ArrayList<Cocktail> bar;
    
    public CocktailBar(String nome){
        this.nome = nome;
        this.bar = new ArrayList<Cocktail> ();
    }

    public CocktailBar(CocktailBar cocktailBarCopy){
        this.nome = cocktailBarCopy.nome;
        this.bar = new ArrayList<Cocktail>(cocktailBarCopy.getBar());
    }


    public boolean aggiuntaCocktail(Cocktail c){
        for(int i = 0; i < bar.size(); i++){
            if(bar.get(i).getNomeC().equals(c.getNomeC())){
                return false;
            }
        }
        bar.add(c);
        return true;

    }

    public boolean aggiuntaCocktail(String nomeCocktail){
        for(int i = 0; i < bar.size(); i++){
            if(bar.get(i).getNomeC().equals(nomeCocktail)){
                bar.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cocktail> listaCocktailAlcolici(int g){
        ArrayList<Cocktail> listaAlc = new ArrayList<Cocktail> ();
        for(int i = 0; i < bar.size(); i++){
            if(bar.get(i) instanceof CocktailAlcolico c){
                if(c.getGradazione() < g){
                    listaAlc.add(c);
                }
            }
        }
        return listaAlc;
    }

    public ArrayList<Cocktail> listaCocktailCompo(Componenti comp){
        ArrayList<Cocktail> listaCocktail = new ArrayList<Cocktail> ();
        for(int i = 0; i < bar.size(); i++){
            Cocktail c = bar.get(i);
            for(int j = 0; j < c.getComponentiC().size(); j++){
                if(c.getComponentiC().get(j).getNome().equals(comp.getNome())){
                    listaCocktail.add(c);
                    break;
                }
            }
        }
        listaCocktail.sort((c1, c2) -> c1.getNomeC().compareTo(c2.getNomeC()));
        return listaCocktail;
        
    }

    public ArrayList<Cocktail> listaCocktailPrezzo(double prezzo){
        ArrayList<Cocktail> lista = new ArrayList<Cocktail> ();

        for(int i = 0; i < bar.size(); i++){
            Cocktail c = bar.get(i);
            if(c.prezzoCocktail() > prezzo){
                lista.add(c);
            }
        }
        lista.sort((c1, c2) -> c1.prezzoCocktail() > c2.prezzoCocktail() ? 1 : -1);
        return lista;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cocktail> getBar() {
        return bar;
    }

    public void setBar(ArrayList<Cocktail> bar) {
        this.bar = bar;
    }
}
