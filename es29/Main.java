package es29;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Autore autore1 = new Autore("Mario", "Rossi", "RSSMRA80A01H501Z");
        Autore autore2 = new Autore("Luca", "Bianchi", "BNCXLC75D15H501Z");

        Libro libro1 = new Libro("Libro Uno", "978-1234567890", 2020, "EditoreA", 15.99, autore1);
        Libro libro2 = new Libro("Libro Due", "978-0987654321", 2021, "EditoreB", 20.99, autore2);
        Libro libro3 = new Libro("Libro Tre", "978-1122334455", 2019, "EditoreA", 18.50, autore1);

        libreria.aggiungiLibro(libro1);
        libreria.aggiungiLibro(libro2);
        libreria.aggiungiLibro(libro3);

        libreria.visualizzaCoda();  

        System.out.println("Numero di libri di Mario: " + libreria.numLibriAutore("Mario"));

        System.out.println("Eliminati " + libreria.eliminaLibriAutore("Mario") + " libri di Mario");

        libreria.visualizzaCoda(); 
    }
}
