package es30;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Mario", "Rossi", "123456789");
        rubrica.aggiungiContatto("Luca", "Bianchi", "987654321");
        rubrica.aggiungiContatto("Giulia", "Verdi", "111222333");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1) Aggiungi nuovo contatto");
            System.out.println("2) Ricerca per cognome e nome");
            System.out.println("3) Ricerca per numero di telefono");
            System.out.println("4) Elimina contatto per cognome e nome");
            System.out.println("5) Elimina contatto per numero di telefono");
            System.out.println("6) Stampa rubrica");
            System.out.println("0) Esci");

            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci il cognome: ");
                    String cognome = scanner.nextLine();
                    System.out.print("Inserisci il numero di telefono: ");
                    String numeroTelefono = scanner.nextLine();
                    if (rubrica.aggiungiContatto(nome, cognome, numeroTelefono)) {
                        System.out.println("Il contatto è stato aggiunto");
                    } else {
                        System.out.println("Il contatto non è stato aggiunto");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci il cognome: ");
                    cognome = scanner.nextLine();
                    System.out.print("Inserisci il nome: ");
                    nome = scanner.nextLine();
                    if (rubrica.ricercaPerNomeCognome(nome, cognome) != null) {
                        System.out.println("Il contatto e' stato trovato");
                    } else {
                        System.out.println("Il contatto non e' stato trovato");
                    }
                    break;
                case 3:
                    System.out.print("Inserisci il numero di telefono: ");
                    numeroTelefono = scanner.nextLine();
                    Contatto contatto = rubrica.ricercaPerNumeroTel(numeroTelefono);
                    if (contatto != null) {
                        System.out.println("Contatto trovato: " + contatto.getNome() + " " + contatto.getCognome());
                    } else {
                        System.out.println("Contatto non trovato");
                    }
                    break;
                case 4:
                    System.out.print("Inserisci il cognome: ");
                    cognome = scanner.nextLine();
                    System.out.print("Inserisci il nome: ");
                    nome = scanner.nextLine();
                    if (rubrica.eliminaNomeCognome(nome, cognome)) {
                        System.out.println("Il contatto e' stato eliminato");
                    } else {
                        System.out.println("Il contatto non e' stato eliminato");
                    }
                    break;
                case 5:
                    System.out.print("Inserisci il numero di telefono: ");
                    numeroTelefono = scanner.nextLine();
                    if (rubrica.eliminanumeroTelefono(numeroTelefono)) {
                        System.out.println("Il contatto e' stato eliminato");
                    } else {
                        System.out.println("Il contatto non e' stato eliminato");
                    }
                    break;
                case 6:
                    rubrica.stampaRubrica();
                    break;
                case 0:
                    System.out.println("Programma terminato");
                    scanner.close();
                    return;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
