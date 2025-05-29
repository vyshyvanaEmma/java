//Blocco che esegue il calcolo ((2a + 4) * (7b +3))
public class Block4 extends Thread{

    private int p1, p2, risultato;

    public Block4(int p1, int p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getRisultato() {
        return risultato;
    }

    public int getP2() {
        return p2;
    }

    public int getP1() {
        return p1;
    }

    //esegue il calcolo (2a + 4) * (7b +3)
    @Override
    public void run() {
        risultato = p1 * p2;
        System.out.println("Block 4 ((2a + 4) * (7b +3)): " + risultato);
        
        //faccio un  pausa per far effetto di tempo di eseguzione del calcolo
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Errore di eseguzione del calcolo");
        }
    }

}
