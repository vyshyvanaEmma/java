import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LibreriaOnline {
    private String nome;
    private ArrayList<Libro> libri;

    public LibreriaOnline(String nome) {
        this.nome = nome;
        this.libri = new ArrayList<>();
    }

    public boolean aggiungiLibro(Libro libro) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(libro.getIsbn())) {
                if (libro instanceof LibroCartaceo) {
                    ((LibroCartaceo) l).setQuantitaInMagazzino(
                        ((LibroCartaceo) l).getQuantitaInMagazzino() + ((LibroCartaceo) libro).getQuantitaInMagazzino()
                    );
                }                
                return false; 
            }
        }
        libri.add(libro); 
        return true;
    }

    public double prezzoDelLibro(String codiceISBN) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(codiceISBN)) {
                return l.getPrezzoDiVendita();
            }
        }
        return 0; 
    }

    public String titoloDelLibro(String codiceISBN) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(codiceISBN)) {
                return l.getTitolo();
            }
        }
        return null; 
    }

    public Libro libroPrezzoPiuAlto() {
        if (libri.isEmpty()) {
            return null; 
        }
        Libro libro = Collections.max(libri, Comparator.comparingDouble(Libro::getPrezzoDiVendita));
        return (Libro) libro.clone(); 
    }
    

    public ArrayList<Libro> stampaOrdinataPerPrezzo(boolean crescente) {
        ArrayList<Libro> ordinati = new ArrayList<>(libri);
        ordinati.sort(crescente ? 
            Comparator.comparingDouble(Libro::getPrezzoDiVendita) : 
            Comparator.comparingDouble(Libro::getPrezzoDiVendita).reversed());
        return ordinati;
    }

    public ArrayList<Libro> stampaOrdinataPerTitolo(boolean crescente) {
        ArrayList<Libro> ordinati = new ArrayList<>(libri);
        ordinati.sort(crescente ? 
            Comparator.comparing(Libro::getTitolo) : 
            Comparator.comparing(Libro::getTitolo).reversed());
        return ordinati;
    }
    

    public ArrayList<Libro> getLibri() {
        return new ArrayList<>(libri);
    }
}
