import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibreriaOnline libreria = new LibreriaOnline("Libreria di Test");

        LibroCartaceo libro1 = new LibroCartaceo(
            1.2, true, "Mario", "Rossi", "MROSS1234", "Libro Cartaceo 1",
            "ISBN123", 2020, "Casa Editrice A", 19.99, 10
        );

        LibroCartaceo libro2 = new LibroCartaceo(
            0.8, false, "Luigi", "Verdi", "LVERD5678", "Libro Cartaceo 2",
            "ISBN456", 2021, "Casa Editrice B", 15.99, 5
        );

        LibroDigitale libro3 = new LibroDigitale(
            "Anna", "Bianchi", "ABIAN7890", "Libro Digitale 1",
            "ISBN789", 2022, "Casa Editrice C", 9.99, 500, ".pdf"
        );

        LibroDigitale libro4 = new LibroDigitale(
            "Giulia", "Neri", "GNERI1234", "Libro Digitale 2",
            "ISBN101", 2023, "Casa Editrice D", 12.99, 1000, ".epub"
        );

        libreria.aggiungiLibro(libro1);
        libreria.aggiungiLibro(libro2);
        libreria.aggiungiLibro(libro3);
        libreria.aggiungiLibro(libro4);

        System.out.println("\nAggiunta di un libro già esistente:");
        boolean aggiunto = libreria.aggiungiLibro(new LibroCartaceo(
            0.5, false, "Mario", "Rossi", "MROSS1234", "Libro Cartaceo 1",
            "ISBN123", 2020, "Casa Editrice A", 19.99, 5
        ));
        System.out.println("Libro aggiunto? " + aggiunto);

        System.out.println("\nPrezzo del libro con ISBN ISBN123: " + libreria.prezzoDelLibro("ISBN123"));
        System.out.println("Titolo del libro con ISBN ISBN123: " + libreria.titoloDelLibro("ISBN123"));

        System.out.println("\nLibro con prezzo più alto:");
        Libro libroPiuCaro = libreria.libroPrezzoPiuAlto();
        System.out.println(libroPiuCaro);

        System.out.println("\nLibri ordinati per titolo (crescente):");
        ArrayList<Libro> libriOrdinatiTitolo = libreria.stampaOrdinataPerTitolo(true);
        for (Libro libro : libriOrdinatiTitolo) {
            System.out.println(libro);
        }

        System.out.println("\nLibri ordinati per prezzo (decrescente):");
        ArrayList<Libro> libriOrdinatiPrezzo = libreria.stampaOrdinataPerPrezzo(false);
        for (Libro libro : libriOrdinatiPrezzo) {
            System.out.println(libro);
        }

        System.out.println("\nAutori ordinati per cognome e nome (crescente):");
        ArrayList<String> autoriOrdinati = new ArrayList<>(libreria.getAutoriOrdinati(true));
        for (String autore : autoriOrdinati) {
            System.out.println(autore);
        }

        System.out.println("\nRimozione del libro con ISBN ISBN123:");
        boolean rimosso = libreria.rimuoviLibro("ISBN123");
        System.out.println("Libro rimosso? " + rimosso);

        System.out.println("\nLibreria dopo la rimozione:");
        ArrayList<Libro> libriRimasti = libreria.getLibri();
        for (Libro libro : libriRimasti) {
            System.out.println(libro);
        }
    }
}
