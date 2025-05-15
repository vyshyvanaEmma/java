package prova_thread;

public class MyThread extends Thread{

    private int inizio;
    private int fine;
    private int [] numeri;
    private int somma;

    public MyThread(int [] numeri, int inizio, int fine){
        this.numeri = numeri;
        this.inizio = inizio;
        this.fine = fine;
    }

    @Override
    public void run(){
        //System.out.println("Ciao dal thread: " + this.getName());
        /*for(int i = 0; i <= 5; i++){
            System.out.println(this.getName() + " sta contando: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Il thread è stato interoto");
            }
        }*/

        for(int i = inizio; i <= fine; i++){
            somma += numeri[i];
        }
    }

    public int getSomma() {
        return somma;
    }

    public void setSomma(int somma) {
        this.somma = somma;
    }

}