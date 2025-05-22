package calcolatrice_multithread;

public class Moltiplicazione extends Operazione{

    public Moltiplicazione(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void run(){
        risultato = num1 * num2;
        System.out.println("Thread moltiplicazione completato");
    }
    
}
