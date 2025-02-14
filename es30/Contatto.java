package es30;

public class Contatto {
              private String nome, cognome;
              private String numeroTel;
              Contatto next;
                public Contatto(String nome, String cognome, String numeroTel) {
                                this.nome = nome;
                                this.cognome = cognome;
                                this.numeroTel = numeroTel;
                                this.next = null;
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
                public String getNumeroTel() {
                                return numeroTel;
                }
                public void setNumeroTel(String numeroTel) {
                                this.numeroTel = numeroTel;
                }
                public Contatto getNext() {
                                return next;
                }
                public void setNext(Contatto next) {
                                this.next = next;
                }
                
}
