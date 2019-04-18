package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.RamboHamster;

//implemented Hamster vergeten
public class TerminatorHamster implements Hamster, RamboHamster {


    private String weapon;
    private int kills;
    private int ammo;
    private String name;
    private int weight;
    private int deaths;

    public TerminatorHamster(String weapon, int kills, int ammo, String name, int weight, int deaths) {
        this.weapon = weapon;
        this.kills = kills;
        this.ammo = ammo;
        this.name = name;
        this.weight = weight;
        this.deaths = deaths;
    }

    @Override
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    @Override
    public void setKills(int kills) {
        this.kills = kills;
    }

    @Override
    public int getKills() {
        return kills;
    }

    @Override
    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public int getAmmo() {
        return ammo;
    }

    @Override
    public double getKillDeathRatio(int deaths, int kills) {
        return ((double) kills / deaths);
    }
// deleted  @override
    public String getName() {
        return name;
    }
// deleted  @override

    public int getWeight() {
        return weight ;
    }

// deleted  @override
    public int compareTo(Hamster o) {
        if(o.getWeight() < this.weight)
            return 1;
        else if(o.getWeight() > this.weight)
            return -1;
        else
            return 0;
    }

    @Override
    public void setDeaths(int deaths) {
        this.deaths=deaths;
    }

    @Override
    public int getDeaths() {
        return deaths;
    }

// Sander Boots & Bart Rijnders

}