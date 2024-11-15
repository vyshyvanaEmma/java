
public class Autore {
    private String nome;
    private String cognome;
    private String codFiscale;
    
    public Autore(String nome, String cognome, String codFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codFiscale = codFiscale;
    }
    public Autore(Autore copyAutore){
        this.nome = copyAutore.getNome();
        this.cognome = copyAutore.getCognome();
        this.codFiscale = copyAutore.getCodFiscale();
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
    public String getCodFiscale() {
        return codFiscale;
    }
    public void setCodFiscale(String codFiscale) {
        this.codFiscale = codFiscale;
    }
    
}
