package es27;

public class Libreria {
    private GestionePilaLibri gestionePilaLibri;

    public Libreria() {
        gestionePilaLibri = new GestionePilaLibri();
    }

    public boolean aggiungiLibro(Libro libro) {
        return gestionePilaLibri.aggiungi(libro);
    }

    public Libro eliminaLibro() {
        return gestionePilaLibri.elimina();
    }

    public void visualizzaPila() {
        System.out.println("i libri nella pila:");
        Nodo<Libro> nodoCorrente = gestionePilaLibri.getPila().getTesta();
        while (nodoCorrente != null) {
            Libro libro = nodoCorrente.getInfo();
            System.out.println("titolo: " + libro.getTitolo() + ", ISBN: " + libro.getIsbn());
            nodoCorrente = nodoCorrente.getNext();
        }
    }
}
