package sample.OyunVeKarakterler;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public abstract class Karakter {
    protected String ID;
    protected String Ad;
    protected Lokasyon lokasyon;
    public enum KarakterTipi{
        Oyuncu,
        Dusman;
    }

    protected KarakterTipi tip;

    public Karakter(String ID, String ad, int x,int y, KarakterTipi tip) {
        this.ID = ID;
        Ad = ad;
        this.lokasyon = new Lokasyon(x,y);
        this.tip = tip;
    }

    public ArrayList EnKisaYol(Lokasyon lokasyon){
        return null;
    }

    protected Lokasyon getLokasyon(){
        return lokasyon;
    }
}
