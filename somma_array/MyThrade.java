package somma_array;

public class MyThrade extends Thread{
    private int inizio, fine;
    private int [] numeri;
    private int [] risParziali;
    private int pos;

    MyThrade(int [] numeri, int inizio, int fine, int [] risParziali, int pos){
        this.numeri = numeri;
        this.inizio = inizio;
        this.fine = fine;
        this.risParziali = risParziali;
        this.pos = pos;
    }

    @Override
    public void run() {
        int somma = 0;
        for(int i = inizio; i <= fine; i++){
            somma += numeri[i];
        }
        risParziali[pos] = somma;
    }
}
