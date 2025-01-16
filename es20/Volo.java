package es20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Volo {

    private ArrayList<Bagaglio> bagagli;
    private ArrayList<Proprietario> proprietari;
    private String codice;
    private String destination;
    private String origine;
    private String data;

    public Volo(String codice, String destination, String origine, String data) {
        this.bagagli = new ArrayList<>();
        this.proprietari = new ArrayList<>();
        this.codice = codice;
        this.destination = destination;
        this.origine = origine;
        this.data = data;
    }

    public boolean add(Bagaglio b){
        for(int i = 0; i < bagagli.size(); i++){
            if(bagagli.get(i).getNome().equals(b.getNome())){
                return false;
            }
        }
        bagagli.add(b);
        return true;
    }

    public boolean rimuoviB(Bagaglio b){
        for(int i = 0; i < bagagli.size(); i++){
            if(bagagli.get(i).getNome().equals(b.getNome())){
                bagagli.remove(b);
                return true;
            }
        }
        return false;
    }

    public Bagaglio ricercaB(String nome){
        for(int i = 0; i < bagagli.size(); i++){
            if(bagagli.get(i).getNome().equals(nome)){
                Bagaglio b = bagagli.get(i);
                return b;
            }
        }
        return null;
    }

    public double calcolaTariffeSupplementari(){
        double tot = 0;
        for (Bagaglio bagaglio : bagagli) {
            tot += bagaglio.calcolaSupplemento();
        }
        return tot;
    }

    public double calcolaPesoEccedente() {
        double pesoE = 0;
        for (Bagaglio bagaglio : bagagli) {
            if (bagaglio.eEccedente()) {
                double limiteP = (bagaglio instanceof BagaglioAMano) ? 8.0 : 25.0;
                pesoE += bagaglio.getPeso() - limiteP;
            }
        }
        return pesoE;
    }

    public ArrayList<BagaglioAMano> elencoBagagliAMano() {
        ArrayList<BagaglioAMano> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioAMano){
                lista.add((BagaglioAMano)b);
            }
        }
        return lista;
    }

    public ArrayList<BagaglioStiva> elencoBagagliStivaEccedenti() {
        ArrayList<BagaglioStiva> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioStiva && b.eEccedente()){
                lista.add((BagaglioStiva)b);
            }
        }
        Collections.sort(lista, new Comparator<BagaglioStiva>(){
            @Override
            public int compare(BagaglioStiva b1, BagaglioStiva b2){
                return Double.compare(b1.getPeso(), b2.getPeso());
            }
        });
        return lista;
    }

    public ArrayList<BagaglioAMano> elencoBagagliAManoSuperano(double peso){
        ArrayList<BagaglioAMano> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioAMano && b.getPeso() > peso){
                lista.add((BagaglioAMano)b);
            }
        }
        Collections.sort(lista, new Comparator<BagaglioAMano>(){
            @Override
            public int compare(BagaglioAMano b1, BagaglioAMano b2){
                return Double.compare(b1.getPeso(), b2.getPeso());
            }
        });
        return lista;
    }

    public ArrayList<BagaglioStiva> elencoBagagliStivaComuni(Volo v){
        ArrayList<BagaglioStiva> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioStiva && v.bagagli.contains(b))
            lista.add((BagaglioStiva)b);
        }
        Collections.sort(lista, new Comparator<BagaglioStiva>() {
            @Override
            public int compare(BagaglioStiva b1, BagaglioStiva b2) {
                return Double.compare(b1.getPeso(), b2.getPeso());
            }
        });
        return lista;
    }

    public ArrayList<BagaglioStiva> elencoBagaglioStivaOrdinatiPeso(){
        ArrayList<BagaglioStiva> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioStiva){
                lista.add((BagaglioStiva)b);
            }
        }
        Collections.sort(lista, new Comparator<BagaglioStiva>(){
            @Override
            public int compare(BagaglioStiva b1, BagaglioStiva b2){
                return Double.compare(b1.getPeso(), b2.getPeso());
            }
        });
        return lista;
    }

    public ArrayList<BagaglioAMano> elencoBagagliAManoEccedenti() {
        ArrayList<BagaglioAMano> lista = new ArrayList<>();
        for(Bagaglio b : bagagli){
            if(b instanceof BagaglioAMano && b.eEccedente()){
                lista.add((BagaglioAMano)b);
            }
        }
        Collections.sort(lista, new Comparator<BagaglioAMano>(){
            @Override
            public int compare(BagaglioAMano b1, BagaglioAMano b2){
                return Double.compare(b1.getPeso(), b2.getPeso());
            }
        });
        return lista;
    }

    public boolean addProprietario(Bagaglio b, String nomeProprietario){
        Proprietario proprietario = trovaProprietario(nomeProprietario);
        if (proprietario == null) {
            proprietario = new Proprietario(nomeProprietario);
            proprietari.add(proprietario);
        }
        proprietario.addBagaglio(b);
        bagagli.add(b); 
        return true;
    }

    public Proprietario trovaProprietario(String nome) {
        for (Proprietario p : proprietari) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Bagaglio> elencoBagagliPerProprietario(String nomeProprietario) {
        Proprietario p = trovaProprietario(nomeProprietario);
        if (p != null) {
            return p.elencoBagagliOrdinatiPerPeso();
        }
        return new ArrayList<>();
    }

    public int numeroBagagliEccedenti(String nomeProprietario) {
        Proprietario p = trovaProprietario(nomeProprietario);
        if (p != null) {
            return p.numeroBagagliEccedenti();
        }
        return 0;
    }

    public String proprietarioConPiùBagagli(String proprietario1, String proprietario2) {
        Proprietario p1 = trovaProprietario(proprietario1);
        Proprietario p2 = trovaProprietario(proprietario2);
        int count1 = (p1 != null) ? p1.getBagagli().size() : 0;
        int count2 = (p2 != null) ? p2.getBagagli().size() : 0;
        return count1 > count2 ? proprietario1 : proprietario2;
    }

    public ArrayList<Bagaglio> getBagagli() {
        return bagagli;
    }

    public void setBagagli(ArrayList<Bagaglio> bagagli) {
        this.bagagli = bagagli;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
