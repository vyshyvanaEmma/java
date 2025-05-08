package es38_GestionaleAuto;

import java.util.ArrayList;

public class Agenzia {
    private ArrayList<Proprietario> proprietari;

    public Agenzia() {
        this.proprietari = new ArrayList<>();
    }

    public boolean aggiungiProprietario(Proprietario nuovo) {
        for (Proprietario p : proprietari) {
            if (p.getTarga().equalsIgnoreCase(nuovo.getTarga())) {
                return false;
            }
        }
        proprietari.add(nuovo);
        return true;
    }

    public boolean rimuoviProprietario(String codFisc) {
        boolean rimosso = false;
        for (int i = proprietari.size() - 1; i >= 0; i--) {
            if (proprietari.get(i).getCodFisc().equalsIgnoreCase(codFisc)) {
                proprietari.remove(i);
                rimosso = true;
            }
        }
        return rimosso;
    }

    public int contaAutoPerProprietario(String codFisc) {
        int count = 0;
        for (Proprietario p : proprietari) {
            if (p.getCodFisc().equalsIgnoreCase(codFisc)) {
                count++;
            }
        }
        return count;
    }

    public int getTotaleProprietari() {
        return proprietari.size();
    }

    public ArrayList<Proprietario> getProprietari() {
        return proprietari;
    }
}