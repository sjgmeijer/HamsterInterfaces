package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;

public class Blossom implements Hamster {

    private String naam;
    private int gewicht;
    private String wapen;


    public Blossom(String naam, int gewicht, String wapen){
        this.naam = naam;
        this.gewicht = gewicht;
        this.wapen = wapen;
    }
    public String getName() {
        return naam;
    }

    public String getWapen() {
        return wapen;
    }
    public int getWeight() {
        return gewicht;
    }

    public int compareTo(Hamster o) {
        return 0;
    }
}
