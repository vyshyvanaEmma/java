package calcolatrice_multithread;

import java.util.Scanner;

public class Multithread {
    public static void main(String[] args) {
        //double num1 = 10;
        //double num2 = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        scanner.close();

        Operazione somma = new Somma(num1, num2);
        Operazione sottrazione = new Sottrazione(num1, num2);
        Operazione moltplicazione = new Moltiplicazione(num1, num2);
        Operazione divisione = new Divisione(num1, num2);

        Thread threadSomma = new Thread(somma, "thread somma");
        Thread threadSottrazione = new Thread(sottrazione, "thread sottrazione");
        Thread threadMoltiplicazione = new Thread(moltplicazione, "thread moltiplicazione");
        Thread threadDivisione = new Thread(divisione, "thread divisione");

        threadSomma.start();
        threadSottrazione.start();
        threadMoltiplicazione.start();
        threadDivisione.start();

        try{
            threadSomma.join();
            threadSottrazione.join();
            threadMoltiplicazione.join();
            threadDivisione.join();
            System.out.println("\n Risultati: ");
            System.out.println("Somma " + somma.getRisultato());
            System.out.println("Sottrazione " + sottrazione.getRisultato());
            System.out.println("Moltiplicazione " + moltplicazione.getRisultato());
            if(!Double.isNaN(divisione.getRisultato())){
                
                System.out.println("Divisione " + divisione.getRisultato());
            } else{
                System.out.println("Divisione per 0 - imposibile");
            }
        } catch(InterruptedException e){
            System.out.println("Errore: un thread e' stato interotto");
        }

    }
}
