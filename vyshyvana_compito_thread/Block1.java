//Blocco che esegue il calcolo (2a + 4)
public class Block1 extends Thread{

    private int a, risultato;

    public Block1(int a){
        this.a = a;
    }

    public int getRisultato() {
        return risultato;
    }

    public int getA() {
        return a;
    }

    //esegue il calcolo 2a + 4
    @Override
    public void run() {
        risultato = 2 * a + 4;
        System.out.println("Block 1 (2a + 4): " + risultato);
        
        //faccio un  pausa per far effetto di tempo di eseguzione del calcolo
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Errore di eseguzione del calcolo");
        }
    }

}
