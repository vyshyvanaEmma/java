public class PilaBigliettoDigitale{
    private Nodo testa;

    public PilaBigliettoDigitale() {
        testa = null;
    }
    
    public void push(BigliettoDigitale b){
        Nodo nuovo = new Nodo(b);
        if(testa == null){
            testa = nuovo;
        }else{
           nuovo.setNext(testa);
           testa = nuovo;
        }
    }
    
    public BigliettoDigitale pop (){
        if(isEmpty()){
            return null;
        }
        BigliettoDigitale b = (BigliettoDigitale) testa.getInfo();
        testa = testa.getNext();
        return b;
    }
    
    public BigliettoDigitale top (){
        if(isEmpty()){
            return null;
        }
        return (BigliettoDigitale) testa.getInfo();
    }
    
    void clear(){
        testa = null;
    }
    
    public Boolean isEmpty(){
        if (testa == null) return true;
        return false;
              
    }

}

