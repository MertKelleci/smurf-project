package sample.OyunVeKarakterler;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Djikstra.Harita;
import sample.Djikstra.Node;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Oyuncu extends Karakter {
    private int Skor;
    private Image karakterImage;
    public Oyuncu(String ID, String ad, File file) {
        super(ID, ad,6,5,KarakterTipi.Oyuncu);
        this.Skor = 20;
        karakterImage = new Image(file.toURI().toString());
    }

    public void PuanHesapa(Dusman dusman){
        if(dusman.getID().equals("Gargamel"))
            Skor-=15;

        else if(dusman.getID().equals("Azman"))
            Skor-=5;
    }

    public Image getOyuncuImage(){
        return this.karakterImage;
    }

    public int PuaniGoster(){
        return Skor;
    }

    public String getoyuncuID(){
        return this.ID;
    }

    public String getoyuncuAd(){
        return this.Ad;
    }

    public Lokasyon oyuncuKonum(){
        return this.lokasyon;
    }

    public void setLokasyon(Lokasyon lokasyon){
        this.lokasyon = lokasyon;
    }

    public boolean move(String way){
        Map<Node, List<Node>> map = new Harita().getMap();
        String yon = way.trim();
        int x = this.getLokasyon().getX();
        int y = this.getLokasyon().getY();
        Node currentLokasyon = new Node(x,y);
        Node wayToGo;

        if(yon.equalsIgnoreCase("w")){
            wayToGo = new Node(x,(y-1));
            if (map.get(currentLokasyon).contains(wayToGo)){
                this.setLokasyon(wayToGo.getLokasyon());
                return true;
            }
        }

        else if(yon.equalsIgnoreCase("s")){
            wayToGo = new Node(x,(y+1));
            if(map.get(currentLokasyon).contains(wayToGo)){
                this.setLokasyon(wayToGo.getLokasyon());
                return true;
            }
        }

        else if(yon.equalsIgnoreCase("d")){
            wayToGo = new Node((x+1),y);
            if(map.get(currentLokasyon).contains(wayToGo)){
                this.setLokasyon(wayToGo.getLokasyon());
                return true;
            }
        }

        else if(yon.equalsIgnoreCase("a")){
            wayToGo = new Node((x-1),y);
            if(map.get(currentLokasyon).contains(wayToGo)){
                this.setLokasyon(wayToGo.getLokasyon());
                return true;
            }
        }

        return false;
    }
}
