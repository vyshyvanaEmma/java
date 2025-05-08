package es37Viaggio;


public class Prenotazione {
    private String cognome, nome, tel, cittaPart, cittaDest, data;

    public Prenotazione(String cognome, String nome, String tel, String cittaPart, String cittaDest, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.tel = tel;
        this.cittaPart = cittaPart;
        this.cittaDest = cittaDest;
        this.data = data;
    }

    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getCittaPart() {
        return cittaPart;
    }
    public void setCittaPart(String cittaPart) {
        this.cittaPart = cittaPart;
    }
    public String getCittaDest() {
        return cittaDest;
    }
    public void setCittaDest(String cittaDest) {
        this.cittaDest = cittaDest;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prenotazione - cognome:" + cognome + ", nome:" + nome + ", telefono: " + tel + ", citta di partenza: " + cittaPart
                + ", citta di destinzaione " + cittaDest + ", data:" + data + "/n";
    }
}
