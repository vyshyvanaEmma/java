package es23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int scelta = 0;
        Scanner in = new Scanner(System.in);
        
        while (true) {
            System.out.println("######  MENU #####\r\n" + 
                "Gestione lista parole, scegliere l'operazione da eseguire:\r\n" + 
                "1) Inserisci una nuova parola nella lista\r\n" + 
                "2) Cancella la parola in lista\r\n" + 
                "3) Stampa tutto il contenuto della lista\r\n" + 
                "4) ....\r\n" + 
                "5) ....\r\n" + 
                "6) ...\r\n" + 
                "0)Termina il programma");
            System.out.println("Inserisci la tua scelta: ");
            
            try {
                scelta = in.nextInt();
                in.nextLine();  
            } catch (Exception e) {
                System.out.println("\nErrore! (Inserisci un numero da 0 a 6)\n");
                in.nextLine();
                continue; 
            }

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la parola da inserire: ");
                    String parola = in.nextLine();
                    if(lista.addWord(parola)){
                        System.out.println("\nLa parola e' stata inserita con successo. \n" );
                    } else {
                        System.out.println("\nErrore, la parola potrebbe essere gia' stata inserita. \n" );
                    }
                    break;
                case 2:
                System.out.println("Inserisci la parola da rimuovere: ");
                String pRimuovo = in.nextLine();
                    if (lista.rimuoviPrimaParola(pRimuovo)) {
                        System.out.println("La prima parola e' stata rimossa dalla lista.");
                    } else {
                        System.out.println("La lista è vuota o la parola inserita non e' presente nella lista.");
                    }
                    break;
                case 3: 
                    
                    System.out.println("Contenuto della lista:");
                    lista.stampaLista();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6: 
                    
                    break;
                case 0: 
                    System.out.println("Programma terminato.");
                    in.close(); 
                    return; 
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
    }
}
