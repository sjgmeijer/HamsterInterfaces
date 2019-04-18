package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;

public class Goudhamster implements Hamster {


    private String name;
    private int weight;
    private int size;

    public Goudhamster(String setName, int setWeightGram, int setSizeCm) {
        this.name = setName;
        this.weight = setWeightGram;
        this.size = setSizeCm;
    }

    public int compareTo(Hamster o) {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

}