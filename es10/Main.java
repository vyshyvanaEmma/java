package es10;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto(101, "Televisore", 499.99f);
        Prodotto p2 = new Prodotto(102, "Frigorifero", 299.99f);
        Prodotto p3 = new Prodotto(103, "Lavatrice", 399.99f);


        DettaglioOrdine d1 = new DettaglioOrdine(p1, 2);
        DettaglioOrdine d2 = new DettaglioOrdine(p2, 1);
        DettaglioOrdine d3 = new DettaglioOrdine(p3, 3);

        Ordine ordine1 = new Ordine(1001, new GregorianCalendar(2024, 9, 8)); 


        ordine1.aggiungiAdOrdine(d1);
        ordine1.aggiungiAdOrdine(d2);
        ordine1.aggiungiAdOrdine(d3);

        System.out.println("Dettaglio ordine prima della modifica:");
        ordine1.stampaDescrizioneOrdine();
        System.out.println("Totale ordine: " + ordine1.calcolaTotale());

        ordine1.modificaOrdine(101, 5);
        System.out.println("\nDettaglio ordine dopo la modifica:");
        ordine1.stampaDescrizioneOrdine();
        System.out.println("Totale ordine dopo modifica: " + ordine1.calcolaTotale());

        ordine1.eliminaDaOrdine(102);
        System.out.println("\nDettaglio ordine dopo l'eliminazione del prodotto con codice 102:");
        ordine1.stampaDescrizioneOrdine();
        System.out.println("Totale ordine dopo eliminazione: " + ordine1.calcolaTotale());

        float sconto = 10;
        System.out.println("\nTotale ordine con sconto del " + sconto + "%: " + ordine1.calcolaTotale(sconto));

            }
}
