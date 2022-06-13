package sample.OyunVeKarakterler;

import javafx.scene.image.Image;
import sample.Djikstra.Node;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Azman extends Dusman{
    private ArrayList<Node> yolList;
    public Azman(Lokasyon lokasyon){
        super("Azman","Azman",lokasyon.getX(), lokasyon.getY(), new File("src/drawings/Azman.jpg"));
    }

    public ArrayList<Lokasyon> move(Lokasyon oyuncuLokasyon){
        yolList = EnKisaYol(oyuncuLokasyon);

        if(yolList == null)
            return null;

        this.lokasyon.setX(yolList.get(yolList.size()-1).getLokasyon().getX());
        this.lokasyon.setY(yolList.get(yolList.size()-1).getLokasyon().getY());
        System.out.println("Azman konum: "+lokasyon.getX()+" "+lokasyon.getY());
        List<Lokasyon> output = new ArrayList<>();
        for(Node node:yolList)
            output.add(node.getLokasyon());

        return (ArrayList<Lokasyon>) output;
    }

}
