package es32;

class Scultura extends OperaDArte {
                private double base;
                private double altezza;
                private double profondita;
            
                public Scultura(String titolo, String nomeArtista, String cognomeArtista, double valore, double base, double altezza, double profondita) {
                    super(titolo, nomeArtista, cognomeArtista, valore);
                    this.base = base;
                    this.altezza = altezza;
                    this.profondita = profondita;
                }
            
                @Override
                public double getIngombro() {
                    return base * altezza * profondita;  
                }
            
                @Override
                public String toString() {
                    return super.toString() + ", Tipo: Scultura, Base: " + base + ", Altezza: " + altezza + ", Profondità: " + profondita;
                }
            }
            