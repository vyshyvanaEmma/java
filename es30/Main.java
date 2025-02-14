public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        Autore autore1 = new Autore("Mario", "Rossi", "RSSMRA80A01H501Z");
        Autore autore2 = new Autore("Luca", "Bianchi", "BNCXLC75D15H501Z");

        Libro libro1 = new Libro("Libro Uno", "978-1234567890", 2020, "EditoreA", 15.99, autore1);
        Libro libro2 = new Libro("Libro Due", "978-0987654321", 2021, "EditoreB", 20.99, autore2);
        Libro libro3 = new Libro("Libro Tre", "978-1122334455", 2019, "EditoreA", 18.50, autore1);
        Libro libro4 = new Libro("Libro Quattro", "978-1234567890", 2021, "EditoreB", 22.00, autore2); 
        System.out.println("Aggiungi libro1 (dovrebbe essere aggiunto): " + libreria.aggiungiLibro(libro1));
        System.out.println("Aggiungi libro2 (dovrebbe essere aggiunto): " + libreria.aggiungiLibro(libro2));
        System.out.println("Aggiungi libro3 (dovrebbe essere aggiunto): " + libreria.aggiungiLibro(libro3));
        System.out.println("Aggiungi libro4 (dovrebbe non essere aggiunto per ISBN duplicato): " + libreria.aggiungiLibro(libro4));

        System.out.println("\nVisualizza Coda dopo aggiunta dei libri:");
        libreria.visualizzaCoda();

        Libro libroEliminato = libreria.eliminaLibro();
        System.out.println("\nLibro eliminato: " + libroEliminato.getTitolo() + " (ISBN: " + libroEliminato.getIsbn() + ")");

        System.out.println("\nVisualizza Coda dopo eliminazione di un libro:");
        libreria.visualizzaCoda();

        System.out.println("\nNumero di libri scritti da Mario: " + libreria.numLibriAutore("Mario"));

        System.out.println("\nEliminati libri di Mario: " + libreria.eliminaLibriAutore("Mario"));

        System.out.println("\nVisualizza Coda finale:");
        libreria.visualizzaCoda();
    }
}
