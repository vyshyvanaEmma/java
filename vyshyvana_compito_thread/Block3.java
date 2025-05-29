public class Block3 extends Thread{

    private int c, risultato;

    public Block3(int c){
        this.c = c;
    }

    public int getRisultato() {
        return risultato;
    }

    public int getC() {
        return c;
    }

    //esegue il calcolo 10 * c
    @Override
    public void run() {
        risultato = 10 * c;
        System.out.println("Block 3 (10 * c): " + risultato);
        
        //faccio un  pausa per far effetto di tempo di eseguzione del calcolo
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Errore di eseguzione del calcolo");
        }
    }

}
