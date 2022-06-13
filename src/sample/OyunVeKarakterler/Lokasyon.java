package sample.OyunVeKarakterler;

import java.util.Comparator;
import java.util.Objects;

public class Lokasyon{
    private int x;
    private int y;

    public Lokasyon(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lokasyon lokasyon = (Lokasyon) o;
        return x == lokasyon.x && y == lokasyon.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y) +31;
    }
}
