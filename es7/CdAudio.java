import java.util.ArrayList;

public class CdAudio{
    private String nomeCD;
    private ArrayList<BranoMusicale> brani;

    

    public CdAudio(String nomeCD) {
        this.nomeCD = nomeCD;
        this.brani = new ArrayList<>();
    }

    public boolean aggiungiBrano(BranoMusicale brano) {
        for (int i = 0; i < brani.size(); i++) {
            if (brani.get(i).getTitolo().equals(brano.getTitolo())) {
                return false; 
            }
        }
        brani.add(brano);
        return true;
    }

    public boolean cancellaBrano(String titolo){
        for(int i = 0; i < brani.size(); i++){
            if (brani.get(i).getTitolo().equals(titolo)){
                brani.remove(i);
                return true;
            }
        }
        return false;
    }

    public BranoMusicale search(String titolo){
        for(int i = 0; i < brani.size(); i++){
            if(brani.get(i).getTitolo().equals(titolo)){
                return brani.get(i);
            }
        }
        return null;
    }

    public void modificaBrano (BranoMusicale nuovoBrano){
        for(int i = 0; i < brani.size(); i++){
            if(brani.get(i).getTitolo().equals(nuovoBrano.getTitolo())){
                cancellaBrano(nuovoBrano.getTitolo());
                aggiungiBrano(nuovoBrano);
            }
        }
    }

    public int contaBraniAnno(int anno){
        int count = 0;
        for(int i = 0; i < brani.size(); i++){
            if(brani.get(i).getAnno() == anno){
                count++;
            }
        }
        return count;

    }

    public int contaBraniAutore(String autore){
        int count = 0;
        for(int i = 0; i < brani.size(); i++){
            if(brani.get(i).getAutore().equals(autore)){
                count++;
            }
        }
        return count;

    }

    public BranoMusicale maxDurata(){
        if (brani.isEmpty()) return null;
        BranoMusicale max = brani.get(0);
        for(int i = 1; i < brani.size(); i++){
            if(brani.get(i).getDurata() > max.getDurata()){
                max = brani.get(i);
            }
        }
        return max;
    }

    public CdAudio braniGenere(String genere){
        CdAudio cdGenere = new CdAudio(nomeCD + " - Genere " + genere);
        for (int i = 0; i < brani.size(); i++) {
            if (brani.get(i).getGenere().equals(genere)) {
                cdGenere.aggiungiBrano(brani.get(i));
            }
        }
        if (cdGenere.brani.isEmpty()) {
            return null;
        }
        return cdGenere;
    }

    public CdAudio unisciCD(CdAudio cd){
        CdAudio cdUnito = new CdAudio(this.nomeCD + " + " + cd.nomeCD);
        cdUnito.brani.addAll(this.brani);
        
        for (int i = 0; i < cd.brani.size(); i++) {
            cdUnito.aggiungiBrano(cd.brani.get(i)); 
        }
        return cdUnito;
    }

    public CdAudio braniComuniCD(CdAudio cd){
        CdAudio cdBraniComuni = new CdAudio(this.nomeCD + " n " + cd.nomeCD);
        for(int i = 0; i < this.brani.size(); i++){
            if(cd.brani.contains(this.brani.get(i))){
                cdBraniComuni.aggiungiBrano(this.brani.get(i));
            }
        }
        return cdBraniComuni;
    }

    public String getNome() {
        return nomeCD;
    }

    public void setNome(String nomeCD) {
        this.nomeCD = nomeCD;
    }

    public ArrayList<BranoMusicale> getBrani() {
        return brani;
    }

    public void setBrani(ArrayList<BranoMusicale> brani) {
        this.brani = brani;
    }

    
}