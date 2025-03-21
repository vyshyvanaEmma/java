public class PilaBiglietto{
    private Nodo testa;

    public PilaBiglietto() {
        testa = null;
    }
    
    public void push(Biglietto b){
        Nodo nuovo = new Nodo(b);
        if(testa == null){
            testa = nuovo;
        }else{
           nuovo.setNext(testa);
           testa = nuovo;
        }
    }
    
    public Biglietto pop (){
        if(isEmpty()){
            return null;
        }
        Biglietto b = testa.getInfo();
        testa = testa.getNext();
        return b;
    }
    
    public Biglietto top (){
        if(isEmpty()){
            return null;
        }
        return testa.getInfo();
    }
    
    void clear(){
        testa = null;
    }
    
    public Boolean isEmpty(){
        if (testa == null) return true;
        return false;
              
    }
}

