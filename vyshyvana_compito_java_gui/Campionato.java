
import java.util.ArrayList;

public class Campionato {
    private ArrayList<Calciatore> calciatori;

    public Campionato() {
        this.calciatori = new ArrayList<>();
    }

    public boolean aggiungiGiocatore(Calciatore c){
        for(int i = 0; i < calciatori.size(); i++){
            if(c.getCodFiscCalc().equals(calciatori.get(i).getCodFiscCalc())){
                return false;
            }
        }
        calciatori.add(c);
        return true;
    }

    public int numCalciatoriStessaSquadra(Calciatore c){
        int conta = 0;
        for(int i = 0; i < calciatori.size(); i++){
            if(c.getNomeSquadra().equals(calciatori.get(i).getNomeSquadra())){
                conta++;
            }
        }
        return conta;
    }

    public int totGoal(){
        int conta = 0;
        for(int i = 0; i < calciatori.size(); i++){
            conta += calciatori.get(i).getNumGoal();
        }
        return conta;
    }

    public ArrayList<Calciatore> getCalciatori() {
        return calciatori;
    }

    public void setCalciatori(ArrayList<Calciatore> calciatori) {
        this.calciatori = calciatori;
    }
    
}
