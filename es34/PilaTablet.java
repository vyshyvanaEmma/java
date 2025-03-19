public class PilaTablet {
    protected Nodo testa;

    public PilaTablet() {
        testa = null;
    }

    public void push(Tablet t) {
        Nodo tablet = new Nodo(t);
        if (isEmpty()) {
            testa = tablet;
        } else {
            Nodo temp = testa;
            testa = tablet;
            testa.setNext(temp);
        }
    }

    public Tablet pop() {
        if (isEmpty()) {
            return null;
        }
        Tablet t = (Tablet) testa.getInfo();
        testa = testa.getNext();
        return t;
    }

    public Tablet top(){
        if(isEmpty()){
            return null;
        }
        return (Tablet) testa.getInfo();
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
