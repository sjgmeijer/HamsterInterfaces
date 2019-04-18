package nl.fhict.ovp2.hamsters;

import nl.fhict.ovp2.interfaces.Hamster;
import nl.fhict.ovp2.interfaces.SnorlaxHamster;

import java.util.Calendar;
import java.util.Date;

public class TestHamster implements Hamster, SnorlaxHamster {
    private String name;
    private int Weight;
    private double SleepHours;
    private boolean Hybernation;
    private int foodAmount;
    private String foodType;

    public TestHamster(String name, int weight, int sleepHours, int foodAmount, String foodType) {
        this.name = name;
        this.Weight = weight;
        this.SleepHours = sleepHours;
        this.foodAmount = foodAmount;
        this.foodType = foodType;
    }


    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.Weight;
    }

    public double getSleepHours() {
        return this.SleepHours;
    }

    public void setSleepHours(double sleepingHours) {
        this.SleepHours = sleepingHours;
    }

    public boolean isHybernation(Date sleepStart, Date wakeUp) {
        Calendar cal = Calendar.getInstance();
        if(cal.get(Calendar.MONTH) < sleepStart.getMonth() && cal.get(Calendar.MONTH) > wakeUp.getMonth())
        {
            return Hybernation = false;
        }else{
            return Hybernation = true;
        }
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
         this.foodAmount = foodAmount;
    }

    public String getFoodTYpe() {
        return this.foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int compareTo(Hamster o) {
        return 0;
    }
}