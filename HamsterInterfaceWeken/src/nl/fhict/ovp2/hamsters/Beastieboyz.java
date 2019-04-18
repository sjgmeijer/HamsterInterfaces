package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.RamboHamster;

public class Beastieboyz implements RamboHamster, Hamster {

    private String name;
    private int weight;
    private String weapon;
    private int kills;
    private int deaths;
    private int ammo;

    public Beastieboyz(String name, int weight, String weapon, int kills, int deaths, int ammo) {
        this.name = name;
        this.weight = weight;
        this.weapon = weapon;
        if (kills >= 0) {
            this.kills = kills;
        } else {
            System.out.println("Invalid value given for kills");
            this.kills = 0;
        }
        this.deaths = deaths;
        this.ammo = ammo;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Hamster o) {
        if (this.weight > o.getWeight()) return 1;
        else if (this.weight < o.getWeight()) return -1;
        else return 0;
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
        if (kills >= 0) {
            this.kills = kills;
        } else {
            System.out.println("Invalid value");
            this.kills = 0;
        }
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
    public double getKillDeathRatio(int deaths, int kills) { //parameters removal
        if (deaths == 0){
            return this.kills;
        } else {
            double k = Double.valueOf(this.kills);
            double d = Double.valueOf(this.deaths);
            double kd = (k/d);
            return kd;
        }
    }
}