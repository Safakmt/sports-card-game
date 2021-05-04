package sample;

import javafx.scene.image.Image;

public class Basketbolcu extends Sporcu {

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kullanildi;


    public Basketbolcu(String sporcuIsmi, String sporcuTakim, int ikilik, int ucluk, int serbestAtis, boolean kullanildi, Image foto ){
        super.setSporcuIsim(sporcuIsmi);
        super.setSporcuTakim(sporcuTakim);
        super.setFoto(foto);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
        this.kullanildi = kullanildi;
    }

    public Basketbolcu(){

    }

    @Override
    public void sporcuPuaniGoster() {
        System.out.println("ikilik: "+getIkilik());
        System.out.println("üçlük:"+getUcluk());
        System.out.println("Serbest Atış:"+getSerbestAtis());
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public boolean isKullanildi() {
        return kullanildi;
    }

    public void setKullanildi(boolean kullanildi) {
        this.kullanildi = kullanildi;
    }


}
