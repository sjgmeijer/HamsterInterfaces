package nl.fhict.ovp2.interfaces;

public interface RamboHamster{

    //You are required to implement the "Hamster" interface.

    void setWeapon(String weapon);
    String getWeapon();

    void setKills(int kills);
    int getKills();

    void setDeaths(int deaths);
    int getDeaths();

    void setAmmo(int ammo);
    int getAmmo();

    double getKillDeathRatio(int deaths, int kills);


}
