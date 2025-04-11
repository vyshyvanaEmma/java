//package es37(viaggio);

import java.util.Date;

public class Prenotazione {
    private String nome, cognome, tel, cittaPart, cittaDest;
    private Date data;

    public Prenotazione(String nome, String cognome, String tel, String cittaPart, String cittaDest, Date data) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel = tel;
        this.cittaPart = cittaPart;
        this.cittaDest = cittaDest;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
