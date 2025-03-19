public class NastroTrasportatore {
    private CodaProdotto caricaTabletPcSuNastro(PilaProdotto p) {
        CodaProdotto coda = new CodaProdotto(); 
        int conta = 0; 

        while (!p.isEmpty() && conta < 20) {
            Prodotto prodotto = p.pop(); 

            if (prodotto instanceof Tablet || prodotto instanceof PC) {
                coda.accoda(prodotto); 
                conta++; 
            }
        }
    
        return coda; 
    }

    private PilaPC scaricaPCDaNastro(CodaProdotto c){
        PilaPC p = new PilaPC();
        while(!c.isEmpty()){
            Prodotto prod = c.estrai();
            if(prod instanceof PC){
                p.push((PC)prod);
            }
        }
        return p;
    }
    private PilaTablet scaricaTabletDaNastro(CodaProdotto c){
        PilaTablet t = new PilaTablet();
        while(!c.isEmpty()){
            Prodotto prod = c.estrai();
            if(prod instanceof Tablet){
                t.push((Tablet)prod);
            }
        }
        return t;
    }

    public void trasferisci(PilaProdotto pilaIniziale, PilaPC pilaPc, PilaTablet pilaTablet) {
        CodaProdotto codaTemp = caricaTabletPcSuNastro(pilaIniziale);
    
        PilaPC pilaPcTemp = scaricaPCDaNastro(codaTemp);
        while (!pilaPcTemp.isEmpty()) {
            pilaPc.push(pilaPcTemp.pop());
        }
    
        PilaTablet pilaTabletTemp = scaricaTabletDaNastro(codaTemp);
        while (!pilaTabletTemp.isEmpty()) {
            pilaTablet.push(pilaTabletTemp.pop());
        }
    }
    
}
