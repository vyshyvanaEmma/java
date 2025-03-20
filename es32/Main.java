package es32;

public class Main {
    public static void main(String[] args) {
        Collezione collezione = new Collezione("Bella", "Firenze");

        Artista artista1 = new Artista("Francesco", "Perrotta");
        Artista artista2 = new Artista("Paolo", "Gianino");
        Artista artista3 = new Artista("Matteo", "Viciani");

        OperaArte opera1 = new OperaArte("tit1", 400, artista1);
        Scultura scultura1 = new Scultura("Michelangelo", 500, artista2, 600, 10, 56, 5);
        // Quadro quadro1 = new Quadro("Mona Lisa", 2000, artista3, 8, 5);
        Scultura scultura2 = new Scultura("Rafaele", 200, artista3, 600, 10, 56, 5);

        collezione.aggiuntaOrdineCognome(opera1);
        collezione.aggiuntaOrdineCognome(scultura1);
        // collezione.aggiuntaOrdineCognome(quadro1);
        collezione.aggiuntaOrdineCognome(scultura2);
        collezione.stampa();

        collezione.rimuovereOpera("Francesco", "Perrotta");
        collezione.stampa();

        System.out.println("Nome dell'artista d' opera piu' costosa e': " + collezione.nomeArtistaOperaCostosa());
        System.out.println("Quantita dei quadri nella collezione: ");
        if (collezione.quantitaQuadri() > 0) {
            System.out.println(collezione.quantitaQuadri());
        } else {
            System.out.println("La collezione e' vuota");
        }
        System.out.println("Quantita delle scuture nella collezione: ");
        if (collezione.quantitaSculture() > 0) {
            System.out.println(collezione.quantitaSculture());
        } else {
            System.out.println("La collezione e' vuota");
        }

        System.out.println("Il totale della collezione e': " + collezione.totaleCollezione());

       System.out.println("Prezo totale dei quadri nella collezione: ");
        if (collezione.totaleQuadri() > 0) {
            System.out.println(collezione.totaleQuadri());
        } else {
            System.out.println("Non ci sono i quadri nella collezione");
        }
        System.out.println("Prezzo totale delle scuture nella collezione: ");
        if (collezione.totaleSculture() > 0) {
            System.out.println(collezione.totaleSculture());
        } else {
            System.out.println("non ci sono le sculture nella collezione");
        }

        System.out.println("La collezione con opere maggiore di 200:" );
        Collezione temp = collezione.listaOpereMaggioreStabilito(200);
        temp.stampa();

    }
}