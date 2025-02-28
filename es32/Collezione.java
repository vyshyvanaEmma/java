package es32;

class Collezione{
                private Nodo head;
                private String nome;
                private String luogo;


                public Collezione(String nome, String luogo) {
                    this.nome = nome;
                    this.luogo = luogo;
                    this.head = null;
                }
            
                public void aggiungiOpera(OperaDArte opera) {
                    Nodo nuovoNodo = new Nodo(opera);
                    if (head == null || head.opera.cognomeArtista.compareTo(opera.cognomeArtista) > 0) {
                        nuovoNodo.next = head;
                        head = nuovoNodo;
                    } else {
                        Nodo current = head;
                        while (current.next != null && current.next.opera.cognomeArtista.compareTo(opera.cognomeArtista) <= 0) {
                            current = current.next;
                        }
                        nuovoNodo.next = current.next;
                        current.next = nuovoNodo;
                    }
                }
            
                public void rimuoviOpera(String cognomeArtista, String nomeArtista) {
                    Nodo current = head;
                    Nodo previous = null;
            
                    while (current != null) {
                        if ((current.opera.cognomeArtista.equals(cognomeArtista) && current.opera.nomeArtista.equals(nomeArtista)) ||
                            (current.opera.cognomeArtista.equals(cognomeArtista) && nomeArtista == null)) {
                            if (previous == null) {
                                head = current.next;
                            } else {
                                previous.next = current.next;
                            }
                            return;
                        }
                        previous = current;
                        current = current.next;
                    }
                }
            
                public String artistaOperaPiuCostosa() {
                    if (head == null) return null;
                    Nodo current = head;
                    OperaDArte operaPiuCostosa = head.opera;
                    while (current != null) {
                        if (current.opera.getValore() > operaPiuCostosa.getValore()) {
                            operaPiuCostosa = current.opera;
                        }
                        current = current.next;
                    }
                    return operaPiuCostosa.nomeArtista + " " + operaPiuCostosa.cognomeArtista;
                }
            
                public int countQuadri() {
                    int count = 0;
                    Nodo current = head;
                    while (current != null) {
                        if (current.opera instanceof Quadro) {
                            count++;
                        }
                        current = current.next;
                    }
                    return count;
                }
            
                public int countSculture() {
                    int count = 0;
                    Nodo current = head;
                    while (current != null) {
                        if (current.opera instanceof Scultura) {
                            count++;
                        }
                        current = current.next;
                    }
                    return count;
                }
            
                public double valoreTotale() {
                    double totalValue = 0;
                    Nodo current = head;
                    while (current != null) {
                        totalValue += current.opera.getValore();
                        current = current.next;
                    }
                    return totalValue;
                }
            
                public double valoreTotalePerTipo(String tipo) {
                                double totalValue = 0;
                                Nodo current = head;   
                                while (current != null) {
                                    if (tipo.equals("Quadro") && current.opera instanceof Quadro) {
                                        totalValue += current.opera.getValore();  // Aggiungi il valore dell'opera
                                    } else if (tipo.equals("Scultura") && current.opera instanceof Scultura) {
                                        totalValue += current.opera.getValore();  // Aggiungi il valore dell'opera
                                    }
                                    current = current.next;  
                                }
                                return totalValue;  
                            }
                            
            
                public void stampaElenco() {
                    Nodo current = head;
                    while (current != null) {
                        System.out.println(current.opera.toString());
                        current = current.next;
                    }
                }
            
                public void opereConValoreMaggioreDi(double valore) {
                    Nodo current = head;
                    while (current != null) {
                        if (current.opera.getValore() > valore) {
                            System.out.println(current.opera.toString());
                        }
                        current = current.next;
                    }
                }
                            
                public String getNome() {
                                return nome;
                }

                public void setNome(String nome) {
                                this.nome = nome;
                }

                public String getLuogo() {
                                return luogo;
                }

                public void setLuogo(String luogo) {
                                this.luogo = luogo;
                }
            }
            
