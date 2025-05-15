package somma_array;

public class Main {
    public static void main(String[] args) {
        int valNum = 50;
        int numThread = 5;

        int [] numeri = new int[valNum];
        int [] risultati = new int[numThread];

        for(int i = 0; i < numeri.length; i++){
            numeri[i] = 1;
        }

        MyThrade t1 = new MyThrade(numeri, 0, 9, risultati, 0);
        MyThrade t2 = new MyThrade(numeri, 10, 19, risultati, 1);
        MyThrade t3 = new MyThrade(numeri, 20, 29, risultati, 2);
        MyThrade t4 = new MyThrade(numeri, 30, 39, risultati, 3);
        MyThrade t5 = new MyThrade(numeri, 40, 49, risultati, 4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("Il main è stato interoto!");
        }

        int sommaTot = 0;
        for(int i = 0; i < risultati.length; i++){

            int parziale = risultati[i];

            sommaTot += parziale;
        }

        System.out.println("Risultati parziali: ");
        for(int i = 0; i < risultati.length; i++){
            System.out.println("Thread " + (i+1) + ": " + risultati[i]);
        }
        System.out.println("Somma totale: " + sommaTot);

    }
}
