import java.util.ArrayList;

public class LibreriaOnline{
    private String nome;
    private ArrayList<Libro> libri;

    public LibreriaOnline(String nome) {
        this.nome = nome;
        this.libri = new ArrayList<Libro>();
    }

    public boolean aggiungiLibro(Libro l1){
        for(int i = 0; i < libri.size(); i++){
            if (libri.get(i).getIsbn().equals(l1.getIsbn())) {
                if(l1 instanceof LibroCartaceo){   
                    LibroCartaceo.setQtainMagazzino(LibroCartaceo.getQtainMagazzino() + 1);
                }
                libri.add(l1);
                return true;
            }
        }
        return false;
    }

    public double prezzoDelLibro(String codiceISBN){
        for(int i = 0; i < libri.size(); i++){
            if(libri.get(i).getIsbn().equals(codiceISBN)){
                return libri.get(i).getPrezzoDiVendita();
            }
        }
        return 0;
    }

    public String titoloDelLibro(String codiceISBN){
        for(int i = 0; i < libri.size(); i++){
            if(libri.get(i).getIsbn().equals(codiceISBN)){
                return libri.get(i).getTitolo();
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Libro> getLibri() {
        return libri;
    }
    public void setLibri(ArrayList<Libro> libri) {
        this.libri = libri;
    }

}