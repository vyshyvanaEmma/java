public class Nodo {
    private Nodo next;
    private Prodotto info;

    public Nodo(Prodotto info) {
        this.info = info;
        next = null;
    }

    public Prodotto getInfo() {
        return info;
    }

    public void setInfo(Prodotto info) {
        this.info = info;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

}