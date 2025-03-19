public class PilaPC {
    protected Nodo testa;

    public PilaPC() {
        testa = null;
    }

    public void push(PC p) {
        Nodo pc = new Nodo(p);
        if (isEmpty()) {
            testa = pc;
        } else {
            Nodo temp = testa;
            testa = pc;
            testa.setNext(temp);
        }
    }

    public PC pop() {
        if (isEmpty()) {
            return null;
        }
        PC p = (PC) testa.getInfo();
        testa = testa.getNext();
        return p;
    }

    public PC top(){
        if(isEmpty()){
            return null;
        }
        return (PC) testa.getInfo();
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
