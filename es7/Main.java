public class Main {
    public static void main(String[] args) {

        BranoMusicale brano1 = new BranoMusicale(1999, "Paolo", 126, "Rock", "Back in Black");
        BranoMusicale brano2 = new BranoMusicale(2021, "Travis Scott", 200, "Rap", "Fein");
        BranoMusicale brano3 = new BranoMusicale(2000, "Drake", 205, "Rap", "One Dance");
        BranoMusicale brano4 = new BranoMusicale(2023, "Queens", 305, "Rock", "I Go Crazy");
        BranoMusicale brano5 = new BranoMusicale(2021, "50 Cent", 126, "Rap", "Intro");

        CdAudio cd1 = new CdAudio("Old Rap");
        CdAudio cd2 = new CdAudio("Rock classic");


        cd1.aggiungiBrano(brano1);
        cd1.aggiungiBrano(brano2);
        cd1.aggiungiBrano(brano5);

        cd2.aggiungiBrano(brano3); 
        cd2.aggiungiBrano(brano4);
        cd2.aggiungiBrano(brano1);

        BranoMusicale trovato = cd1.search("Fein");

        BranoMusicale branoModificato = new BranoMusicale(2021, "Drake", 190, "Rap", "God's Plan");
        cd1.modificaBrano(branoModificato);
        
        cd1.cancellaBrano("Imagine");
        cd1.cancellaBrano("Non-existent song");
        
        CdAudio cdRock = cd1.braniGenere("Rock");
        
        CdAudio cdUnito = cd1.unisciCD(cd2);

        CdAudio cdComuni = cd1.braniComuniCD(cd2);
        
        int countAnno = cd1.contaBraniAnno(2021);

        int countAutore = cd2.contaBraniAutore("Drake");
        
        BranoMusicale maxDurata = cd1.maxDurata();

        }
}
