package calcolatrice_multithread;

public class Operazione implements Runnable{


    protected double num1, num2, risultato;

    public Operazione(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getRisultato(){
        return risultato;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
