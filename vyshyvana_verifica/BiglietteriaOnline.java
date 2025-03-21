
public class BiglietteriaOnline {

    private String nome;
    private CodaBiglietto coda;

    public BiglietteriaOnline(String nome) {
        coda = new CodaBiglietto();
        this.nome = nome;
    }

    private Boolean contieneBiglietto(String cod) {
        CodaBiglietto codaTemp = new CodaBiglietto();
        boolean trovato = false;
        while (!coda.isEmpty()) {
            Biglietto b = coda.estrai();
            if (b.getCodiceBiglietto().equals(cod)) {
                trovato = true;
            }
            codaTemp.accoda(b);
        }
        while (!codaTemp.isEmpty()) {
            coda.accoda(codaTemp.estrai());
        }
        return trovato;
    }

    public boolean aggiuntaBiglietto(Biglietto b) {
        if (!contieneBiglietto(b.getCodiceBiglietto())) {
            coda.accoda(b);
            return true;
        }
        return false;
    }

    public boolean rimuovereBiglietto(String codice) {
        CodaBiglietto codaTemp = new CodaBiglietto();
        boolean rimosso = false;
        while (!coda.isEmpty()) {
            Biglietto b = coda.estrai();
            if (b.getCodiceBiglietto().equals(codice)) {
                rimosso = true;
            }
            codaTemp.accoda(b);
        }
        while (!codaTemp.isEmpty()) {
            coda.accoda(codaTemp.estrai());
        }
        return rimosso;
    }

    public PilaBigliettoDigitale pilaBigliettiDigitali(double prezzo) {
        PilaBigliettoDigitale p = new PilaBigliettoDigitale();
        CodaBiglietto codaTemp = new CodaBiglietto();

        while (!coda.isEmpty()) {
            Biglietto b = coda.estrai();
            if (b instanceof BigliettoDigitale && b.getPrezzoDiVendita() < prezzo) {
                p.push((BigliettoDigitale) b);
            }
            codaTemp.accoda(b);

        }

        while (!codaTemp.isEmpty()) {
            coda.accoda(codaTemp.estrai());
        }
        return p;
    }

    public int numBigliettiCartacei() {
        int conta = 0;
        CodaBiglietto codaTemp = new CodaBiglietto();
        while (!coda.isEmpty()) {
            Biglietto b = coda.estrai();
            if (b instanceof BigliettoCartaceo) {
                conta++;
            }
            codaTemp.accoda(b);
        }
        while (!codaTemp.isEmpty()) {
            coda.accoda(codaTemp.estrai());
        }
        return conta;
    }

    public void stampaTutto() {
        CodaBiglietto codaTemp = new CodaBiglietto();
        while (!codaTemp.isEmpty()) {
            Biglietto b = coda.estrai();
            if (b instanceof BigliettoDigitale) {
                BigliettoDigitale bD = (BigliettoDigitale) b;
                System.out.println(bD.toString());
            } else if (b instanceof BigliettoCartaceo) {
                BigliettoCartaceo bC = (BigliettoCartaceo) b;
                System.out.println(bC.toString());
            } else {
                System.out.println(b.toString());
            }
        }
        while (!codaTemp.isEmpty()) {
            coda.accoda(codaTemp.estrai());
        }
    }

    public void stampaPillaBigliettiDigitali(PilaBigliettoDigitale p){
        while(!p.isEmpty()){
            BigliettoDigitale b = p.pop();
            System.out.println(b.toString());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CodaBiglietto getCoda() {
        return coda;
    }

    public void setCoda(CodaBiglietto coda) {
        this.coda = coda;
    }

}
