
public class Cantante {
    private String nome;
    private String cognome;
    private String codiceFiscale;

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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public Cantante(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public Cantante(Cantante cantanteCopy) {
        this.nome = cantanteCopy.getNome();
        this.cognome = cantanteCopy.getCognome();
        this.codiceFiscale = cantanteCopy.getCodiceFiscale();

    }

    public String dettaglioCantante() {
        return "Nome : " + this.getNome() + " " + this.getCognome() + " Codice fiscale: " + this.getCodiceFiscale();
    }

}
