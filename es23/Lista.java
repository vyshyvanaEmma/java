package es23;

public class Lista {
    private Nodo testa;

    public Lista() {
        this.testa = null;
    }

    public boolean addWord(String parola){
        if(cercaParola(parola)){
            return false;
        }
        Nodo nuovoNodo = new Nodo(parola);
        if(testa==null){
            testa = nuovoNodo;
        }else{
            Nodo corrente = testa;
            while(corrente.getNext() != null){
                corrente = corrente.getNext();
            }
            corrente.setNext(nuovoNodo);
        }
        return true;
    }
    public boolean cercaParola(String p){
        Nodo corrente = testa; 
        while (corrente != null) {  
            if (corrente.getInfo().equals(p)) {   
                return true;  
            }
            corrente = corrente.getNext();  
        }

        return false;  
    }

    public void printWords() {
        Nodo corrente = testa;
        while (corrente != null) {
            System.out.println(corrente.getInfo());
            corrente = corrente.getNext();
        }
    }
    public boolean rimuoviPrimaParola(String p){
        if (testa == null) {
            return false;  
        }
        if(testa.getInfo().equals(p)){
            testa = testa.getNext();
            return true;
        }
        if(cercaParola(p)){
            Nodo corrente = testa; 
            while (corrente.getNext() != null) {  
                if (corrente.getNext().getInfo().equals(p)) {   
                    corrente.setNext(corrente.getNext().getNext());
                    return true;  
                }
                corrente = corrente.getNext();  
            } 
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo corrente = testa;
        
        while (corrente != null) {
            sb.append(corrente.getInfo()).append(" ");
            corrente = corrente.getNext();
        }
        
        return sb.toString(); 
    }

    
}
