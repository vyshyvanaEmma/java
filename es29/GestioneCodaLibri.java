package es29;

public class GestioneCodaLibri {
    private CodaLibri coda;

    public GestioneCodaLibri() {
        coda = new CodaLibri();
    }

    public boolean aggiungi(Libro libro) {
        Nodo<Libro> nodoCorrente = coda.getTesta();
        while (nodoCorrente != null) {
            if (nodoCorrente.getInfo().getIsbn().equals(libro.getIsbn())) {
                return false;  
            }
            nodoCorrente = nodoCorrente.getNext();
        }
        coda.accoda(libro);  
        return true;
    }

    public Libro elimina() {
        return coda.estrai(); 
    }

    public int numLibriAutore(String nomeAutore) {
        int count = 0;
        Nodo<Libro> nodoCorrente = coda.getTesta();
        while (nodoCorrente != null) {
            if (nodoCorrente.getInfo().getAutore().getNome().equalsIgnoreCase(nomeAutore)) {
                count++;
            }
            nodoCorrente = nodoCorrente.getNext();
        }
        return count;
    }

    public int eliminaAutore(String nomeAutore) {
        int count = 0;
        CodaLibri codaTemp = new CodaLibri();
        Nodo<Libro> nodoCorrente = coda.getTesta();

        while (nodoCorrente != null) {
            Libro libro = nodoCorrente.getInfo();
            if (libro.getAutore().getNome().equalsIgnoreCase(nomeAutore)) {
                count++;
            } else {
                codaTemp.accoda(libro);  
            nodoCorrente = nodoCorrente.getNext();
            }
        }

        coda = codaTemp;

        return count;
    }

    public CodaLibri getCoda() {
        return coda;
    }
}
