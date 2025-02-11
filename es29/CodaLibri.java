package es29;

public class CodaLibri implements Coda<Libro> {
    private Nodo<Libro> testa; 
    private Nodo<Libro> coda;   

    public CodaLibri() {
        this.testa = null;
        this.coda = null;
    }

    @Override
    public void accoda(Libro libro) {
        Nodo<Libro> nuovoNodo = new Nodo<>(libro);  
        if (isEmpty()) {
            testa = nuovoNodo;  
            coda = nuovoNodo;
        } else {
            coda.setNext(nuovoNodo); 
            coda = nuovoNodo;  
        }
    }

    @Override
    public Libro estrai() {
        if (isEmpty()) {
            throw new IllegalStateException("La coda e' vuota");
        }
        Libro libro = testa.getInfo(); 
        testa = testa.getNext();  
        if (testa == null) {  
            coda = null;
        }
        return libro;
    }

    @Override
    public Libro first() {
        if (isEmpty()) {
            throw new IllegalStateException("La coda e' vuota");
        }
        return testa.getInfo(); 
    }

    @Override
    public Libro last() {
        if (isEmpty()) {
            throw new IllegalStateException("La coda e' vuota");
        }
        return coda.getInfo();  
    }

    @Override
    public boolean isEmpty() {
        return testa == null;  
    }

    @Override
    public void clear() {
        testa = null;  
        coda = null;   
    }

    public Nodo<Libro> getTesta() {
        return testa;
    }

    public void setTesta(Nodo<Libro> testa) {
        this.testa = testa;
    }

    public Nodo<Libro> getCoda() {
        return coda;
    }

    public void setCoda(Nodo<Libro> coda) {
        this.coda = coda;
    }



}
