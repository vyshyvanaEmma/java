public class Test {
    public static void main(String args[]) {
        Cantante cantante1 = new Cantante("Paolo", "Gianino", "5G131321545A");
        Cantante cantante2 = new Cantante("Giovanna", "Perrotta", "12PR456464W");

        Canzone canzone1 = new Canzone("canz1", cantante1, 169, 1969, 169);
        Canzone canzone2 = new Canzone("canz2", cantante2, 129, 1978, 214);

        System.out.println(canzone1.dettaglioCanzone());
        System.out.println(cantante1.dettaglioCantante());

        System.out.println(canzone1.calcolaCostoalSecondo());
        System.out.println(canzone1.verificaCanzone(canzone1));
        System.out.println(canzone2.verificaCognomeCantante());
        System.out.println(canzone1.verificaDurata(canzone1.getDurata()));
        System.out.println(canzone1.UscitaCantante(canzone1));

    }
}