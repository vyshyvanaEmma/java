public class BranoMusicale{
    private String titolo;
    private String autore;
    private String genere;
    private int anno;
    private int durata;

    public BranoMusicale(int anno, String autore, int durata, String genere, String titolo) {
        this.anno = anno;
        this.autore = autore;
        this.durata = durata;
        this.genere = genere;
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}

