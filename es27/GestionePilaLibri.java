package es27;

public class GestionePilaLibri {
    private PilaLibri pila;

    public GestionePilaLibri() {
        pila = new PilaLibri();
    }

    public boolean aggiungi(Libro libro) {
        Nodo<Libro> nodoCorrente = pila.getTesta();
        while (nodoCorrente != null) {
            if (nodoCorrente.getInfo().getIsbn().equals(libro.getIsbn())) {
                return false;  
            }
            nodoCorrente = nodoCorrente.getNext();
        }
        pila.push(libro);  
        return true;
    }

   
    public Libro elimina() {
        if (pila.isEmpty()) {
            return null;  
        }
        Libro libro = pila.pop();
        return libro;
    }

    public PilaLibri getPila() {
        return pila;
    }
}
