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

    public Autore autoreConISBN(String codiceISBN){
        for(int i = 0; i < libri.size(); i++){
            if(libri.get(i).getIsbn().equals(codiceISBN)){
                return new Autore (libri.get(i).getAutore());
            }
        }
        return null;
    }

    public Libro libroPrezzoPiuAlto(double prezzoInt){
        double prezzoMax = libri.get(0).getPrezzoDiVendita();
        int indexLibroMax = 0;
        for(int i = 1; i < libri.size(); i++){
            if( prezzoMax > prezzoInt){
                indexLibroMax = i;
            }
        }
        return new Libro (libri.get(indexLibroMax));
    }

    public ArrayList<Libro> stampaOrdinataPerPrezzo(boolean crescente) {
        ArrayList<Libro> libriOrdinati = new ArrayList<>(libri);

        int n = libriOrdinati.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                double prezzo1 = libriOrdinati.get(j).getPrezzoDiVendita();
                double prezzo2 = libriOrdinati.get(j + 1).getPrezzoDiVendita();

                if ((crescente && prezzo1 > prezzo2) || (!crescente && prezzo1 < prezzo2)) {
                    Libro temp = libriOrdinati.get(j);
                    libriOrdinati.set(j, libriOrdinati.get(j + 1));
                    libriOrdinati.set(j + 1, temp);
                }
            }
        }

        return libriOrdinati;
    }

    public ArrayList<Libro> stampaOrdinataPerTitolo(boolean crescente) {
        ArrayList<Libro> libriOrdinati = new ArrayList<>(libri);

        int n = libriOrdinati.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                String titolo1 = libriOrdinati.get(j).getTitolo();
                String titolo2 = libriOrdinati.get(j + 1).getTitolo();
                
                if ((crescente && titolo1.compareTo(titolo2) > 0) || (!crescente && titolo1.compareTo(titolo2) < 0)) {

                    Libro temp = libriOrdinati.get(j);
                    libriOrdinati.set(j, libriOrdinati.get(j + 1));
                    libriOrdinati.set(j + 1, temp);
                }
            }
        }

        return libriOrdinati;
    }


    public void stampaLibri() {
        for (Libro l1 : libri) {
            System.out.println(l1);
        }
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