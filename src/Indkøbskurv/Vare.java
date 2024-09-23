package Indkøbskurv;
import java.util.ArrayList;

public class Vare {

    private double pris;
    private String varenavn;

    public Vare(double pris, String varenavn) {

        this.pris = pris;
        this.varenavn = varenavn;
    }

    public double getPris() {
        return pris;
    }

    public String varenavn() {
        return varenavn;
    }

    @Override
    public String toString() {
        return varenavn+pris;

    }
}
