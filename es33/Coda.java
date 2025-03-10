public class Coda {
    private Nodo testa;
    private Nodo coda;

    public Coda() {
        testa = null;
        coda = null;
    }

    public void accoda(Prodotto prodotto) {
        Nodo nuovoN = new Nodo(prodotto);
        if (coda == null) {
            testa = nuovoN;
            coda = nuovoN;
        } else {
            coda.next = nuovoN;
            coda = nuovoN;
        }
    }

    public Prodotto estrai() {

        if (testa == null) {
            return null;
        } else {
            Prodotto info = testa.getInfo();
            testa = testa.getNext();
            return info;
        }

    }

    public Prodotto first() {
        if (testa == null) {
            return null;
        } else {
            return testa.getInfo();
        }

    }

    public Prodotto last() {
        if (testa == null || coda == null) {
            return null;
        } else {
            return coda.getInfo();
        }
    }

    public Boolean isEmpty() {
        return testa == null;
    }

    public void clear() {
        testa = null;
        coda = null;
    }

    public void stampaCoda() {
        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente.getInfo());
            corrente = corrente.getNext();
        }
    }

}