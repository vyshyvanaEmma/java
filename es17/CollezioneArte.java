import java.util.ArrayList;

public class CollezioneArte{
    private String nome, luogo;
    private ArrayList<OpereArte> opere;

    public CollezioneArte(String nome, String luogo){
        this.nome = nome;
        this.luogo = luogo;
        this.opere = new ArrayList<OpereArte>();
    }

    public String artistaOperaPiuCostosa() {
        if (opere.isEmpty()) {
            return "Nessuna opera presente nella collezione.";
        }

        OpereArte operaPiuCostosa = opere.get(0);
        for (OpereArte opera : opere) {
            if (opera.getQuotazione() > operaPiuCostosa.getQuotazione()) {
                operaPiuCostosa = opera;
            }
        }
        return operaPiuCostosa.getArtista().getNome();
    }


    public double prezzoTotaleCollezione() {
        double tot = 0;
        for (OpereArte o : opere) {
            tot += o.getQuotazione();
        }
        return tot;
    }
    
    public double prezzoTotaleCollezioneQuadri() {
        double tot = 0;
        for (OpereArte o : opere) {
            if (o instanceof Quadro) {
                tot += o.getQuotazione();
            }
        }
        return tot;
    }
    
    public double prezzoTotaleCollezioneSculture() {
        double tot = 0;
        for (OpereArte o : opere) {
            if (o instanceof Scultura) {
                tot += o.getQuotazione();
            }
        }
        return tot;
    }
    

    public int quantitaOpere(Categoria categoria) {
    int count = 0;
    for (OpereArte opera : opere) {
        if (categoria == Categoria.QUADRO && opera instanceof Quadro) {
            count++;
        } else if (categoria == Categoria.SCULTURA && opera instanceof Scultura) {
            count++;
        }
    }
    return count;
    }


    public void ordinaOperePerPrezzo(boolean crescente) {
        for (int i = 0; i < opere.size() - 1; i++) {
            int indiceMinMax = i;
            for (int j = i + 1; j < opere.size(); j++) {
                if (crescente) {
                    if (opere.get(j).getQuotazione() < opere.get(indiceMinMax).getQuotazione()) {
                        indiceMinMax = j;
                    }
                } else {
                    if (opere.get(j).getQuotazione() > opere.get(indiceMinMax).getQuotazione()) {
                        indiceMinMax = j;
                    }
                }
            }

            OpereArte temp = opere.get(i);
            opere.set(i, opere.get(indiceMinMax));
            opere.set(indiceMinMax, temp);
        }
    }


    public String datiOpere() {
        String risultato = "";
        for (OpereArte opera : opere) {
            risultato += "/nTitolo: " + opera.getTitolo() +
                         ", Artista: " + opera.getArtista().getNome() + " " + opera.getArtista().getCognome() +
                         ", Prezzo: " + opera.getQuotazione() + "\n";
        }
        return risultato;
    }
    

    public ArrayList<OpereArte> opereMagiore(double q){
        ArrayList<OpereArte> o = new ArrayList<OpereArte>();

        for(int i = 0; i < opere.size(); i++){
            OpereArte op = opere.get(i);
            if(op.getQuotazione() > q){
                o.add(op);
            }
        }

        return o;
    }

    public ArrayList<OpereArte> opereMagioreMedia() {
        ArrayList<OpereArte> o = new ArrayList<OpereArte>();
        double media = prezzoTotaleCollezione() / opere.size();
        
        for (OpereArte op : opere) {
            if (op.getQuotazione() > media) {
                o.add(op);
            }
        }
        return o;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public ArrayList<OpereArte> getOpere() {
        return opere;
    }

    public void setOpere(ArrayList<OpereArte> opere) {
        this.opere = opere;
    }
}