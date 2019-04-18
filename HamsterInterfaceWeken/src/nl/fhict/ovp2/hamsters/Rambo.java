package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.*;

public class Rambo implements Hamster, RamboHamster {
    private String name;
    private int weight;
    private String weapon;
    private int kills;
    private int deaths;
    private int ammo;

    public Rambo(String name, int weight, String weapon, int kills, int deaths, int ammo) {
        this.name = name;
        this.weight = weight;
        this.weapon = weapon;
        this.kills = kills;
        this.deaths = deaths;
        this.ammo = ammo;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }
    @Override
    public int compareTo(Hamster o) {
        return 0;
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
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    @Override
    public int getDeaths() {
        return deaths;
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

}
