abstract class OpereArte {
    private String titolo, artista;
    private double quotazione;

    public OpereArte(String titolo, String artista, double quotazione) {
        this.titolo = titolo;
        this.artista = artista;
        this.quotazione = quotazione;
    }

    public OpereArte(OpereArte copy){
        this.titolo = copy.getTitolo();
        this.artista = copy.getArtista();
        this.quotazione = copy.getQuotazione();
    }

    public abstract double restituireIngombro();

    @Override
    public String toString() {
        return "/nTtitolo=" + titolo + ", Artista=" + artista + ", Quotazione=" + quotazione + "/n";
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getQuotazione() {
        return quotazione;
    }

    public void setQuotazione(double quotazione) {
        this.quotazione = quotazione;
    }



}