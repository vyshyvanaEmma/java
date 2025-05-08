package es38_GestionaleAuto;

public class Prenotazione {
    private String cognome;
    private String nome;
    private String telefono;
    private String cittaPartenza;
    private String cittaDestinazione;
    private String data;

    public Prenotazione(String cognome, String nome, String telefono, 
                       String cittaPartenza, String cittaDestinazione, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaPartenza = cittaPartenza;
        this.cittaDestinazione = cittaDestinazione;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return cognome + " " + nome + " - " + cittaPartenza + " → " + cittaDestinazione + " (" + data + ")";
    }
}