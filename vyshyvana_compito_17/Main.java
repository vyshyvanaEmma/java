public class Main {
    public static void main(String[] args) {
        Amatoriale am1 = new Amatoriale("Francesco", "Perrotta", "SGHSFHS7", "KLSKA5L67", 7, false);
        Amatoriale am2 = new Amatoriale("Alessandro", "Alighieri", "LPKLKJS78", "AGAV5678", 4, true);
        Amatoriale am3 = new Amatoriale("Leonardo", "Colli", "AHJKHJKHD457", "ESERDFXF34", 9, false);

        Agonista ag1 = new Agonista("Diego", "Zaccone", "RTRTYRYT4567", "PIDOWDBJHD456", 24, 5);
        Agonista ag2 = new Agonista("Max", "Bardi", "MJGHDHJGD567", "DJWKDWK09", 12, 4);
        Agonista ag3 = new Agonista("Diego", "Zaccone", "BDNKJNKWJ789", "PIDOWDBJHD456", 18, 2);

        Palestra p1 = new Palestra("Sport Club", "Via Parini 78");
        Palestra p2 = new Palestra("Body Build", "Via Mauro Rossi 128");

        p1.addTesserato(ag3);
        p1.addTesserato(am1);
        p2.addTesserato(am2);
        p2.addTesserato(ag2);
        p1.addTesserato(am3);
        p2.addTesserato(ag1);

        System.out.println("Elenco dei tesserati amatoriali con personal trainer (ordinati per codice fiscale): ");
        for (Amatoriale am : p1.listaAmatorialiTesseratiOrdinati()) {
            System.out.println(am.getNome());
        }

        System.out.println("Elenco dei tesserati agonisti (ordinati per gare svolte): ");
        for (Agonista ag : p1.listaAgonistiNumeroGareSvolteOrdinati(4, 10)) {
            System.out.println(ag.getNome());
        }

        System.out.println("Elenco dei tesserati agonisti con gare tra 4 e 10 (ordinati per codice fiscale): ");
        for (Agonista ag : p1.listaAgonistiNumeroGareSvolteOrdinati(4, 10)) {
            System.out.println(ag.getNome());
        }

        System.out.println("Elenco dei tesserati amatoriali comuni (ordinati per codice fiscale): ");
        for (Amatoriale am : p1.listaAmatorialiTesseratiPalestraComuni(p2)) {
            System.out.println(am.getNome());
        }
    }
}
