package org.learning.inheritance;

public class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle (int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public void setGear(int newValue){
        gear=newValue;
    }

    public void applyBrake(int dec){
        speed -=dec;
    }

    public void speedUp(int inc){
        speed+=inc;
    }

}
