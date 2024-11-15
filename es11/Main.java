public class Main {
    public static void main(String[] args) {
        LibroCartaceo libroCartaceo = new LibroCartaceo(1.5, true, "Mario", "Rossi", "RSSMRA80A01H501Z", 
        "La Programmazione Java", "978-1234567890", 2020, 
        "Casa Editrice ABC", 29.99);

        LibroDigitale libroDigitale = new LibroDigitale("Mario", "Rossi", "RSSMRA80A01H501Z", 500, ".pdf", 
        "Corso di HTML", "978-1122334455", 2022, 
        "Casa Editrice QRS", 9.99);
        LibreriaOnline libreria = new LibreriaOnline("Libri per tutti");

        libreria.aggiungiLibro(libroCartaceo);
        libreria.aggiungiLibro(libroDigitale);

        System.out.println("Prezzo libro cartaceo (ISBN 9780747532743): " + libreria.prezzoDelLibro("9780747532743") + "€");
        System.out.println("Titolo libro con ISBN 9780743273565: " + libreria.titoloDelLibro("9780743273565"));
        System.out.println("Titolo libro digitale (ISBN 9780451524935): " + libreria.titoloDelLibro("9780451524935"));
    }
}
