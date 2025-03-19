public class CodaProdotto {
    protected Nodo testa;
    protected Nodo coda;

    public CodaProdotto() {
        testa = null;
        coda = null;
    }

    public void accoda(Prodotto info) {
        Nodo n = new Nodo(info);
        if (isEmpty()) {
            testa = n;
            coda = n;
        } else {
            coda.setNext(n);
            coda = n;
        }
    }

    public Prodotto estrai() {
        if (isEmpty()) {
            testa = null;
            coda = null;
            return null;
        } else {
            Prodotto p = testa.getInfo();
            testa = testa.getNext();
            if (testa == null) {
                coda = null;
            }
            return p;
        }
    }

    public Prodotto first() {
        if (isEmpty()) {
            return null;
        }
        return testa.getInfo();
    }

    public Prodotto last() {
        if (isEmpty()) {
            return null;
        }
        return coda.getInfo();
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
        coda = null;

    }

    public Nodo getTesta() {
        return testa;
    }

    public void setTesta(Nodo testa) {
        this.testa = testa;
    }

    public Nodo getCoda() {
        return coda;
    }

    public void setCoda(Nodo coda) {
        this.coda = coda;
    }
}
