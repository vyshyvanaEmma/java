import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

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

    public Autore autoreDelLibro(String codiceISBN) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(codiceISBN)) {
                return new Autore(l.getAutore());
            }
        }
        return null;
    }

    public Libro libroPrezzoPiuAlto() {
        if (libri.isEmpty()) {
            return null;
        }
        Libro maxPrezzoLibro = libri.get(0);
        for (Libro l : libri) {
            if (l.getPrezzoDiVendita() > maxPrezzoLibro.getPrezzoDiVendita()) {
                maxPrezzoLibro = l;
            }
        }
        try {
            return (Libro) maxPrezzoLibro.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Libro> stampaOrdinataPerTitolo(boolean crescente) {
        ArrayList<Libro> ordinati = new ArrayList<>(libri);
        ordinati.sort(crescente ?
            Comparator.comparing(Libro::getTitolo) :
            Comparator.comparing(Libro::getTitolo).reversed());
        return ordinati;
    }

    public ArrayList<Libro> stampaOrdinataPerPrezzo(boolean crescente) {
        ArrayList<Libro> ordinati = new ArrayList<>(libri);
        ordinati.sort(crescente ?
            Comparator.comparingDouble(Libro::getPrezzoDiVendita) :
            Comparator.comparingDouble(Libro::getPrezzoDiVendita).reversed());
        return ordinati;
    }

    public ArrayList<String> getAutoriOrdinati(boolean ordineCrescente) {
        ArrayList<String> autori = new ArrayList<>();
        for (Libro l : libri) {
            String autore = l.getAutore().getCognome() + " " + l.getAutore().getNome();
            if (!autori.contains(autore)) {
                autori.add(autore);
            }
        }
        autori.sort(ordineCrescente ? 
            Comparator.naturalOrder() : 
            Comparator.reverseOrder());
        return autori;
    }

    public boolean rimuoviLibro(String codiceISBN) {
        Iterator<Libro> iterator = libri.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getIsbn().equals(codiceISBN)) {
                if (libro instanceof LibroCartaceo) {
                    LibroCartaceo libroCartaceo = (LibroCartaceo) libro;
                    int nuovaQuantita = libroCartaceo.getQuantitaInMagazzino() - 1;
                    libroCartaceo.setQuantitaInMagazzino(nuovaQuantita);
                    if (nuovaQuantita <= 0) {
                        iterator.remove();
                        return true;
                    }
                    return false;
                } else {
                    iterator.remove();
                    return true;
                }
            }
        }
        return false;
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