package es32;

public class Collezione {
    private String nome, luogo;
    private Nodo testa;

    public Collezione(String nome, String luogo) {
        this.nome = nome;
        this.luogo = luogo;
        testa = null;
    }

    public boolean aggiuntaOrdineCognome(OperaArte opera) {
        Nodo n = new Nodo(opera);

        if (testa == null) {
            testa = n;
            return true;
        }

        Nodo corrente = testa;
        Nodo precedente = null;

        while (corrente != null && corrente.getOpera().getArtista().getCognomeArtista()
                .compareTo(n.getOpera().getArtista().getCognomeArtista()) <= 0) {
            precedente = corrente;
            corrente = corrente.getNext();
        }

        if (precedente == null) {
            n.setNext(testa);
            testa = n;
        } else if (corrente == null) {
            precedente.setNext(n);
        } else {
            n.setNext(corrente);
            precedente.setNext(n);
        }

        return true;
    }

    public boolean rimuovereOpera(String nome, String cognome) {
        if (testa == null) {
            return false;
        }
        Nodo corrente = testa;
        Nodo precedente = null;
        while (corrente != null) {
            if (corrente.getOpera().getArtista().getNomeArtista().equals(nome)
                    && corrente.getOpera().getArtista().getCognomeArtista().equals(cognome)) {
                if (precedente == null) {
                    testa = corrente.getNext();
                } else {
                    precedente.setNext(corrente.getNext());
                }
                return true;
            }

            precedente = corrente;
            corrente = corrente.getNext();

        }
        return false;

    }

    public String nomeArtistaOperaCostosa() {
        if (testa == null) {
            return null;
        }
        Nodo corrente = testa;
        String nome = corrente.getOpera().getArtista().getNomeArtista();
        double max = corrente.getOpera().getValoreOpera();
        while (corrente != null) {
            if (corrente.getOpera().getValoreOpera() > max) {
                max = corrente.getOpera().getValoreOpera();
                nome = corrente.getOpera().getArtista().getNomeArtista();
            }
            corrente = corrente.getNext();
        }
        return nome;
    }

    private int quantitaOpere(Class<?> tipo) {
        if (testa == null) {
            return 0;
        }

        int conta = 0;
        Nodo corrente = testa;

        while (corrente != null) {
            if (tipo.isInstance(corrente.getOpera())) {
                conta++;
            }
            corrente = corrente.getNext();
        }

        return conta;
    }

    public int quantitaSculture() {
        return quantitaOpere(Scultura.class);
        /*
         * if(testa == null){
         * return -1;
         * }
         * int conta = 0;
         * Nodo corrente = testa;
         * while(corrente != null){
         * OperaArte o = corrente.getOpera();
         * if(o instanceof Scultura){
         * conta ++;
         * }
         * 
         * corrente = corrente.getNext();
         * }
         * return conta;
         */
    }

    public int quantitaQuadri() {
        return quantitaOpere(Quadro.class);
        /*
         * if(testa == null){
         * return -1;
         * }
         * int conta = 0;
         * Nodo corrente = testa;
         * while(corrente != null){
         * OperaArte o = corrente.getOpera();
         * if(o instanceof Quadro){
         * conta ++;
         * }
         * 
         * corrente = corrente.getNext();
         * }
         * return conta;
         */
    }

    public double totaleCollezione(){
        double tot = 0;
        if(testa == null){
            return tot;
        }
        Nodo corrente = testa;
        while(corrente != null){
            tot += corrente.getOpera().getValoreOpera();
            corrente = corrente.getNext();
        }
        return tot;
    }

    public double totaleQuadri(){
        return totaleTipOpere(Quadro.class);
    }
    public double totaleSculture(){
        return totaleTipOpere(Scultura.class);
    }

    private double totaleTipOpere(Class<?> tipo){
        if(testa == null){
            return 0;
        }
        double tot = 0;
        Nodo corrente = testa;
        while(corrente != null){
            if(tipo.isInstance(corrente.getOpera())){
                tot += corrente.getOpera().getValoreOpera();
            }
            corrente = corrente.getNext();
        }
        return tot;
    }

    public Collezione listaOpereMaggioreStabilito(double val){
        Collezione collezione = new Collezione("Nuova", "qui");
        if(testa == null){
            return collezione;
        }
        Nodo corrente = testa;
        while(corrente != null){
            if(corrente.getOpera().getValoreOpera() > val){
                collezione.aggiuntaOrdineCognome(corrente.getOpera());
            }
            corrente = corrente.getNext();
        }
        return collezione;
    }

    public void stampa() {
        if (testa == null) {
            System.out.println("La collezione e' vuota:");
        }
        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println("Titolo: " + corrente.getOpera().getTitolo() + "\n");
            corrente = corrente.getNext();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public Nodo getTesta() {
        return testa;
    }

    public void setTesta(Nodo testa) {
        this.testa = testa;
    }
}