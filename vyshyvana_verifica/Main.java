public class Main{
    public static void main(String[] args) {

        
        BiglietteriaOnline biglietteriaOnline = new BiglietteriaOnline("Biglietteria");

        Biglietto biglietto1 = new Biglietto("B1", 10.6, 100, "Spettacolo1");
        Biglietto biglietto2 = new Biglietto("B2", 25.30, 50, "Spettacolo2");
        BigliettoCartaceo bigliettoCartaceo1 = new BigliettoCartaceo("BC1", 60.3, 300, "Spettacolo3", "Via Filarete 13");
        BigliettoCartaceo bigliettoCartaceo2 = new BigliettoCartaceo("BC2", 50.5, 400, "Spettacolo4", "Via Canova 94");
        BigliettoDigitale bigliettoDigitale1 = new BigliettoDigitale("BG1", 45.0, 600, "Spettacolo5", "utente1@gmail.com");
        BigliettoDigitale bigliettoDigitale2 = new BigliettoDigitale("BG2", 75.0, 800, "Spettacolo6", "utente2@gmail.com");


        // aggiunta
        if(biglietteriaOnline.aggiuntaBiglietto(biglietto1) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }

        if(biglietteriaOnline.aggiuntaBiglietto(biglietto2) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }

        if(biglietteriaOnline.aggiuntaBiglietto(bigliettoCartaceo1) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }
        if(biglietteriaOnline.aggiuntaBiglietto(bigliettoCartaceo2) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }

        if(biglietteriaOnline.aggiuntaBiglietto(bigliettoDigitale1) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }

        if(biglietteriaOnline.aggiuntaBiglietto(bigliettoDigitale2) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }
        if(biglietteriaOnline.aggiuntaBiglietto(bigliettoDigitale2) == true){
            System.out.println("Biglietto e' aggiunto");
        }else{
            System.out.println("Biglietto non e' aggiunto");
        }

        //stampa
        System.out.println("La biglietteria online: ");
        biglietteriaOnline.stampaTutto();

        //rimozione
        if(biglietteriaOnline.rimuovereBiglietto("BG1") == true){
            System.out.println("Biglietto e' rimosso");
        } else{
            System.out.println("Biglietto non e' rimosso");

        }
        //stampa
        System.out.println("La biglietteria online: ");
        biglietteriaOnline.stampaTutto();

        //stampa pila dei biglietti digitali 
        System.out.println("Pilla dei biglietti minore di 50");
        biglietteriaOnline.stampaPillaBigliettiDigitali(biglietteriaOnline.pilaBigliettiDigitali(50));
    
        // num biglietti cartacei
        System.out.println("Numero dei biglietti cartacei venduti: " + biglietteriaOnline.numBigliettiCartacei());

    }
    
}