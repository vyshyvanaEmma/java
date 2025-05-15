package preparazione_verifica_gui;

public class Proprietario{
    
    public Proprietario(String cognome, String codFisc, String targaA) {
        this.cognome = cognome;
        this.codFisc = codFisc;
        this.targaA = targaA;
    }

    private String cognome, codFisc, targaA;

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

    public String getTargaA() {
        return targaA;
    }

    public void setTargaA(String targaA) {
        this.targaA = targaA;
    }

}