package sample.OyunVeKarakterler;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Djikstra.Node;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Gargamel extends Dusman{
    private ArrayList<Node> yolList;
    public Gargamel(Lokasyon lokasyon){
        super("Gargamel","Gargamel",lokasyon.getX(), lokasyon.getY(), new File("src/drawings/Gargamel.jpg"));
    }

    public ArrayList<Lokasyon> move(Lokasyon oyuncuLokasyon){
        yolList = EnKisaYol(oyuncuLokasyon);
        if(yolList == null || yolList.size()<2)
            return null;


        this.lokasyon.setX(yolList.get(yolList.size()-2).getLokasyon().getX());
        this.lokasyon.setY(yolList.get(yolList.size()-2).getLokasyon().getY());
        System.out.println("Gargamel konum: "+lokasyon.getX()+" "+lokasyon.getY());
        List<Lokasyon> output = new ArrayList<>();
        for(Node node:yolList)
            output.add(node.getLokasyon());

        return (ArrayList<Lokasyon>) output;
    }

}
