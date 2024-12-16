import java.util.ArrayList;

public class Artista {

    private String nome, cognome, codice;
    private ArrayList<TipoArtista> tipiArt;

    public Artista(String nome, String cognome, String codice, ArrayList<TipoArtista> tipiArt) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.tipiArt = new ArrayList<TipoArtista>();
    }

    public ArrayList<TipoArtista> getTipiArt() {
        return tipiArt;
    }

    public void setTipiArt(ArrayList<TipoArtista> tipiArt) {
        this.tipiArt = tipiArt;
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

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }
    

}