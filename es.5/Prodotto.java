public class Prodotto {

    private String descrizione;
    private String codiceProdotto;
    private Produttore produttore;
    private float prezzo;
    private static int conta = 0;

    public Prodotto(String descrizione, Produttore produttore, String codiceProdotto, float prezzo) {
        conta++;
        this.descrizione = descrizione;
        this.produttore = produttore;
        this.codiceProdotto = codiceProdotto;
        this.prezzo = prezzo;

    }

    public Prodotto(Prodotto prodottoCopy) {
        conta++;
        generaCodice();
        this.descrizione = prodottoCopy.getDescrizione();
        this.produttore = new Produttore(prodottoCopy.getProduttore());
        this.codiceProdotto = prodottoCopy.getCodiceProdotto();
        this.prezzo = prodottoCopy.getPrezzo();

    }

    private String generaCodice(){
        return "P" + conta;
    }

    public float calcolaPrezzoScontato(int sconto){
        return (this.getPrezzo() * sconto) / 100;
    }

    public boolean verificaProduttore(String idInput) {
        return this.produttore.getId().equals(idInput);
    }

    public boolean verificaInizioFineDescrizione(){
        char letteraIniziale = 'a';
        char letteraFinale = 'a';
        for(int i = 0; i < this.getDescrizione().length(); i++){
            if( i == 0){
                letteraIniziale = this.getDescrizione().charAt(i);
            }
            letteraFinale = this.getDescrizione().charAt(i);
        }
        return letteraIniziale == letteraFinale;
    }

    public int verificaPrezzo(int prezzoInput){
        if(this.getPrezzo() == prezzoInput){
            return 0;
        }else if(this.getPrezzo() > prezzoInput){
            return 1;
        }
        else{
            return -1;
        }
    }

    public String dettaglioProdotto(){
        return "Descrizione " + this.getDescrizione() + " Codice prodotto: " + this.getCodiceProdotto() + " Prezzo: " + this.getPrezzo() + "Produttore : " + this.produttore.dettaglioProduttore();
    }

    public void stampaDettaglioProdotto(){
        System.out.println(dettaglioProdotto());
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getCodiceProdotto() {
        return codiceProdotto;
    }

    public void setCodiceProdotto(String codiceProdotto) {
        this.codiceProdotto = codiceProdotto;
    }

    public Produttore getProduttore() {
        return produttore;
    }

    public void setProduttore(Produttore produttore) {
        this.produttore = produttore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public static int getConta() {
        return conta;
    }

    public static void setConta(int conta) {
        Prodotto.conta = conta;
    }



}
