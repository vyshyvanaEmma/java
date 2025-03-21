public class CodaBiglietto{
    
    private Nodo testa;
    private Nodo coda;

    public CodaBiglietto() {
        testa = null; 
        coda = null; 
        
    }
    
    public void accoda(Biglietto info){
        Nodo n = new Nodo(info);
        if (isEmpty()) {
            testa = n;
            coda = n;
        } else {
            coda.setNext(n);
            coda = n;
        }
       
    }
    
    public void clear(){
        
        testa = null;
        coda = null;
        
    }
    
    public Biglietto estrai(){
        
        if(isEmpty()) return null;
        Biglietto bFirst= first();
        
        testa = testa.getNext();
        
        return bFirst;
        
    }
    
    public Biglietto first(){
        
        if(isEmpty()) return null;
        return testa.getInfo();
    }
    
    public Biglietto last(){
        
        if(isEmpty()) return null;
        return coda.getInfo();
    }
    
    
    public Boolean isEmpty(){
        if (testa == null) return true;
        return false;
    }
    
    
}

