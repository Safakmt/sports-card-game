package sample;

public class  Bilgisayar extends Oyuncu {

    public Bilgisayar(int oyuncuID, String oyuncuad, int skor){
        super.setOyuncuID(oyuncuID);
        super.setOyuncuad(oyuncuad);
        super.setSkor(skor);
    }

    public Bilgisayar() {}

    @Override
    public void kartSec() {

    }
}
