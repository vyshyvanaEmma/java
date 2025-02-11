package es29;
public class Libreria {
    private GestioneCodaLibri gestioneCodaLibri;

    public Libreria() {
        gestioneCodaLibri = new GestioneCodaLibri();
    }

    public boolean aggiungiLibro(Libro libro) {
        return gestioneCodaLibri.aggiungi(libro);
    }

    public Libro eliminaLibro() {
        return gestioneCodaLibri.elimina();
    }

    public int numLibriAutore(String nomeAutore) {
        return gestioneCodaLibri.numLibriAutore(nomeAutore);
    }

    public int eliminaLibriAutore(String nomeAutore) {
        return gestioneCodaLibri.eliminaAutore(nomeAutore);
    }

    public void visualizzaCoda() {
        Nodo<Libro> nodoCorrente = gestioneCodaLibri.getCoda().getTesta();
        while (nodoCorrente != null) {
            Libro libro = nodoCorrente.getInfo();
            System.out.println("Titolo: " + libro.getTitolo() + ", ISBN: " + libro.getIsbn() + ", Autore: " + libro.getAutore().getNome());
            nodoCorrente = nodoCorrente.getNext();
        }
    }
}
