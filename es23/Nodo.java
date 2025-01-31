package es23;

public class Nodo {
    private String info;
    private Nodo next;

    public Nodo(String info) {
        this.info = info;
        this.next = null;
    }
    
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Nodo getNext() {
        return next;
    }
    public void setNext(Nodo next) {
        this.next = next;
    }

}
