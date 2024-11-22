package es14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Componenti rum = new Componenti("Rum", 2, 5.0);
        Componenti cola = new Componenti("Cola", 1, 2.0);
        Componenti limone = new Componenti("Limone", 1, 0.5);
        Componenti succoMela = new Componenti("Succo di mela", 1, 3.0);

        CocktailAlcolico mojito = new CocktailAlcolico("Mojito", 5.0);
        mojito.aggiugiComponente(rum);
        mojito.aggiugiComponente(limone);

        CocktailAnalcolico virginColada = new CocktailAnalcolico("Virgin Colada", true);
        virginColada.aggiugiComponente(succoMela);
        virginColada.aggiugiComponente(cola);
        Cocktail mojito1 = new CocktailAlcolico("Mojito New", 9.0);
        CocktailBar cocktailBar = new CocktailBar("Tropical Bar");
        Cocktail analcolico = new CocktailAnalcolico("Fresh Lime", false);
    
        cocktailBar.aggiuntaCocktail(mojito);
        cocktailBar.aggiuntaCocktail(virginColada);
        cocktailBar.aggiuntaCocktail(mojito1);

        boolean removed = cocktailBar.rimozioneCocktail("Mojito New");
        if (removed) {
            System.out.println("Mojito è stato rimosso dal bar.");
        } else {
            System.out.println("Mojito non è presente nel bar.");
        }


        System.out.println("Lista cocktail disponibili:");
        for (Cocktail cocktail : cocktailBar.getBar()) {
            System.out.println("Nome: " + cocktail.getNomeC() + ", Prezzo: " + cocktail.prezzoCocktail());
        }

        System.out.println("\nCocktail alcolici con gradazione inferiore a 6:");
        ArrayList<Cocktail> cocktailGradazioneBassa = cocktailBar.listaCocktailAlcolici(6);
        for (Cocktail c : cocktailGradazioneBassa) {
            System.out.println(c.getNomeC());
        }

        System.out.println("\nCocktail che contengono Cola:");
        ArrayList<Cocktail> cocktailConCola = cocktailBar.listaCocktailCompo(cola);
        for (Cocktail c : cocktailConCola) {
            System.out.println(c.getNomeC());
        }

        cocktailBar.rimozioneCocktail("Mojito");

        System.out.println("\nValore complessivo dei cocktail nel bar: " + cocktailBar.sommaCocktailPrezzo());

        System.out.println("\nMojito è alcolico? " + cocktailBar.alcolicoOanalcolico(mojito));
        System.out.println("Virgin Colada è alcolico? " + cocktailBar.alcolicoOanalcolico(virginColada));

        System.out.println("\nNumero di cocktail alcolici: " + cocktailBar.contaAlcolici());
        System.out.println("Numero di cocktail analcolici: " + cocktailBar.contaAnalcolici());
        
        mojito.stampaCaratteristiche();
        analcolico.stampaCaratteristiche(); 
    }
}

