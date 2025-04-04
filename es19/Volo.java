import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Volo {

    private ArrayList<Bagaglio> bagagli;
    private String codice;
    private String destination;
    private String origine;
    private String data;

    public Volo(String codice, String destination, String origine, String data) {
        this.bagagli = new ArrayList<>();
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
