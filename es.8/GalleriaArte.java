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