package es32;

public class Main {
                public static void main(String[] args) {
                    Collezione collezione = new Collezione("Collezione ", "Firenze");
            
                    Quadro quadro1 = new Quadro("Titolo1", "Francesco", "Perrotta", 1000, 2.5, 3.5);
                    Quadro quadro2 = new Quadro("Titolo2", "Pablo", "Escobar", 200, 3.0, 4.0);
                    Scultura scultura1 = new Scultura("Titolo3", "Michelangelo", "Buonarroti", 300, 1.5, 4.0, 1.2);
            
                    collezione.aggiungiOpera(quadro1);
                    collezione.aggiungiOpera(quadro2);
                    collezione.aggiungiOpera(scultura1);
            
                    System.out.println("Artista dell'opera piu' costosa: " + collezione.artistaOperaPiuCostosa());
                    System.out.println("Numero di quadri: " + collezione.countQuadri());
                    System.out.println("Numero di sculture: " + collezione.countSculture());
                    System.out.println("Valore totale collezione: " + collezione.valoreTotale());
                    System.out.println("Valore totale quadri: " + collezione.valoreTotalePerTipo(Quadro.class));
                    System.out.println("Valore totale sculture: " + collezione.valoreTotalePerTipo(Scultura.class));
            
                    System.out.println("\nElenco opere:");
                    collezione.stampaElenco();
            
                    System.out.println("\nOpere con valore maggiore di 150:");
                    collezione.opereConValoreMaggioreDi(150);
                }
            }
            
