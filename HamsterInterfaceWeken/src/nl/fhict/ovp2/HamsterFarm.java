package nl.fhict.ovp2;

import java.util.ArrayList;
import nl.fhict.ovp2.interfaces.Hamster;

class HamsterFarm extends ArrayList<Hamster> {

    private String name;

    HamsterFarm(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
