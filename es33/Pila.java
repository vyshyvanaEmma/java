public class Pila {
    private Nodo testa;

    public Pila() {
        testa = null;
    }

    public void push(Libro info) {
        Nodo nuovoN = new Nodo(info);
        nuovoN.setNext(testa);
        testa = nuovoN;
    }

    public Libro pop() {
        if (testa == null) {
            return null;
        } else {
            Libro l = (Libro) testa.getInfo();
            testa = testa.getNext();
            return l;
        }
    }

    public Libro top() {
        if (testa == null) {
            return null;
        }
        return (Libro) testa.getInfo();
    }

    public Boolean isEmpty(){
        return testa == null;
    }

    public void clear(){
        testa = null;
    }

    public void stampaPila() {
        if (testa == null) {
            System.out.println("La pila e' vuota.");
            return;
        }

        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente.getInfo());
            corrente = corrente.getNext();
        }
    }
}