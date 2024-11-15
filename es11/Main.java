public class Main {
    public static void main(String[] args) {
        LibroCartaceo libroCartaceo = new LibroCartaceo(10, true, "J.K. Rowling", "Harry Potter e la Pietra Filosofale", "9780747532743", 1997,
                "Bloomsbury", 19.99);

        LibroDigitale libroDigitale = new LibroDigitale(1500,".epub","George Orwell","Secker & Warburg", "9780451524935", 1949, "Balcone",
                8.99);
        LibreriaOnline libreria = new LibreriaOnline("Libri per tutti");

        libreria.aggiungiLibro(libroCartaceo);
        libreria.aggiungiLibro(libroDigitale);

        System.out.println("Prezzo libro cartaceo (ISBN 9780747532743): " + libreria.prezzoDelLibro("9780747532743") + "€");
        System.out.println("Titolo libro con ISBN 9780743273565: " + libreria.titoloDelLibro("9780743273565"));
        System.out.println("Titolo libro digitale (ISBN 9780451524935): " + libreria.titoloDelLibro("9780451524935"));
    }
}
