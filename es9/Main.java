public class Main {
    public static void main(String[] args) {

        Quadro quadro1 = new Quadro("JHKQ1", "Las Meninias", 1654, "Paolo", 10);
        Quadro quadro2 = new Quadro(quadro1);
        Quadro quadro3 = new Quadro("JHK3" , "Perrotta", 2007, "La mamma di Perotta", 1);
        Quadro quadro4 = new Quadro("JHK4", "Giovanna Perrotta", 1944, "La mamma di zia di Perrotta", 2);
        Quadro quadro5 = new Quadro("JHK4", "Leonardo Perrotta", 1956, "La mamma di babbo di Perrotta", 3);

        GalleriaArte galleriaArte1 = new GalleriaArte("Anna Paola Mulinacci", "Via dell'Argingrosso 39");
        GalleriaArte galleriaArte2 = new GalleriaArte(galleriaArte1);


        galleriaArte1.aggiungiQuadro(quadro1);
        galleriaArte1.aggiungiQuadro(quadro4);
        galleriaArte1.aggiungiQuadro(quadro3);

        galleriaArte2.aggiungiQuadro(quadro2); 
        galleriaArte2.aggiungiQuadro(quadro5);

        galleriaArte1.cancellaQuadro(quadro1);

        galleriaArte1.ricercaQuadro(quadro5);

        galleriaArte1.prezzoQuadro(2);
        
        galleriaArte2.annoMax();

        galleriaArte2.QuadriAutore("Perrotta");

        galleriaArte2.prezzoCompreso("Paolo", 5);

        galleriaArte1.QuadroPiuVecchio();

        }
}