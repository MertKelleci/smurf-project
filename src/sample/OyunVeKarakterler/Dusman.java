package sample.OyunVeKarakterler;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.Djikstra.Harita;
import sample.Djikstra.Node;

import java.io.File;
import java.util.*;

public abstract class Dusman extends Karakter{
    Image dusmanImage;
    Lokasyon initialLokasyon;
    public Dusman(String ID, String ad, int x, int y, File file) {
        super(ID, ad, x, y,KarakterTipi.Dusman);
        dusmanImage = new Image(file.toURI().toString());
        initialLokasyon = new Lokasyon(x,y);
    }

    @Override
    public ArrayList<Node> EnKisaYol(Lokasyon oyuncuLokasyon) {
        Map<Node, List<Node>> map = new Harita().getMap();
        Set<Node> visited = new HashSet<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        List<Node> lutfen = new ArrayList<>();

        Node giris = new Node(this.getLokasyon().getX(),this.getLokasyon().getY());
        Node cikis = new Node(oyuncuLokasyon.getX(),oyuncuLokasyon.getY());

        giris.setOnceki(null);
        for (Node node:map.keySet()){
            lutfen.add(node);
            node.setOnceki(null);
            node.setMesafe(Integer.MAX_VALUE);
        }

        if (map.get(giris).contains(cikis))
            return null;

        giris.setMesafe(0);
        pq.add(giris);
        pq.peek().setMesafe(0);
        while(!pq.isEmpty()){
            Node enYakin = pq.poll();
            List<Node> nodeList = map.get(enYakin);
            visited.add(enYakin);

            for(Node node:nodeList){
                if(!visited.contains(node)){
                    int temp = enYakin.getMesafe()+1;

                    if(node.getMesafe()>temp){
                        node.setMesafe(temp);
                        node.setOnceki(enYakin);
                    }
                        pq.add(node);
                    }
                }
            }

        List<Node> output = new ArrayList<>();
        Node temp = lutfen.get(lutfen.indexOf(cikis));

        while (temp.getOnceki()!=null){
            output.add(temp);
            temp = temp.getOnceki();
        }

        return (ArrayList<Node>) output;
    }

    public Image getDusmanImage() {
        return dusmanImage;
    }

    public Lokasyon getDusmanKonum(){
        return this.lokasyon;
    }

    public String getID(){
        return this.ID;
    }

    public void setInitialLokasyon(){
        this.lokasyon = initialLokasyon;
    }
}
