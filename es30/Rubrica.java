package es30;
public class Rubrica {
                private Contatto testa;
            
                public Rubrica() {
                    this.testa = null;
                }
            
                public boolean aggiungiContatto(String nome, String cognome, String nTel) {
                    if (contatoSearch(nTel)) {
                        return false;
                    }
            
                    Contatto nuovoC = new Contatto(nome, cognome, nTel);
            
                    if (testa == null) {
                        testa = nuovoC;
                    } else {
                        Contatto t = testa;
                        while (t.getNext() != null) {
                            t = t.getNext();
                        }
                        t.setNext(nuovoC);
                    }
                    return true;
                }
            
                public boolean contatoSearch(String numeroTel) {
                    Contatto t = testa;
                    while (t != null) {
                        if (t.getNumeroTel().equals(numeroTel)) {
                            return true;
                        }
                        t = t.getNext();
                    }
                    return false;
                }
            
                public boolean ricercaNomeCognome(String nome, String cognome) {
                    Contatto t = testa;
                    while (t != null) {
                        if (t.getNome().equals(nome) && t.getCognome().equals(cognome)) {
                            return true;
                        }
                        t = t.getNext();
                    }
                    return false;
                }
            
                public Contatto ricercaPerNumeroTel(String nTel) {
                    Contatto t = testa;
                    while (t != null) {
                        if (t.getNumeroTel().equals(nTel)) {
                            return t;
                        }
                        t = t.getNext();
                    }
                    return null;
                }
            
                public Contatto ricercaPerNomeCognome(String nome, String cognome) {
                    Contatto t = testa;
                    while (t != null) {
                        if (t.getNome().equals(nome) && t.getCognome().equals(cognome)) {
                            return t;
                        }
                        t = t.getNext();
                    }
                    return null;
                }
            
                public boolean eliminaNomeCognome(String nome, String cognome) {
                    if (testa == null) {
                        return false;
                    }
                    if (testa.getNome().equals(nome) && testa.getCognome().equals(cognome)) {
                        testa = testa.getNext();
                        return true;
                    }
                    Contatto t = testa;
                    while (t.getNext() != null) {
                        if (t.getNext().getCognome().equals(cognome) && t.getNext().getNome().equals(nome)) {
                            t.setNext(t.getNext().getNext());
                            return true;
                        }
                        t = t.getNext();
                    }
                    return false;
                }
            
                public boolean eliminanumeroTelefono(String nTel) {
                    if (testa == null) {
                        return false;
                    }
                    if (testa.getNumeroTel().equals(nTel)) {
                        testa = testa.getNext();
                        return true;
                    }
                    Contatto t = testa;
                    while (t.getNext() != null) {
                        if (t.getNext().getNumeroTel().equals(nTel)) {
                            t.setNext(t.getNext().getNext());
                            return true;
                        }
                        t = t.getNext();
                    }
                    return false;
                }
            
                public void stampaRubrica() {
                    if (testa == null) {
                        System.out.println("La rubrica e' vuota.");
                        return;
                    }
            
                    Contatto t = testa;
                    while (t != null) {
                        System.out.println("Nome: " + t.getNome() + ", Cognome: " + t.getCognome() + ", Numero: " + t.getNumeroTel());
                        t = t.getNext();
                    }
                }
            }
