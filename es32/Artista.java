package es32;

public class Artista {
    private String nomeArtista, cognomeArtista;

    public Artista(String nomeArtista, String cognomeArtista) {
        this.nomeArtista = nomeArtista;
        this.cognomeArtista = cognomeArtista;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getCognomeArtista() {
        return cognomeArtista;
    }

    public void setCognomeArtista(String cognomeArtista) {
        this.cognomeArtista = cognomeArtista;
    }

    @Override
    public String toString() {
        return "Artista - nome: " + nomeArtista + ", cognome: " + cognomeArtista + "\n";
    }

}