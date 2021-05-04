package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Sporcu {

     private String sporcuIsim;
     private String sporcuTakim;
     private Image foto;


    public Sporcu() {

    }

    public Sporcu(String sporcuIsim, String sporcuTakim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;

    }
    public abstract void sporcuPuaniGoster();

    public String getSporcuIsim() {
        return sporcuIsim;
    }

    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }

    public String getSporcuTakim() {
        return sporcuTakim;
    }

    public void setSporcuTakim(String sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
}
