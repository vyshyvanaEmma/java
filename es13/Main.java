package es14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creazione del Cocktail Bar
        CocktailBar bar = new CocktailBar("Tropical Bar");

        // Creazione dei componenti
        Componenti rum = new Componenti("Rum", 1, 3.5);
        Componenti lime = new Componenti("Lime", 2, 0.5);
        Componenti menta = new Componenti("Menta", 1, 0.2);
        Componenti succoFrutta = new Componenti("Succo di Frutta", 1, 2.0);
        Componenti zucchero = new Componenti("Zucchero", 1, 0.3);

        // Creazione di cocktail alcolici
        Cocktail mojito = new CocktailAlcolico("Mojito", 10.0);
        mojito.aggiugiComponente(rum);
        mojito.aggiugiComponente(lime);
        mojito.aggiugiComponente(menta);
        mojito.aggiugiComponente(zucchero);

        Cocktail daiquiri = new CocktailAlcolico("Daiquiri", 8.0);
        daiquiri.aggiugiComponente(rum);
        daiquiri.aggiugiComponente(lime);
        daiquiri.aggiugiComponente(zucchero);

        // Creazione di cocktail analcolici
        Cocktail analcolicoSpecial = new CocktailAnalcolico("Special Fruit", true);
        analcolicoSpecial.aggiugiComponente(succoFrutta);
        analcolicoSpecial.aggiugiComponente(menta);

        Cocktail analcolicoNormale = new CocktailAnalcolico("Fresh Lime", false);
        analcolicoNormale.aggiugiComponente(lime);
        analcolicoNormale.aggiugiComponente(zucchero);

        bar.aggiuntaCocktail(mojito);
        bar.aggiuntaCocktail(daiquiri);
        bar.aggiuntaCocktail(analcolicoSpecial);
        bar.aggiuntaCocktail(analcolicoNormale);

        System.out.println("Prezzo Mojito: " + mojito.prezzoCocktail());
        System.out.println("Prezzo Daiquiri: " + daiquiri.prezzoCocktail());
        System.out.println("Prezzo Special Fruit: " + analcolicoSpecial.prezzoCocktail());
        System.out.println("Prezzo Fresh Lime: " + analcolicoNormale.prezzoCocktail());

        ArrayList<Cocktail> cocktailAlcoliciBassi = bar.listaCocktailAlcolici(9);
        System.out.println("\nCocktail alcolici con gradazione inferiore a 9:");
        for (Cocktail c : cocktailAlcoliciBassi) {
            System.out.println(c.getNomeC());
        }

        ArrayList<Cocktail> cocktailConLime = bar.listaCocktailCompo(lime);
        System.out.println("\nCocktail che contengono Lime (in ordine alfabetico):");
        for (Cocktail c : cocktailConLime) {
            System.out.println(c.getNomeC());
        }

        ArrayList<Cocktail> cocktailPrezzoMaggiore = bar.listaCocktailPrezzo(5.0);
        System.out.println("\nCocktail con prezzo maggiore di 5.0 (in ordine di prezzo):");
        for (Cocktail c : cocktailPrezzoMaggiore) {
            System.out.println(c.getNomeC() + " - Prezzo: " + c.prezzoCocktail());
        }
    }
}
