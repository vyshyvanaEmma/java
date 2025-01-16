package es20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creazione dei voli
        Volo volo1 = new Volo("AZ123", "Roma", "Milano", "2025-01-16");
        Volo volo2 = new Volo("AZ456", "Parigi", "Roma", "2025-01-17");

        // Creazione dei bagagli
        BagaglioAMano bagaglio1 = new BagaglioAMano("Mario Rossi", 9.5);
        BagaglioAMano bagaglio2 = new BagaglioAMano("Luigi Verdi", 7.8);
        BagaglioStiva bagaglio3 = new BagaglioStiva("Giulia Bianchi", 26.0);
        BagaglioStiva bagaglio4 = new BagaglioStiva("Anna Neri", 24.0);

        // Aggiunta dei bagagli ai voli
        volo1.add(bagaglio1);
        volo1.add(bagaglio2);
        volo1.add(bagaglio3);
        volo1.add(bagaglio4);

        volo2.add(bagaglio3);

        // Creazione dei proprietari
        Proprietario proprietario1 = new Proprietario("Mario Rossi");
        Proprietario proprietario2 = new Proprietario("Luigi Verdi");

        // Aggiunta dei bagagli ai proprietari
        proprietario1.addBagaglio(bagaglio1);
        proprietario1.addBagaglio(bagaglio3);

        proprietario2.addBagaglio(bagaglio2);
        proprietario2.addBagaglio(bagaglio4);

        System.out.println("Tariffe supplementari totali (volo 1): " + volo1.calcolaTariffeSupplementari() + " euro");
        System.out.println("Peso eccedente totale (volo 1): " + volo1.calcolaPesoEccedente() + " kg");

        ArrayList<BagaglioAMano> bagagliAMano = volo1.elencoBagagliAMano();
        System.out.println("Bagagli a mano (volo 1):");
        for (BagaglioAMano b : bagagliAMano) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }
        ArrayList<BagaglioStiva> bagagliStivaEccedenti = volo1.elencoBagagliStivaEccedenti();
        System.out.println("Bagagli da stiva eccedenti (volo 1):");
        for (BagaglioStiva b : bagagliStivaEccedenti) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        double pesoLimite = 8.0;
        ArrayList<BagaglioAMano> bagagliAManoSuperano = volo1.elencoBagagliAManoSuperano(pesoLimite);
        System.out.println("Bagagli a mano che superano " + pesoLimite + " kg (volo 1):");
        for (BagaglioAMano b : bagagliAManoSuperano) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        ArrayList<BagaglioStiva> bagagliStivaComuni = volo1.elencoBagagliStivaComuni(volo2);
        System.out.println("Bagagli da stiva comuni tra volo 1 e volo 2:");
        for (BagaglioStiva b : bagagliStivaComuni) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        String nomeRicerca = "Mario Rossi";
        Bagaglio bagaglioTrovato = volo1.ricercaB(nomeRicerca);
        if (bagaglioTrovato != null) {
            System.out.println("Bagaglio trovato: " + bagaglioTrovato.getNome() + ", peso: " + bagaglioTrovato.getPeso() + " kg");
        } else {
            System.out.println("Bagaglio con nome " + nomeRicerca + " non trovato.");
        }

        boolean rimosso = volo1.rimuoviB(bagaglio1);
        System.out.println("Bagaglio di " + bagaglio1.getNome() + (rimosso ? " rimosso con successo." : " non trovato."));

        System.out.println("Bagagli rimanenti nel volo 1:");
        for (Bagaglio b : volo1.getBagagli()) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        System.out.println("Numero di bagagli eccedenti (proprietario 1): " + proprietario1.numeroBagagliEccedenti());


        ArrayList<Bagaglio> bagagliOrdinati = proprietario1.elencoBagagliOrdinatiPerPeso();
        System.out.println("Bagagli ordinati per peso (proprietario 1):");
        for (Bagaglio b : bagagliOrdinati) {
            System.out.println("- " + b.getNome() + ", peso: " + b.getPeso() + " kg");
        }

        String proprietarioConPiùBagagli = Proprietario.confrontaBagagli(proprietario1, proprietario2);
        System.out.println("Il proprietario con più bagagli tra " + proprietario1.getNome() + " e " + proprietario2.getNome() + " è: " + proprietarioConPiùBagagli);
    }
}
