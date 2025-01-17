import java.util.ArrayList;
import java.util.Comparator;

public class Palestra {
    private String nome;
    private String indirizzo;
    private ArrayList<Tesserato> tesserati;

    public Palestra(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.tesserati = new ArrayList<>();
    }

    public boolean addTesserato(Tesserato t) {
        for (Tesserato tesserato : tesserati) {
            if (tesserato.getCodicetTessera().equals(t.getCodicetTessera())) {
                return false;  
            }
        }
        tesserati.add(t);
        return true;
    }

    public boolean ricerca(String codiceTessera) {
        for (Tesserato t : tesserati) {
            if (t.getCodicetTessera().equals(codiceTessera)) {
                return true;  
            }
        }
        return false;  
    }

    public ArrayList<Amatoriale> listaAmatorialiTesseratiOrdinati() {
        ArrayList<Amatoriale> lista = new ArrayList<>();
        for (Tesserato t : tesserati) {
            if (t instanceof Amatoriale && ((Amatoriale) t).isPersonalTrainer()) {
                lista.add((Amatoriale) t);
            }
        }

        lista.sort(Comparator.comparing(Amatoriale::getCodiceFiscale));
        return lista;
    }

    public double guadagnoTotalePalestra() {
        double totale = 0;
        for (Tesserato t : tesserati) {
            totale += t.costoAbbonamento();
        }
        return totale;
    }

    public ArrayList<Agonista> listaAgonistiNumeroGareSvolteOrdinati(double a, double b) {
        ArrayList<Agonista> lista = new ArrayList<>();
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        
        for (Tesserato t : tesserati) {
            if (t instanceof Agonista) {
                Agonista ag = (Agonista) t;
                if (ag.getGareSvolte() >= min && ag.getGareSvolte() <= max) {
                    lista.add(ag);
                }
            }
        }

        lista.sort(Comparator.comparing(Agonista::getCodiceFiscale));
        return lista;
    }

    public ArrayList<Amatoriale> listaAmatorialiTesseratiPalestraComuni(Palestra altraPalestra) {
        ArrayList<Amatoriale> lista = new ArrayList<>();
        for (Tesserato t1 : tesserati) {
            if (t1 instanceof Amatoriale) {
                for (Tesserato t2 : altraPalestra.tesserati) {
                    if (t2 instanceof Amatoriale && t1.getCodiceFiscale().equals(t2.getCodiceFiscale())) {
                        lista.add((Amatoriale) t1);
                    }
                }
            }
        }
        return lista;
    }

    public String datiTesserati() {
        StringBuilder sb = new StringBuilder();
        for (Tesserato t : tesserati) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Tesserato> getTesserati() {
        return tesserati;
    }
}
