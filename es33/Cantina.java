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
    public void stampaPila
        pila.stampaPila();
    }


       private Nodo ordinaPeso(Nodo testa) {
        if (testa == null || testa.getNext() == null) {
            return testa;
        }
        boolean change;
        do {
            change = false;
            Nodo corrente = testa;
            while (corrente != null && corrente.getNext() != null) {
                Libro l1 = (Libro) corrente.getInfo();
                Libro l2 = (Libro) corrente.getNext().getInfo();
                if (l1.getPeso() > l2.getPeso()) {
                    Prodotto temp = corrente.getInfo();
                    corrente.setInfo(corrente.getNext().getInfo());
                    corrente.getNext().setInfo(temp);
                    change = true;
                }
            }
        } while (change);
        return testa;
    }

    public void riempiPaccoLibri() {
        double pesoTot = 0;

        if (coda.isEmpty()) {
            System.out.println("La coda è vuota");
            return;
        }

        Nodo testaL = null;

        while (!coda.isEmpty()) {
            Prodotto p = coda.estrai();
            if (p instanceof Libro) {
                Nodo nuovoNodo = new Nodo(p);
                nuovoNodo.setNext(testaL);
                testaL = nuovoNodo;
            } else {
                System.out.println("Rimuovo il prodotto non libro: " + p);
            }
        }

        testaL = ordinaPeso(testaL);

        Nodo corrente = testaL;
        while (corrente != null) {
            Libro l = (Libro) corrente.getInfo();
            if ((l.getPeso() + pesoTot) <= 10) {
                pila.push(l);
                pesoTot += l.getPeso();
                System.out.println("Aggiunto libro: " + l);
            } else {
                System.out.println("Peso limite superato con il libro: " + l);
            }
            corrente = corrente.getNext();
        }
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
