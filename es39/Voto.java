package es39;

public class Voto {

    private char sesso;
    private int num;

    public Voto(int num, char sesso) {
        this.num = num;
        this.sesso = sesso;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getSesso() {
        return sesso;
    }

    public void setNum(char sesso) {
        this.sesso = sesso;
    }

}
