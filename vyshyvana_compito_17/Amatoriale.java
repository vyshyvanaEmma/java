public class Amatoriale extends Tesserato {
    private boolean personalTrainer;

    public Amatoriale(String nome, String cognome, String codiceFiscale, String codicetTessera, double mesiAbbonamento, boolean personalTrainer) {
        super(nome, cognome, codiceFiscale, codicetTessera, mesiAbbonamento);
        this.personalTrainer = personalTrainer;
    }

    public boolean isPersonalTrainer() {
        return personalTrainer;
    }
    public void setPersonalTrainer(boolean personalTrainer) {
        this.personalTrainer = personalTrainer;
    }

    @Override
    public double costoAbbonamento() {
        return COSTO_MESE * getMesiAbbonamento();
    }

    @Override
    public String toString() {
        return super.toString() + ", personalTrainer=" + personalTrainer;
    }
}
