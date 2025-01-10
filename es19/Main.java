public class Main {
    public static void main(String[] args) {
        BagaglioAMano bagaglio1 = new BagaglioAMano("Mario Rossi", 10);
        BagaglioAMano bagaglio2 = new BagaglioAMano("Luigi Verdi", 7);
        BagaglioStiva bagaglio3 = new BagaglioStiva("Anna Bianchi", 30);
        BagaglioStiva bagaglio4 = new BagaglioStiva("Marco Neri", 20);

        Volo volo1 = new Volo("AZ123", "Roma", "Milano", "2025-01-10");
        Volo volo2 = new Volo("AZ456", "Napoli", "Torino", "2025-01-11");

        volo1.inserimentoBagagli(bagaglio1);
        volo1.inserimentoBagagli(bagaglio2);
        volo1.inserimentoBagagli(bagaglio3);
        volo1.inserimentoBagagli(bagaglio4);

        volo2.inserimentoBagagli(new BagaglioStiva("Anna Bianchi", 30));
        volo2.inserimentoBagagli(new BagaglioAMano("Carlo Rossi", 12));

        System.out.println("Totale tariffe supplementari volo1: " + volo1.totaleTariffeSuplemetari() + " €");
        System.out.println("Totale peso eccedente volo1: " + volo1.totalePesoEccedente() + " kg");

        System.out.println("\nElenco bagagli a mano volo1:");
        for (Bagaglio b : volo1.elencoBagagliAMano()) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        System.out.println("\nElenco bagagli da stiva con peso eccedente volo1:");
        for (Bagaglio b : volo1.elencoBagagliStiva()) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        System.out.println("\nElenco bagagli a mano che superano 8 kg nel volo1:");
        for (Bagaglio b : volo1.elencoBagagliPesoMax(8)) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        System.out.println("\nBagagli da stiva comuni tra volo1 e volo2:");
        for (Bagaglio b : volo1.elencoBagagliComuni(volo2)) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        System.out.println("\nRimozione bagaglio 'Mario Rossi' dal volo1: " + (volo1.rimozioneBagagli("Mario Rossi") ? "Successo" : "Fallimento"));
        System.out.println("Ricerca bagaglio 'Mario Rossi' nel volo1: " + (volo1.ricercaBagagli("Mario Rossi") ? "Trovato" : "Non trovato"));
    }
}
