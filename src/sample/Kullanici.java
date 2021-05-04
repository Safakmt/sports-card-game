package sample;

public class Kullanici extends Oyuncu {

    public Kullanici(int oyuncuID, String oyuncuad, int skor){
        super.setOyuncuID(oyuncuID);
        super.setOyuncuad(oyuncuad);
        super.setSkor(skor);
    }

    public Kullanici(){}

    @Override
    public void kartSec() {

    }
}
