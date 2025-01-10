import java.util.ArrayList;
import java.util.Comparator;

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

    public boolean inserimentoBagagli(Bagaglio b) {
        if (b.getPeso() > b.getEcc()) {
            return false; 
        }
        for (Bagaglio bagaglio : bagagli) {
            if (bagaglio.getNome().equals(b.getNome())) {
                return false; 
            }
        }
        bagagli.add(b);
        return true; 
    }

    public boolean rimozioneBagagli(String nome) {
        return bagagli.removeIf(b -> b.getNome().equals(nome));
    }

    public boolean ricercaBagagli(String nome) {
        return bagagli.stream().anyMatch(b -> b.getNome().equals(nome));
    }

    public double totaleTariffeSuplemetari() {
        double tot = 0;
        for (Bagaglio b : bagagli) {
            tot += calcolaEccedenza(b) * b.getTariffa();
        }
        return tot;
    }

   
    private double calcolaEccedenza(Bagaglio b) {
        double eccedente = b.getPeso() - b.getEcc();
        return Math.max(0, eccedente); 
    }

    public double totalePesoEccedente() {
        double tot = 0;
        for (Bagaglio b : bagagli) {
            tot += calcolaEccedenza(b);
        }
        return tot;
    }

    public ArrayList<Bagaglio> elencoBagagliAMano() {
        ArrayList<Bagaglio> lista = new ArrayList<>();
        for (Bagaglio b : bagagli) {
            if (b instanceof BagaglioAMano) {
                lista.add(b);
            }
        }
        return lista;
    }

    public ArrayList<Bagaglio> elencoBagagliStiva() {
        ArrayList<Bagaglio> lista = new ArrayList<>();
        for (Bagaglio b : bagagli) {
            if (b instanceof BagaglioStiva && b.getPeso() > b.getEcc()) {
                lista.add(b);
            }
        }
        lista.sort(Comparator.comparingDouble(Bagaglio::getPeso));
        return lista;
    }

    public ArrayList<Bagaglio> elencoBagagliPesoMax(double peso) {
        ArrayList<Bagaglio> lista = new ArrayList<>();
        for (Bagaglio b : bagagli) {
            if (b instanceof BagaglioAMano && b.getPeso() > peso) {
                lista.add(b);
            }
        }
        lista.sort(Comparator.comparingDouble(Bagaglio::getPeso));
        return lista;
    }

    public ArrayList<Bagaglio> elencoBagagliComuni(Volo v) {
        ArrayList<Bagaglio> lista = new ArrayList<>();
        for (Bagaglio b : bagagli) {
            if (b instanceof BagaglioStiva && 
                v.getBagagli().stream().anyMatch(b2 -> b2.getNome().equals(b.getNome()))) {
                lista.add(b);
            }
        }
        lista.sort(Comparator.comparingDouble(Bagaglio::getPeso));
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
