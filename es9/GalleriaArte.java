import java.util.ArrayList;

public class GalleriaArte {
    private String nomeGalleria;
    private String indirizzo;
    private ArrayList<Quadro> quadri;

    public GalleriaArte(String nomeGalleria, String indirizzo) {
        this.nomeGalleria = nomeGalleria;
        this.indirizzo = indirizzo;
        quadri = new ArrayList<Quadro>();
    }

    public GalleriaArte(GalleriaArte galleriaArteCopy){
        this.nomeGalleria = galleriaArteCopy.getNomeGalleria();
        this.indirizzo = galleriaArteCopy.getIndirizzo();
        
    /*  for(int i = 0; i < galleriaArteCopy.quadri.size(); i++){
            this.quadri.add(new Quadro( galleriaArteCopy.quadri.get(i)));
                
        }
        */
        this.quadri = new ArrayList<>(galleriaArteCopy.quadri);
    }

    public String stampaInfo(){
        return "Nome della galleria: " + this.getNomeGalleria() + " Indirizzo: " + this.getIndirizzo() + " Quadri: " + stampaQuardi();
    }

    public String stampaQuardi(){
        String listaQuadri = " ";
        for (int i = 0; i < quadri.size(); i++){
            listaQuadri = "/n" + quadri.get(i).stampaInfo() + ", ";
        }
        return listaQuadri;
    }

    public void aggiungiQuadro(Quadro q){
        for(int i = 0; i < quadri.size(); i++){
            if(quadri.get(i).getCodiceQuadro().equals(q.getCodiceQuadro())){

            }else{
                quadri.add(q);
            }
        }
    }

    public void cancellaQuadro(Quadro q){
        quadri.remove(q);   
    }

    public boolean ricercaQuadro(Quadro q){
        return quadri.contains(q);
    }

    public int prezzoQuadro(int anno){
        int prezzoTot = 0;

        for(int i = 0; i < quadri.size(); i++){
            if(quadri.get(i).getAnnoRealise() > anno){
                prezzoTot += quadri.get(i).getPrezzo();
            }
        }

        return prezzoTot;
    }

    public Quadro annoMax() {
        if (quadri.isEmpty()) return null;  // Se non ci sono quadri, ritorna null

        Quadro max = quadri.get(0);
        for (Quadro q : quadri) {
            if (q.getAnnoRealise() > max.getAnnoRealise()) {
                max = q;
            } else if (q.getAnnoRealise() == max.getAnnoRealise()) {
                if (q.getPrezzo() < max.getPrezzo()) {
                    max = q;
                } else if (q.getPrezzo() == max.getPrezzo()) {
                    if (q.getCodiceQuadro().compareTo(max.getCodiceQuadro()) < 0) {
                        max = q;
                    }
                }
            }
        }
        return max;
    }

    public int QuadriAutore(String cognomeAutore) {
        int count = 0;
        for (Quadro q : quadri) {
            if (q.getAutore().equals(cognomeAutore) && q.getAnnoRealise() > 0) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Quadro> prezzoCompreso(String autore, int p) {
        ArrayList<Quadro> quadriAutore = new ArrayList<>();
        for (Quadro q : quadri) {
            if (q.getAutore().equals(autore) && q.getPrezzo() < p) {
                quadriAutore.add(q);
            }
        }
        return quadriAutore;
    }

    public Quadro QuadroPiuVecchio() {
        if (quadri.isEmpty()) return null;

        Quadro vecchio = quadri.get(0);
        for (Quadro q : quadri) {
            if (q.getAnnoRealise() < vecchio.getAnnoRealise()) {
                vecchio = q;
            } else if (q.getAnnoRealise() == vecchio.getAnnoRealise()) {
                if (q.getPrezzo() > vecchio.getPrezzo()) {
                    vecchio = q;
                } else if (q.getPrezzo() == vecchio.getPrezzo()) {
                    if (q.getTitolo().compareTo(vecchio.getTitolo()) < 0) {
                        vecchio = q;
                    }
                }
            }
        }
        return vecchio;
    }
    public String getNomeGalleria() {
        return nomeGalleria;
    }
    
    public void setNomeGalleria(String nomeGalleria) {
        this.nomeGalleria = nomeGalleria;
    }
    
    public String getIndirizzo() {
        return indirizzo;
    }
    
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    

}