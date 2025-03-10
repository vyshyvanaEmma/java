public class Cantina {
    private Coda coda;
    private Pila pila;

    public Cantina(Coda coda, Pila pila) {
        this.coda = new Coda();
        this.pila = new Pila();
    }

    public void accodaProdotto(Prodotto p){

        coda.accoda(p);
    }

    public void stampaCoda(){
        coda.stampaCoda();
    }
    public void stampaPila(){
        pila.stampaPila();
    }


    private Nodo inserisciOrdinato(Nodo testa, Libro libro) {
        Nodo nuovoN = new Nodo(libro);
        if (testa == null || ((Libro) libro).getPeso() > ((Libro) testa.getInfo()).getPeso()) {
            nuovoN.setNext(testa);
            return nuovoN;
        }

        Nodo corrente = testa;
        while (corrente.getNext() != null && ((Libro) corrente.getNext().getInfo()).getPeso() >= libro.getPeso()) {
            corrente = corrente.getNext();
        }

        nuovoN.setNext(corrente.getNext());
        corrente.setNext(nuovoN);
        return testa;
    }

    public boolean riempiPaccoLibri() {
        if (coda.isEmpty()) {
            return false;
        }
        double pesoTot = 0;
        boolean libroAggiunto = false;
        Nodo libriOrdinati = null;
        while (!coda.isEmpty()) {
            Prodotto prodotto = coda.estrai();
            if (prodotto instanceof Libro) {
                Libro libro = (Libro) prodotto;
                libriOrdinati = inserisciOrdinato(libriOrdinati, libro);
            }

        }
        Nodo corrente = libriOrdinati;
        while (corrente != null && pesoTot <= 10) {
            Libro libro = (Libro) corrente.getInfo();
            if (libro.getPeso() + pesoTot <= 10) {
                pila.push(libro);
                pesoTot += libro.getPeso();
                libroAggiunto = true;
            }
            corrente = corrente.getNext();
        }
        return libroAggiunto;
    }

    public void scaricaPaccoGiuntoADestinazione() {
        while (!pila.isEmpty()) {
            Libro libro = pila.pop();
            System.out.println("libro trasferito, peso" + libro.getPeso());
        }
    }

    public void effetuaTrasloco(){
        while(!coda.isEmpty()){
            riempiPaccoLibri();
            scaricaPaccoGiuntoADestinazione();
        }
    }
}
