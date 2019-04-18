package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.RamboHamster;

public class YorickHamster implements Hamster, RamboHamster {
    private int Weight;
    private String name;
    private String Weapon;
    private int Kills;
    private int Ammo;
    private int Deaths;

    public YorickHamster(int weight, String name, String weapon, int kills, int ammo, int Deaths) {
        Weight = weight;
        this.name = name;
        Weapon = weapon;
        Kills = kills;
        Ammo = ammo;
        this.Deaths = Deaths;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return Weight;
    }

    @Override
    public int compareTo(Hamster o) {
        return 0;
    }

    @Override
    public void setWeapon(String weapon) {

    }

    @Override
    public String getWeapon() {
        return Weapon;
    }

    @Override
    public void setKills(int kills) {

    }

    @Override
    public int getKills() {
        return Kills;
    }

    @Override
    public void setDeaths(int deaths) {

    }

    @Override
    public int getDeaths() {
        return Deaths;
    }

    @Override
    public void setAmmo(int ammo) {

    }

    @Override
    public int getAmmo() {
        return Ammo;
    }

    @Override
    public double getKillDeathRatio(int deaths, int kills) {
        return (double) kills / (double) deaths;

    }
}