package prova_thread;

public class Main {
    public static void main(String[] args) {

        int [] numeri = new int[10];
        Thread [] arrayThread = new Thread[5];

        for(int i = 0; i < numeri.length; i++){
            numeri[i] = 1;
        }

        MyThread t1 = new MyThread(numeri, 0, 4);
        MyThread t2 = new MyThread(numeri, 5, 10);

        t1.start();
        t2.start();

        //asspetta che i tthread terminano l'esecuzione - join()
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Il main è stato interoto!");
        }

        int somma1 = t1.getSomma();
        System.out.println("Somma 1: " + somma1);
        int somma2 = t2.getSomma();
        System.out.println("Somma 2: " + somma2);
        int sommaTot = somma1 + somma2;

        System.out.println("La somma dell'array è: " + sommaTot);

        /*for(int i = 0; i <= numeri.length; i++){
            System.out.println(numeri[i] + " ");

        }*/

        //System.out.println("Ciao dal main:");
        //t.run();
    }   
}
