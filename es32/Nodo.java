package es32;

public class Nodo {
    private OperaArte opera;
    private Nodo next;

    public Nodo(OperaArte opera) {
        this.opera = opera;
        this.next = null;
    }

    public OperaArte getOpera() {
        return opera;
    }

    public void setOpera(OperaArte opera) {
        this.opera = opera;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}