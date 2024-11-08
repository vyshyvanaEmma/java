public class Quadro{
    private String codiceQuadro;
    private String titolo;
    private int annoRealise;
    private String autore;
    private int prezzo;


    public Quadro(String codiceQuadro, String titolo, int annoRealise, String autore, int prezzo) {
        this.codiceQuadro = codiceQuadro;
        this.titolo = titolo;
        this.annoRealise = annoRealise;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public Quadro(Quadro quadroCopy){
        this.codiceQuadro = quadroCopy.getCodiceQuadro();
        this.titolo = quadroCopy.getTitolo();
        this.annoRealise = quadroCopy.getAnnoRealise();
        this.autore = quadroCopy.getAutore();
        this.prezzo = quadroCopy.getPrezzo();
    }

    @Override
    public boolean equals(Object o){
        Boolean sameSame = false;

        if(o != null && o instanceof Quadro){
            sameSame = this.getCodiceQuadro().equals(((Quadro) o ).getCodiceQuadro());
        }
        return sameSame;
    }

    public String stampaInfo(){
        return  "/n Codice quadro: " + this.getCodiceQuadro() + " Titolo: " + this.getTitolo() + " Anno " + this.getAnnoRealise() + " Autore: " + this.getAutore() + " Prezzo: " + this.getPrezzo(); 
    }

    public String getCodiceQuadro() {
        return codiceQuadro;
    }


    public void setCodiceQuadro(String codiceQuadro) {
        this.codiceQuadro = codiceQuadro;
    }


    public String getTitolo() {
        return titolo;
    }


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    public int getAnnoRealise() {
        return annoRealise;
    }


    public void setAnnoRealise(int annoRealise) {
        this.annoRealise = annoRealise;
    }


    public String getAutore() {
        return autore;
    }


    public void setAutore(String autore) {
        this.autore = autore;
    }


    public int getPrezzo() {
        return prezzo;
    }


    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    

}