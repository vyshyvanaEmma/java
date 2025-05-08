package es38_GestionaleAuto;

public class Proprietario {
    private String cognome, codFisc, targa;

    public Proprietario(String cognome, String codFisc, String targa) {
        this.cognome = cognome;
        this.codFisc = codFisc;
        this.targa = targa;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc) {
        this.codFisc = codFisc;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public String toString() {
        return "Proprietario - cognome:" + cognome + ", codice fiscale: " + codFisc + ", targa: " + targa + "/n";
    }

}