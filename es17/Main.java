public class Main {
    public static void main(String[] args) {
        CollezioneArte collezione = new CollezioneArte("Collezione Moderna", "Museo Centrale");

        Quadro quadro1 = new Quadro("Notte Stellata", "Van Gogh", 15000, 73.7, 92.1);
        Quadro quadro2 = new Quadro("La Gioconda", "Leonardo da Vinci", 850, 77, 53);
        Quadro quadro3 = new Quadro("Urlo", "Munch", 20000, 91, 73);

        Scultura scultura1 = new Scultura("David", "Michelangelo", 450, 2.0, 5.17, 2.0);
        Scultura scultura2 = new Scultura("Pensatore", "Rodin", 2000, 1.2, 1.8, 1.2);

        collezione.getOpere().add(quadro1);
        collezione.getOpere().add(quadro2);
        collezione.getOpere().add(quadro3);
        collezione.getOpere().add(scultura1);
        collezione.getOpere().add(scultura2);

        System.out.println("Artista dell'opera più costosa: " + collezione.artistaOperaPiuCostosa());
        System.out.println("Quantità di quadri: " + collezione.quantitaQuadro());
        System.out.println("Quantità di sculture: " + collezione.quantitaScultura());
        System.out.println("Valore totale della collezione: " + collezione.prezzoTotaleCollezione());
        System.out.println("Valore totale dei quadri: " + collezione.prezzoTotaleCollezioneQuadri());
        System.out.println("Valore totale delle sculture: " + collezione.prezzoTotaleCollezioneSculture());

        System.out.println("\nOpere ordinate per prezzo crescente:");
        collezione.ordinaOperePerPrezzo(true);
        System.out.println(collezione.datiOpere());

        System.out.println("\nOpere ordinate per prezzo decrescente:");
        collezione.ordinaOperePerPrezzo(false);
        System.out.println(collezione.datiOpere());

        double valoreDiRiferimento = 3000000;
        System.out.println("\nOpere con quotazione maggiore di " + valoreDiRiferimento + ":");
        for (OpereArte opera : collezione.opereMagiore(valoreDiRiferimento)) {
            System.out.println(opera);
        }

        System.out.println("\nOpere con quotazione maggiore della media:");
        for (OpereArte opera : collezione.opereMagioreMedia(collezione.prezzoTotaleCollezione())) {
            System.out.println(opera);
        }
    }
}
