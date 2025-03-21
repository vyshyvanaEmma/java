public class PilaBigliettoCartaceo{
    private Nodo testa;

    public PilaBigliettoCartaceo() {
        testa = null;
    }
    
    public void push(BigliettoCartaceo b){
        Nodo nuovo = new Nodo(b);
        if(testa == null){
            testa = nuovo;
        }else{
           nuovo.setNext(testa);
           testa = nuovo;
        }
    }
    
    public BigliettoCartaceo pop (){
        if(isEmpty()){
            return null;
        }
        BigliettoCartaceo b = (BigliettoCartaceo) testa.getInfo();
        testa = testa.getNext();
        return b;
    }
    
    public BigliettoCartaceo top (){
        if(isEmpty()){
            return null;
        }
        return (BigliettoCartaceo) testa.getInfo();
    }
    
    void clear(){
        testa = null;
    }
    
    public Boolean isEmpty(){
        if (testa == null) return true;
        return false;
              
    }
}

