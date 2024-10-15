
public class Produttore {
    private String nome;
    private String cognome;
    private String nazione;
    private String id;
    private static int conta = 0;

    public Produttore(String nome, String cognome, String nazione, String id) {
        conta++;
        this.nome = nome;
        this.cognome = cognome;
        this.nazione = nazione;
        this.id = generaId();
    }

    public Produttore(Produttore produttoreCopy) {
        conta++;
        generaId();
        this.nome = produttoreCopy.getNome();
        this.cognome = produttoreCopy.getCognome();
        this.nazione = produttoreCopy.getNazione();
        this.id = produttoreCopy.getId();
    }

    private String generaId(){
        return "PROD" + conta;
    }

    public String dettaglioProduttore() {
        return "Nome : " + this.getNome() + " " + this.getCognome() + " Nazione: " + this.getNazione() + " Id: " + this.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNazione() {
        return nazione;
    }

    public void setNazione(String nazione) {
        this.nazione = nazione;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
