import java.util.List;

public class PillaLibri {

    // Classe Nodo che rappresenta un elemento della pila
    static class Nodo {
        Libro libro;
        Nodo next;

        // Costruttore per creare un nodo con un libro
        public Nodo(Libro libro) {
            this.libro = libro;
            this.next = null;  // Inizialmente, il nodo non ha un riferimento al prossimo nodo
        }
    }

    // Classe che implementa la pila di libri
    static class PilaLibriImpl implements Pila<Libro> {
        private List<Nodo> nodi;  // La lista che contiene i nodi della pila

        // Costruttore che inizializza la lista dei nodi (pila vuota)
        public PilaLibriImpl(List<Nodo> nodi) {
            this.nodi = nodi;
        }

        // Aggiunge un libro in cima alla pila (push)
        @Override
        public void push(Libro libro) {
            Nodo nuovoNodo = new Nodo(libro);  // Crea un nuovo nodo con il libro
            nodi.add(nuovoNodo);  // Aggiunge il nodo alla fine della lista
        }

        // Rimuove il libro in cima alla pila (pop)
        @Override
        public Libro pop() {
            if (isEmpty()) {
                return null;  // La pila è vuota, ritorniamo null
            }
            Nodo nodoRimosso = nodi.remove(nodi.size() - 1);  // Rimuove e restituisce l'ultimo nodo
            return nodoRimosso.libro;  // Restituisce il libro del nodo rimosso
        }

        // Restituisce il libro in cima alla pila senza rimuoverlo (top)
        @Override
        public Libro top() {
            if (isEmpty()) {
                return null;
            }
            return nodi.get(nodi.size() - 1).libro;  // Restituisce il libro dell'ultimo nodo
        }

        // Verifica se la pila è vuota
        @Override
        public boolean isEmpty() {
            return nodi.isEmpty();  // La pila è vuota se la lista dei nodi è vuota
        }

        // Pulisce la pila
        @Override
        public void clear() {
            nodi.clear();  // Rimuove tutti i nodi dalla lista
        }
    }

    // Esempio di implementazione di un libro
    static class LibroFiction extends Libro {
        private String autore;

        public LibroFiction(String autore, String titolo, String isbn, int annoPubblicazione, String casaEditrice, double prezzoDiVendita) {
            super(titolo, isbn, annoPubblicazione, casaEditrice, prezzoDiVendita);
            this.autore = autore;
        }

        public String getAutore() {
            return autore;
        }

        @Override
        public String toString() {
            return "Titolo: " + getTitolo() + ", Autore: " + autore + ", ISBN: " + getIsbn();
        }
    }


}
