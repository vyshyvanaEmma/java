public class Main {
    public static void main(String[] args) {
        Coda coda = new Coda();
        Pila pila = new Pila();

        Cantina cantina = new Cantina(coda, pila);

        Libro libro1 = new Libro("L1", 3.0, "Titolo1");
        Libro libro2 = new Libro("L2", 10.0, "Titolo2");
        Libro libro3 = new Libro("L3", 2.0, "Titolo3");
        Prodotto prodottoNonLibro = new Prodotto("P1");

        cantina.accodaProdotto(libro1);
        cantina.accodaProdotto(prodottoNonLibro);
        cantina.accodaProdotto(libro2);
        cantina.accodaProdotto(libro3);

        System.out.println("Contenuto iniziale della coda:");
        cantina.stampaCoda();

        System.out.println("\nRiempiamo il pacco con i libri (fino a 10kg):");
        cantina.riempiPaccoLibri();

        System.out.println("\nScarichiamo il pacco giunto a destinazione:");
        cantina.scaricaPaccoGiuntoADestinazione();

        System.out.println("\n trasloco...");
        cantina.effettuaTrasloco();

        System.out.println("\nContenuto della coda dopo il trasloco:");
        cantina.stampaCoda();

        System.out.println("\nContenuto della pila dopo il trasloco:");
        cantina.stampaPila();
    }
}
