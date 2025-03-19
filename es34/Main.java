public class Main {
    public static void main(String[] args) {
        PilaProdotto pilaIniziale = new PilaProdotto();
        PilaPC pilaPc = new PilaPC();
        PilaTablet pilaTablet = new PilaTablet();
        NastroTrasportatore nastro = new NastroTrasportatore();

        PC pc1 = new PC(1, 2.5, " gaming");
        Tablet tablet1 = new Tablet(2, 1.2, "iPad ");
        Prodotto prodottoGenerico = new Prodotto(3, 0.5);
        PC pc2 = new PC(4, 3.0, " ultrabook");
        Tablet tablet2 = new Tablet(5, 0.8, "samsung galaxy");

        pilaIniziale.push(pc1);
        pilaIniziale.push(tablet1);
        pilaIniziale.push(prodottoGenerico);
        pilaIniziale.push(pc2);
        pilaIniziale.push(tablet2);

        System.out.println("Pila iniziale:");
        System.out.println(strInfo(pilaIniziale));

        nastro.trasferisci(pilaIniziale, pilaPc, pilaTablet);

        System.out.println("\nPila PC dopo il trasferimento:");
        System.out.println(strInfo(pilaPc));

        System.out.println("\nPila Tablet dopo il trasferimento:");
        System.out.println(strInfo(pilaTablet));

        System.out.println("\nPila iniziale dopo il trasferimento:");
        System.out.println(strInfo(pilaIniziale));
    }

    public static String strInfo(PilaProdotto p) {
        StringBuilder sb = new StringBuilder();
        Nodo corrente = p.getTesta();
        while (corrente != null) {
            sb.append(corrente.getInfo().toString()).append("\n");
            corrente = corrente.getNext();
        }
        return sb.toString();
    }

    public static String strInfo(PilaPC p) {
        StringBuilder sb = new StringBuilder();
        Nodo corrente = p.getTesta();
        while (corrente != null) {
            sb.append(corrente.getInfo().toString()).append("\n");
            corrente = corrente.getNext();
        }
        return sb.toString();
    }

    public static String strInfo(PilaTablet p) {
        StringBuilder sb = new StringBuilder();
        Nodo corrente = p.getTesta();
        while (corrente != null) {
            sb.append(corrente.getInfo().toString()).append("\n");
            corrente = corrente.getNext();
        }
        return sb.toString();
    }
}