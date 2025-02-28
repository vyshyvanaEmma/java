package es32;

class Nodo {
    OperaDArte opera;
    Nodo next;

    public Nodo(OperaDArte opera) {
        this.opera = opera;
        this.next = null;
    }
}
