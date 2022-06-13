package sample.Djikstra;

import sample.OyunVeKarakterler.Lokasyon;

import java.util.Arrays;
import java.util.Comparator;

public class Node implements Comparable<Node>{
    private Lokasyon lokasyon;
    private int mesafe;
    private Node onceki;

    public Node(int x, int y) {
        lokasyon = new Lokasyon(x,y);
        mesafe = Integer.MAX_VALUE;
    }


    public void setMesafe(int mesafe) {
        this.mesafe = mesafe;
    }

    public Node getOnceki() {
        return onceki;
    }

    public void setOnceki(Node onceki){
        this.onceki = onceki;
    }

    public int getMesafe(){
        return mesafe;
    }

    public Lokasyon getLokasyon() {
        return lokasyon;
    }

    @Override
    public int compareTo(Node o) {
        if(this.mesafe<o.getMesafe())
            return -1;

        else if(this.mesafe> o.getMesafe())
            return 1;

        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node Node = (Node) o;
        Lokasyon oLokasyon = ((Node) o).getLokasyon();
        if(lokasyon.getX() == oLokasyon.getX() && lokasyon.getY() == oLokasyon.getY())
            return true;

        else
            return false;
    }

    @Override
    public int hashCode() {
        return lokasyon.hashCode() + 31;
    }
}
