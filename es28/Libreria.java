package es28;

public class Libreria {
    private GestionePilaLibri gestionePilaLibri;

    public Libreria() {
        gestionePilaLibri = new GestionePilaLibri();
    }

    public boolean aggiungiLibro(Libro libro) {
        return gestionePilaLibri.aggiungi(libro);
    }

    public Libro eliminaLibro() {
        return gestionePilaLibri.elimina();
    }

    public int numLibriAutore(String nomeAutore, String cognomeAutore){
        int count = 0;
        PilaLibri pilaTemp = new PilaLibri();
        Nodo<Libro> nodoCorrente = gestionePilaLibri.getPila().getTesta();
        
        while(nodoCorrente != null){
            Libro libro = nodoCorrente.getInfo();
            pilaTemp.push(libro);
            if(libro.getAutore().getNome().equalsIgnoreCase(nomeAutore) && libro.getAutore().getCognome().equalsIgnoreCase(cognomeAutore)){
                count++;
            }
            nodoCorrente = nodoCorrente.getNext();
        }

        while(!pilaTemp.isEmpty()){
            gestionePilaLibri.getPila().push(pilaTemp.pop());
        }

        return count;
    }

    public int eliminaAutore(String nomeA, String congomeA){
        int count = 0;
        PilaLibri pilaTemp = new PilaLibri();

        while(!gestionePilaLibri.getPila().isEmpty()){
            Libro l = gestionePilaLibri.getPila().pop();
            if(l.getAutore().getNome().equalsIgnoreCase(nomeA) && l.getAutore().getCognome().equalsIgnoreCase(congomeA)){
                count++;
            } else{
                pilaTemp.push(l);
            }
        }

        while(!pilaTemp.isEmpty()){
            gestionePilaLibri.getPila().push(pilaTemp.pop());
        }
        return count;
    }

    public void visualizzaPila() {
        System.out.println("I libri nella pila:");
        Nodo<Libro> nodoCorrente = gestionePilaLibri.getPila().getTesta();
        while (nodoCorrente != null) {
            Libro libro = nodoCorrente.getInfo();
            System.out.println("Titolo: " + libro.getTitolo() + ", ISBN: " + libro.getIsbn());
            nodoCorrente = nodoCorrente.getNext();
        }
    }

}
