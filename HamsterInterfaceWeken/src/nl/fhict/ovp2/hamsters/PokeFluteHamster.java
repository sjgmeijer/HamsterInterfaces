package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.SnorlaxHamster;

import java.util.Date;
// jullie zijn vergeten de Hamster interface te implementeren. dit doe je met een , ertussen
public class PokeFluteHamster implements Hamster, SnorlaxHamster {

    //jullie hebben geen Constructor en geen variabelen aangemaakt:

//Variabelen
    private String name;
    private int Weight;
    private double SleepHours;
    private boolean Hybernation;
    private int foodAmount;
    private String foodType;

//Constructor
    public PokeFluteHamster(String name, int weight, double sleepHours, boolean hybernation, int foodAmount, String foodType) {
        this.name = name;
        Weight = weight;
        SleepHours = sleepHours;
        Hybernation = hybernation;
        this.foodAmount = foodAmount;
        this.foodType = foodType;
    }

    //Hier geven jullie in de getter een setMethode terug waarbij je een vaste waarde ingeeft.
    //je moet hier eigenlijk alleen de waarde van 'sleepingHours' terug geven. deze set je in de setter...
    /*
    @Override
    public double getSleepHours() {
        return setSleepHours(50);
    }
    */

    public double getSleepHours(){
        return this.SleepHours;
    }
    // hier hebben jullie een setter... een setter geeft nooit iets terug. dus wordt het een void.
    /* @Override
    public double setSleepHours(double sleepingHours) {
        return sleepingHours;
    }
    */

    public void setSleepHours(double sleepingHours){
        this.SleepHours = sleepingHours;
    }



    @Override
    public boolean isHybernation(Date sleepStart, Date wakeUp) {
        return false;
    }

    //dit is een getter... die moet geen vaste waarde hebben... zo kun je geen verschillende instanties maken van je class.

    /*@Override
    public int getFoodAmount() {
        return setFoodAmount(500);
    }
    */
    @Override
    public int getFoodAmount(){
        return this.foodAmount;
    }

    // hier hebben jullie een setter... een setter geeft nooit iets terug. dus wordt het een void. En heeft geen return.
    /*@Override
    public int setFoodAmount(int foodAmount) {
        return foodAmount;
    }
    */
    public void setFoodAmount(int foodAmount){
        this.foodAmount = foodAmount;
    }

    //dit is een getter... die moet geen vaste waarde hebben... zo kun je geen verschillende instanties maken van je class.
    /*@Override
    public String getFoodTYpe() {
        return setFoodType("Apple");
    }
    */
    @Override
    public String getFoodTYpe(){
        return this.foodType;
    }

    // hier hebben jullie een setter... een setter geeft nooit iets terug. dus wordt het een void. En heeft geen return.
    /*
    @Override

    public String setFoodType(String foodType) {
        return foodType;
    }*/

    public void setFoodType(String foodType){
        this.foodType = foodType;
    }

    //dit is een getter... die moet geen vaste waarde hebben... zo kun je geen verschillende instanties maken van je class.
    /*@Override
    public String getName() {
        return "Pokeflute";
    }
    */

    public String getName(){
        return this.name;
    }

    //dit is een getter... die moet geen vaste waarde hebben... zo kun je geen verschillende instanties maken van je class.
    /*@Override
    public int getWeight() {
        return 460;
    }
    */
    @Override
    public int getWeight(){
        return this.Weight;
    }

    @Override
    public int compareTo(Hamster o) {
        return 0;
    }
}

// Groepsleden: Sander, Maikel, Wesley
