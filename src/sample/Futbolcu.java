package sample;

import javafx.scene.image.Image;

public class Futbolcu extends Sporcu{

    private int penalti;
    private int serbestAtis;
    private int kaleci;
    private boolean kullanildi;


    public Futbolcu(String sporcuIsmi, String sporcuTakim, int penatli, int serbestAtis, int kaleci, boolean kullanildi, Image foto ){
        super.setSporcuTakim(sporcuTakim);
        super.setSporcuIsim(sporcuIsmi);
        super.setFoto(foto);
        this.penalti = penatli;
        this.serbestAtis = serbestAtis;
        this.kaleci = kaleci;
        this.kullanildi = kullanildi;

    }

    @Override
    public void sporcuPuaniGoster() {
        System.out.println("Penaltı: "+getPenalti());
        System.out.println("Serbest Vuruş: "+getSerbestAtis());
        System.out.println("Kaleciyle karşı karşıya:"+getKaleci());
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleci() {
        return kaleci;
    }

    public void setKaleci(int kaleci) {
        this.kaleci = kaleci;
    }

    public boolean isKullanildi() {
        return kullanildi;
    }

    public void setKullanildi(boolean kullanildi) {
        this.kullanildi = kullanildi;
    }


}
