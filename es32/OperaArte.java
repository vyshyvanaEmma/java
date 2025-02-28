package es32;

abstract class OperaDArte {
                protected String titolo;
                protected String nomeArtista;
                protected String cognomeArtista;
                protected double valore;
            
                public OperaDArte(String titolo, String nomeArtista, String cognomeArtista, double valore) {
                    this.titolo = titolo;
                    this.nomeArtista = nomeArtista;
                    this.cognomeArtista = cognomeArtista;
                    this.valore = valore;
                }
            
                public abstract double getIngombro();
            
                public String toString() {
                    return "Titolo: " + titolo + ", Artista: " + nomeArtista + " " + cognomeArtista + ", Valore: " + valore;
                }
            
                public double getValore() {
                    return valore;
                }
}
            