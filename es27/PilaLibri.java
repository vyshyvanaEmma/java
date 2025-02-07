package es27;

public class PilaLibri implements Pila<Libro> {

    private Nodo<Libro> testa; 

    public PilaLibri() {
        this.testa = null; 
    }

    @Override
    public void push(Libro libro) {
        Nodo<Libro> nuovoNodo = new Nodo<>(libro);  
        nuovoNodo.setNext(testa);  
        testa = nuovoNodo; 
    }

    @Override
    public Libro pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila e' vuota");  
        }
        Libro libro = testa.getInfo();  
        testa = testa.getNext();  
        return libro;  
    }

    @Override
    public Libro top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila e' vuota");  
        }
        return testa.getInfo();  
    }

    @Override
    public boolean isEmpty() {
        return testa == null;  
    }

    @Override
    public void clear() {
        testa = null;  
    }

    public Nodo<Libro> getTesta() {
        return testa;
    }
}
