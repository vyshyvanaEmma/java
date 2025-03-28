public class Calcolatrice {

    public double somma(double a, double b) {
        return a + b;
    }

    public double sottrai(double a, double b) {
        return a - b;
    }

    public double moltiplica(double a, double b) {
        return a * b;
    }

    public double dividi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero non permessa");
        }
        return a / b;
    }
}
