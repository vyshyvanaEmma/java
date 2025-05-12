package es39;

import java.util.ArrayList;

public class Amministrazione {
    private ArrayList<Voto> voti;

    public Amministrazione() {
        this.voti = new ArrayList<>();
    }

    public boolean aggiungiVoto(Voto v) {
        return voti.add(v);
    }

    public int contaVotF() {
        int conta = 0;
        for(Voto v : voti) {
            if(v.getSesso() == 'f') {
                conta++;
            }
        }
        return conta;
    }

    public int contaVotM() {
        int conta = 0;
        for(Voto v : voti) {
            if(v.getSesso() == 'm') {
                conta++;
            }
        }
        return conta;
    }

    public int contaVotiMax() {
        int conta = 0;
        for(Voto v : voti) {
            if(v.getNum() == 9) { 
                conta++;
            }
        }
        return conta;
    }

    public double mediaVotiF() {
        double somma = 0;
        int count = 0;
        for(Voto v : voti) {
            if(v.getSesso() == 'f') {
                somma += v.getNum();
                count++;
            }
        }
        return count == 0 ? 0 : somma / count;
    }

    public double mediaVotiM() {
        double somma = 0;
        int count = 0;
        for(Voto v : voti) {
            if(v.getSesso() == 'm') {
                somma += v.getNum();
                count++;
            }
        }
        return count == 0 ? 0 : somma / count;
    }

    public void azzeraDati() {
        voti.clear();
    }

    public ArrayList<Voto> getVoti() {
        return voti;
    }
}