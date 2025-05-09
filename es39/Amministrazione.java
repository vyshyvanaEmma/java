package es39;
import java.util.ArrayList;

public class Amministrazione {
    private ArrayList<Voto> voti;

    public Amministrazione() {
        this.voti = new ArrayList<>();
    }

    public boolean aggiungiVoto(Voto v){
        
        return voti.add(v);
    }

    public int contaVotF(){
        int conta = 0;
        for(int i = 0; i < voti.size(); i++){
            Voto v = voti.get(i);
            if(v.getSesso() == 'f'){
                conta++;
            }
        }
        return conta;
    }

    public int contaVotM(){
        int conta = 0;
        for(int i = 0; i < voti.size(); i++){
            Voto v = voti.get(i);
            if(v.getSesso() == 'm'){
                conta++;
            }
        }
        return conta;
    }

    public int contaVotiMax(){
        int conta = 0;
        for(int i = 0; i < voti.size(); i++){
            Voto v = voti.get(i);
            if(v.getNum() == 10){
                conta++;
            }
        }
        return conta;
    }

    
    public double mediaVotiF(){
        double media = 0.0;
        int somma = 0;
        for(int i = 0; i < voti.size(); i++){
            Voto v = voti.get(i);
            somma += v.getNum();
        }
        if(contaVotF() == 0){
            return 0;
        }
        media = somma / contaVotF();
        return media;
    }

    public double mediaVotiM(){
        double media = 0.0;
        int somma = 0;
        for(int i = 0; i < voti.size(); i++){
            Voto v = voti.get(i);
            somma += v.getNum();
        }
        if(contaVotM() == 0){
            return 0;
        }
        media = somma / contaVotM();
        return media;
    }

    public ArrayList<Voto> getVoti() {
        return voti;
    }

    public void setVoti(ArrayList<Voto> voti) {
        this.voti = voti;
    }


}