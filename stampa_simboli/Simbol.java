package stampa_simboli;

public class Simbol implements Runnable{
    private int conta = 0;
    private char simbolo;

    public Simbol(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(simbolo);
            conta++;

            if(conta % 50 == 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    
}
