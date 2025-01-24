import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Autore autore1 = new Autore("Mario", "Rossi", "RSSMRA80A01H501Z");
        Autore autore2 = new Autore("Luisa", "Bianchi", "BNCLSA95C56Z404L");
        Autore autore3 = new Autore("Dante", "Alighieri", "DLGHRT87A01F501Z");

        LibroCartaceo libro1 = new LibroCartaceo(
            1.2, false, "Luisa", "Bianchi", "BNCLSA95C56Z404L",
            "Introduzione a Python", "978-0987654321",
            2018, "Casa Editrice XYZ", 19.99, 10
        );

        LibroCartaceo libro2 = new LibroCartaceo(
            1.2, false, "Luisa", "Bianchi", "BNCLSA95C56Z404L",
            "Introduzione a Python", "978-0987654321",
            2018, "Casa Editrice XYZ", 19.99, 10
        );
        

        LibroDigitale libro3 = new LibroDigitale(
            "Dante", "Alighieri", "DLGHRT87A01F501Z",
            "Commedia", "978-1239876543",
            1342, "Perrotta Editrice", 9.99,
            15674, "pdf"
        );
 LibreriaOnline libreria = new LibreriaOnline("Libreria Online");

       libreria.aggiungiLibro(libro1);
        libreria.aggiungiLibro(libro2);
        libreria.aggiungiLibro(libro3);

        System.out.println("Libri in magazzino:");
        for (Libro libro : libreria.getLibri()) {
            System.out.println(libro);
        }

        System.out.println("\nPrezzo del libro con ISBN 978-1234567890: " + libreria.prezzoDelLibro("978-1234567890"));

       String titoloLibro = libreria.titoloDelLibro("978-1122334455");
        if (titoloLibro != null) {
            System.out.println("Titolo del libro con ISBN 978-1122334455: " + titoloLibro);
        } else {
            System.out.println("Il libro con ISBN 978-1122334455 non è disponibile.");
        }

        LibroCartaceo libroAggiornato = new LibroCartaceo(
            1.2, false, "Luisa", "Bianchi", "BNCLSA95C56Z404L",
            "Introduzione a Python", "978-0987654321",
            2018, "Casa Editrice XYZ", 19.99, 10
        );
        libreria.aggiungiLibro(libroAggiornato);

        System.out.println("\nLibri in magazzino dopo aggiornamento:");
        for (Libro libro : libreria.getLibri()) {
            System.out.println(libro);
        }

        Libro libroPiuCaro = libreria.libroPrezzoPiuAlto();
        if (libroPiuCaro != null) {
            System.out.println("\nLibro con il prezzo più alto: " + libroPiuCaro.getTitolo() + " - Prezzo: " + libroPiuCaro.getPrezzoDiVendita());
        } else {
            System.out.println("\nNessun libro disponibile.");
        }

        ArrayList<Libro> libriOrdinatiCrescenti = libreria.stampaOrdinataPerTitolo(true);
        System.out.println("\nLibri ordinati per titolo crescente:");
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
