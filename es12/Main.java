import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Autore autore1 = new Autore("Mario", "Rossi", "SSSf5");
        Autore autore2 = new Autore("Luisa", "Bianchi", "SSFFr7");

        LibroCartaceo libro1 = new LibroCartaceo(1.5, true, "Mario", "Rossi", "RSSMRA80A01H501Z", 
                                                 "La Programmazione Java", "978-1234567890", 2020, 
                                                 "Casa Editrice ABC", 29.99);
        LibroCartaceo libro2 = new LibroCartaceo(1.2, false, "Luisa", "Bianchi", "BNCLSA95C56Z404L", 
                                                 "Introduzione a Python", "978-0987654321", 2018, 
                                                 "Casa Editrice XYZ", 19.99);
        LibroDigitale libro3 = new LibroDigitale("Dante", "Alighieri", "SGSHSGJ89", 
                                                15674, "pdf", "Commedia", "whnsjkshbwjbshwjbshwjbs", 
                                                1342, "Perrotta Editrice", 20);


        LibreriaOnline libreria = new LibreriaOnline("Libreria Online");


        libreria.aggiungiLibro(libro1);
        libreria.aggiungiLibro(libro2);
        libreria.aggiungiLibro(libro3);

        System.out.println("Libri in magazzino:");
        libreria.stampaLibri();

        System.out.println("\nPrezzo del libro con ISBN 978-1234567890: " + libreria.prezzoDelLibro("978-1234567890"));

        System.out.println("Titolo del libro con ISBN 978-1122334455: " + libreria.titoloDelLibro("978-1122334455"));

        LibroCartaceo libroAggiornato = new LibroCartaceo(1.5, true, "Mario", "Rossi", "RSSMRA80A01H501Z", 
        "La Programmazione Java", "978-1234567890", 2020, 
        "Casa Editrice ABC", 29.99);

        libreria.aggiungiLibro(libroAggiornato);

        System.out.println("\nLibri in magazzino dopo aggiornamento:");
        libreria.stampaLibri();

        Libro libroPiùAlto = libreria.libroPrezzoPiuAlto(20);

        if (libroPiùAlto != null) {
            System.out.println("Libro con il prezzo più alto: " + libroPiùAlto.getTitolo() + " - Prezzo: " + libroPiùAlto.getPrezzoDiVendita());
        } else {
            System.out.println("Nessun libro disponibile.");
        }
        
        ArrayList<Libro> libriOrdinatiCrescenti = libreria.stampaOrdinataPerTitolo(true);
        System.out.println("Libri ordinati per titolo crescente:");
        for (Libro libro : libriOrdinatiCrescenti) {
            System.out.println(libro.getTitolo());
        }

        ArrayList<Libro> libriOrdinatiDecrescenti = libreria.stampaOrdinataPerTitolo(false);
        System.out.println("\nLibri ordinati per titolo decrescente:");
        for (Libro libro : libriOrdinatiDecrescenti) {
            System.out.println(libro.getTitolo());
        }
    }
}
