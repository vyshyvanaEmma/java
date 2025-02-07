public class Main{
    public static void main(String[] args) {
        List<Nodo> listaNodi = new java.util.ArrayList<>();  
        Pila<Libro> pilaLibri = new PilaLibriImpl(listaNodi);

        Libro libro1 = new LibroFiction("Autore1", "Libro1", "123456", 2020, "CasaEditrice1", 19.99);
        Libro libro2 = new LibroFiction("Autore2", "Libro2", "789012", 2021, "CasaEditrice2", 24.99);
        Libro libro3 = new LibroFiction("Autore3", "Libro3", "345678", 2022, "CasaEditrice3", 29.99);

        pilaLibri.push(libro1);
        pilaLibri.push(libro2);
        pilaLibri.push(libro3);

        System.out.println("Libro in cima alla pila: " + pilaLibri.top());

        System.out.println("Rimosso dalla pila: " + pilaLibri.pop());

        System.out.println("Libro in cima alla pila dopo rimozione: " + pilaLibri.top());

        pilaLibri.clear();
        System.out.println("La pila è vuota: " + pilaLibri.isEmpty());
    }
}