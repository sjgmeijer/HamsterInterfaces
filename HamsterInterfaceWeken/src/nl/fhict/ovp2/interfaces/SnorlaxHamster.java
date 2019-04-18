package nl.fhict.ovp2.interfaces;

import java.util.Date;

public interface SnorlaxHamster {
//you need to implement the Hamster Interface.

    double getSleepHours();

    void setSleepHours(double sleepingHours);

    //november t/m februari winterslaap
    boolean isHybernation(Date sleepStart, Date wakeUp);

    int getFoodAmount();

    void setFoodAmount(int foodAmount);

    String getFoodTYpe();

    void setFoodType(String foodType);
}