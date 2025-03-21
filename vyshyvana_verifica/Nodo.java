//package vyshyvana_verifica;
public class Nodo {
    private Biglietto info;
    private Nodo next;

    public Nodo(Biglietto b) {
        info = b;
        next = null;
    } 

    public Biglietto getInfo() {
        return info;
    }

    public void setInfo(Biglietto info) {
        this.info = info;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }


}
