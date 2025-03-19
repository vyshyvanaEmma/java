public class PilaProdotto {
    protected Nodo testa;

    public PilaProdotto() {
        testa = null;
    }

    public void push(Prodotto p) {
        Nodo prodotto = new Nodo(p);
        if (isEmpty()) {
            testa = prodotto;
        } else {
            Nodo temp = testa;
            testa = prodotto;
            testa.setNext(temp);
        }
    }

    public Prodotto pop() {
        if (isEmpty()) {
            return null;
        }
        Prodotto p = testa.getInfo();
        testa = testa.getNext();
        return p;
    }

    public Prodotto top() {
        if (isEmpty()) {
            return null;
        }
        return testa.getInfo();
    }

    public Boolean isEmpty() {
        return testa == null;
    }

    public void clear() {
        Nodo corrente = testa;
        while (corrente != null) {
            Nodo prossimo = corrente.getNext();
            corrente.setNext(null);
            corrente = prossimo;
        }
        testa = null;
    }

    public Nodo getTesta() {
        return testa;
    }

    public void setTesta(Nodo testa) {
        this.testa = testa;
    }
}
