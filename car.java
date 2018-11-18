package com.company;

public class car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;

    public car(int costumMaxSpeed, double costumWeight, boolean costumIsTheCarOn) {
        maxSpeed = costumMaxSpeed;
        weight = costumWeight;
        isTheCarOn = costumIsTheCarOn;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }


    public void printVars() {
        //prints variables
        System.out.println("Max speed - " + maxSpeed);
        System.out.println("Min speed - " + minSpeed);
        System.out.println("Weight - " + weight);
        System.out.println("Is the car on - " + isTheCarOn);
    }

}
