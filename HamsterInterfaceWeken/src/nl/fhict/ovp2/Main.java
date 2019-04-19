package nl.fhict.ovp2;

import nl.fhict.ovp2.hamsters.*;
import nl.fhict.ovp2.interfaces.Hamster;

public class Main {

    public static void main(String[] args) {

        //HamsterFarm maken
        HamsterFarm hamsterFarm = new HamsterFarm("De powerpuffHamsters");

        //verschillende hamsters maken
        Hamster blossom = new Blossom("Blossom 1", 40, "laser ogen");
        Hamster bubbles = new Bubbles("Bubbles 1", 50, "Stalen vuisten");
        Hamster buttercup = new Buttercup("Buttercup 1", 60, "onzichtbaar");
        Hamster goudhamster = new Goudhamster("Martijn", 100, 40);
        Hamster eersteRambo = new Rambo("Stefan", 100, "Glock", 20, 2,250);
        Hamster eersteSnorlax = new TestHamster("Jos", 300, 8, 10, "Alles");
        Hamster eersteSelfieHamster = new SelfieeHamster("Alexander", 50, "Kodak", "Insta", 10.0,"duckface",100);
        Hamster beastieboyz = new Beastieboyz("Warface a.k.a Beastieboy", 3, "Boodschappenmand", 12, 5, 450);
        Hamster terminatorHamster = new TerminatorHamster("Kratje", 34, 999, "TerminatorHamster", 120,4);
        Hamster eenVoetbalHamster = new nl.fhict.ovp2.VoetbalHamster("Luis Suárez", 46, "Tanden", 4, 2,560);
        Hamster eenYorickHamster = new YorickHamster(220, "YorickHamster", "Kapsalon", 493,234,493);
        Hamster eenPokeFlute = new PokeFluteHamster("PokeFlute", 240,14, true, 20,"Yoricks");

        //hamsters toevoegen aan hamsterFarm
        hamsterFarm.add(blossom);
        hamsterFarm.add(bubbles);
        hamsterFarm.add(buttercup);
        hamsterFarm.add(goudhamster);
        hamsterFarm.add(eersteRambo);
        hamsterFarm.add(eersteSnorlax);
        hamsterFarm.add(eersteSelfieHamster);
        hamsterFarm.add(beastieboyz);
        hamsterFarm.add(terminatorHamster);
        hamsterFarm.add(eenVoetbalHamster);
        hamsterFarm.add(eenYorickHamster);
        hamsterFarm.add(eenPokeFlute);

        HamsterPrinter.print(hamsterFarm);
    }

}
