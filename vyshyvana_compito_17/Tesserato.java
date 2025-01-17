public abstract class Tesserato {
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String codicetTessera;
    private double mesiAbbonamento;
    public static  double COSTO_MESE = 150;  

    public Tesserato(String nome, String cognome, String codiceFiscale, String codicetTessera, double mesiAbbonamento) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.codicetTessera = codicetTessera;
        this.mesiAbbonamento = mesiAbbonamento;
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
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public String getCodicetTessera() {
        return codicetTessera;
    }
    public void setCodicetTessera(String codicetTessera) {
        this.codicetTessera = codicetTessera;
    }
    public double getMesiAbbonamento() {
        return mesiAbbonamento;
    }
    public void setMesiAbbonamento(double mesiAbbonamento) {
        this.mesiAbbonamento = mesiAbbonamento;
    }

    public abstract double costoAbbonamento();

    @Override
    public String toString() {
        return "Tesserato [nome=" + nome + ", cognome=" + cognome + ", codice fiscale=" + codiceFiscale
                + ", codice tessera=" + codicetTessera + ", mesi abbonamento=" + mesiAbbonamento + "]";
    }
}
