public class Test {
    public static void main(String args[]) {
        Produttore produttore1 = new Produttore(" Paolo ", " Gianino ", " Italia ", " AKAPAOLO09A ");
        Produttore produttore2 = new Produttore(" Giovanna ", " Perrotta "," Italia ", " 12PR456464W ");
 
        Prodotto prodotto1 = new Prodotto(" prodotto1 ", produttore1, " P1 ", 169);
        Prodotto prodotto2 = new Prodotto(" prodotto2 ", produttore2, " P2 ", 214);

        System.out.println(prodotto2.dettaglioProdotto());
        System.out.println(produttore2.dettaglioProduttore());
        System.out.println(prodotto1.dettaglioProdotto());
        System.out.println(produttore1.dettaglioProduttore());

        System.out.println(prodotto1.getCodiceProdotto());
        System.out.println(prodotto1.calcolaPrezzoScontato(15));
        System.out.println(prodotto1.verificaInizioFineDescrizione());
        System.out.println(prodotto1.verificaProduttore(" PROD1 "));
        System.out.println(prodotto1.verificaPrezzo(150));
        System.out.println(prodotto1.dettaglioProdotto());
    }
}