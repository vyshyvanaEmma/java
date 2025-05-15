package gui;

import java.util.ArrayList;

public class Libreria {
    private ArrayList<Libro> libri = new ArrayList<>();

    public void addPrenotazione(Libro l) {
        libri.add(l);
        System.out.println("Il libro è stato prenotato!");
    }

    public int numStessoISBN(Libro l) {
        int conta = 0;
        for (Libro libro : libri) {
            if (libro.getCodiceISBN().equals(l.getCodiceISBN())) {
                conta++;
            }
        }
        return conta;
    }

    public ArrayList<Libro> getLibri() {
        return libri;
    }
}
