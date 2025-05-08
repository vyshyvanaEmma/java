package stampa_simboli;

public class PrinterSimboli {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Simbol('*'));
        thread1.start();

        Thread thread2 = new Thread(new Simbol('#'));
        thread2.start();
    }
}
