//Blocco che esegue il calcolo (7b + 3)
public class Block2 extends Thread{
    private int b, risultato;

    public Block2(int b){
        this.b = b;
    }

    public int getRisultato() {
        return risultato;
    }

    public int getB() {
        return b;
    }

    //esegue il calcolo 7b + 3
    @Override
    public void run() {
        risultato = 7 * b + 3;
        System.out.println("Block 2 (7b + 3): " + risultato);
        
        //faccio un  pausa per far effetto di tempo di eseguzione del calcolo
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Errore di eseguzione del calcolo");
        }
    }

}
