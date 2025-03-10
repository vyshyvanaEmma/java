public class Nodo {
    protected Nodo next;
    protected Prodotto info;

    public Nodo(Prodotto info) {
        this.info = info;
        this.next = null;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Prodotto getInfo() {
        return info;
    }
}