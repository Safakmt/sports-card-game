package sample;

public abstract class Oyuncu {
    private int oyuncuID;
    private String oyuncuad;
    private int skor;

    public abstract void kartSec();

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuad() {
        return oyuncuad;
    }

    public void setOyuncuad(String oyuncuad) {
        this.oyuncuad = oyuncuad;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }
}
