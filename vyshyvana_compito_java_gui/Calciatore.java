public class Calciatore{
    private String codFiscCalc, nomeSquadra;
    private int numGoal;

    public Calciatore(String codFiscCalc, String nomeSquadra, int numGoal) {
        this.codFiscCalc = codFiscCalc;
        this.nomeSquadra = nomeSquadra;
        this.numGoal = numGoal;
    }
    
    public String getCodFiscCalc() {
        return codFiscCalc;
    }
    public void setCodFiscCalc(String codFiscCalc) {
        this.codFiscCalc = codFiscCalc;
    }
    public String getNomeSquadra() {
        return nomeSquadra;
    }
    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }
    public int getNumGoal() {
        return numGoal;
    }
    public void setNumGoal(int numGoal) {
        this.numGoal = numGoal;
    }
}