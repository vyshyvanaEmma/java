import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{

            //inserimento dei valori da utete
            System.out.println("Inserisci a: ");
            int a = scanner.nextInt();
        
            System.out.println("Inserisci b: ");
            int b = scanner.nextInt();    
        
            System.out.println("Inserisci c: ");
            int c = scanner.nextInt();
        
            //faccio i de block per due calcoli diversi
            Block1 block1 = new Block1(a); //block per calcolare 2a + 4 
            Block2 block2 = new Block2(b); // block per calcolare 7b + 3 
            Block3 block3 = new Block3(c); //block per calcolare 10 * c; 

            //avvia il thread
            block1.start();
            block2.start();
            block3.start();
        
            //termina il proccesso
            block1.join();
            block2.join();
            block3.join();

            //divido il calcolo in due parti
            int parte1 = block1.getRisultato(); //parte che fa 2a + 4 
            int parte2 = block2.getRisultato(); //parte che fa 7b + 3 
            int parte3 = block3.getRisultato(); //parte che fa 10 * c;

            Block4 block4 = new Block4(parte1, parte2); // per fare la moltiplicazione tra le prime due parti
            block4.start();
            block4.join();

            int parte4 = block4.getRisultato(); //parte che fa (2a + 4) * (7b +3)

            //calcolo del risultato finale 5 * [(2a + 4) * (7b +3)] - 10c
            int risultato = 5 * parte4 - parte3;

            System.out.println("Il risultato del calcolo e': " + risultato);
        } catch(Exception e){

            //controllo dell'errore
            System.out.println("Errore nel calcolo o nell'elaborazione");
        }

        scanner.close();
    }
}