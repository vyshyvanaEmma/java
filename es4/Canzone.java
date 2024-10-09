public class Canzone {

    private String codiceCanzone;
    private Cantante cantante;
    private int durata;
    private int annoUscita;
    private float prezzo;

    public Canzone(String codiceCanzone, Cantante cantante, int durata, int annoUscita, float prezzo) {
        this.codiceCanzone = codiceCanzone;
        this.cantante = cantante;
        this.durata = durata;
        this.annoUscita = annoUscita;
        this.prezzo = prezzo;
    }

    public Canzone(Canzone canzoneCopy) {
        this.codiceCanzone = canzoneCopy.getCodiceCanzone();
        this.cantante = new Cantante(canzoneCopy.getCantante());
        this.durata = canzoneCopy.getDurata();
        this.annoUscita = canzoneCopy.getAnnoUscita();
        this.prezzo = canzoneCopy.getPrezzo();
    }

    public float calcolaCostoalSecondo() {
        return this.getPrezzo() / this.getDurata();
    }

    public boolean verificaCanzone(Canzone canzoneInput) {
        return this.getAnnoUscita() == canzoneInput.getAnnoUscita();
    }

    public int verificaCognomeCantante() {
        int vocali = 0;
        for(int i = 0; i < this.getCantante().getCognome().length(); i++){
            char lettera = this.getCantante().getCognome().charAt(i);
            if(lettera == 'a'
            || lettera == 'o'
            || lettera == 'e'
            || lettera == 'i'
            || lettera == 'u'
            || lettera == 'A'
            || lettera == 'O'
            || lettera == 'E'
            || lettera == 'I'
            || lettera == 'U'
            ){
                vocali++;
            }
        }
        return vocali;
    }

    public int verificaDurata(int durataC){
        if(this.getDurata() == durataC){
            return 0;
        } else if(this.getDurata() >= durataC){
            return 1;
        }else{
            return -1;
        }
    }

    public String UscitaCantante(Canzone canzone){
        if(this.getAnnoUscita() == canzone.getAnnoUscita()){
            return this.getCantante().getNome();
        }else{
            return null;
        }
    }

    public String dettaglioCanzone(){
        return "Codice canzone: " + this.getCodiceCanzone() + " Durata: " + this.getDurata() + " Anno di uscita" + this.getAnnoUscita() + " Prezzo: " + this.getPrezzo() + "Cantante : " + this.cantante.dettaglioCantante();
    }

    public String getCodiceCanzone() {
        return codiceCanzone;
    }

    public void setCodiceCanzone(String codiceCanzone) {
        this.codiceCanzone = codiceCanzone;
    }

    public Cantante getCantante() {
        return cantante;
    }

    public void setCantante(Cantante cantante) {
        this.cantante = cantante;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getAnnoUscita() {
        return annoUscita;
    }

    public void setAnnoUscita(int annoUscita) {
        this.annoUscita = annoUscita;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }


}
