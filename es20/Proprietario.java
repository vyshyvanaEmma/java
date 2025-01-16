package es20;

import java.util.ArrayList;
import java.util.Comparator;

public class Proprietario {
    private String nome;
    private ArrayList<Bagaglio> bagagli;

    public Proprietario(String nome) {
        this.nome = nome;
        this.bagagli = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bagaglio> getBagagli() {
        return bagagli;
    }

    public void addBagaglio(Bagaglio bagaglio) {
        bagagli.add(bagaglio);
    }

    public int numeroBagagliEccedenti() {
        int count = 0;
        for (Bagaglio b : bagagli) {
            if (b.eEccedente()) {
                count++;
            }
        }
        return count;
    }
    
    public ArrayList<Bagaglio> elencoBagagliOrdinatiPerPeso() {
        ArrayList<Bagaglio> lista = new ArrayList<>(bagagli);
        lista.sort(Comparator.comparingDouble(Bagaglio::getPeso));
        return lista;
    }
    
    public static String confrontaBagagli(Proprietario p1, Proprietario p2) {
        if (p1.getBagagli().size() > p2.getBagagli().size()) {
            return p1.getNome();
        } else if (p1.getBagagli().size() < p2.getBagagli().size()) {
            return p2.getNome();
        } else {
            return "Entrambi i proprietari hanno lo stesso numero di bagagli.";
        }
    }
}
