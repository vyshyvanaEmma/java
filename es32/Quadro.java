package es32;

class Quadro extends OperaDArte {
                private double base;
                private double altezza;
            
                public Quadro(String titolo, String nomeArtista, String cognomeArtista, double valore, double base, double altezza) {
                    super(titolo, nomeArtista, cognomeArtista, valore);
                    this.base = base;
                    this.altezza = altezza;
                }
            
                @Override
                public double getIngombro() {
                    return base * altezza; 
                }
            
                @Override
                public String toString() {
                    return super.toString() + ", Tipo: Quadro, Base: " + base + ", Altezza: " + altezza;
                }
            }

