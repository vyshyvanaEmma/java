package preparazione_verifica_gui;

import java.util.ArrayList;

public class Agenzia {
    private ArrayList<Proprietario> proprietari = new ArrayList<Proprietario>();

    public Agenzia() {
        this.proprietari = new ArrayList<>();
    }

    public boolean addProprietario(Proprietario p){
        for(int i = 0; i < proprietari.size(); i++){
            Proprietario prop = proprietari.get(i);

            if(p.getTargaA().equals(prop.getTargaA())){
                return false;
            }
        }
        proprietari.add(p);
        return true;
    }

    public int numAuto(Proprietario p){
        int conta = 0;

        for(int i = 0; i < proprietari.size(); i++){
            Proprietario prop = proprietari.get(i);
            if(p.getCodFisc().equals(p.getCodFisc())){
                conta++;
            }
        }

        return conta;
    }

    public int totProprietari(){
        return proprietari.size();
    }

    public ArrayList<Proprietario> getProprietari() {
        return proprietari;
    }

    public void setProprietari(ArrayList<Proprietario> proprietari) {
        this.proprietari = proprietari;
    }
    
}
