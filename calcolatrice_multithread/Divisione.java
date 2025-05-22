package calcolatrice_multithread;

public class Divisione extends Operazione{

    public Divisione(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public void run(){
        if(num2 == 0){
            System.out.println("Errore: divisione per 0");
            risultato = Double.NaN;
        }else{
            risultato = num1 / num2;
        }
        System.out.println(Thread.currentThread().getName() + " completato");
    }
    
}
