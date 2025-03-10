public class Main {
    public static void main(String[] args) {

        Coda coda = new Coda();
        Pila pila = new Pila();
        Cantina cantina = new Cantina(coda, pila);

        cantina.accodaProdotto(new Libro("L1", 3.0, "Libro 1"));
        cantina.accodaProdotto(new Libro("L2", 5.0, "Libro2"));
        cantina.accodaProdotto(new Prodotto("P1")); 
        cantina.accodaProdotto(new Libro("L3", 4.0, "Libro3"));
        cantina.accodaProdotto(new Libro("L4", 2., "Libro4"));

        System.out.println("Stato iniziale della coda:");
        cantina.stampaCoda();

        System.out.println("\nInizio del trasloco...");
        cantina.effetuaTrasloco();

        System.out.println("\nStato finale della coda:");
        cantina.stampaCoda();

        System.out.println("\nStato finale della pila:");
        cantina.stampaPila();
    }
}