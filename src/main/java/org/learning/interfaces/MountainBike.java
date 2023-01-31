package org.learning.interfaces;

public class MountainBike implements Bicycle {

    private int seatHeight;

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int gear;
    private int speed;

    public MountainBike (int startHeight, int startGear, int startSpeed){
        seatHeight=startHeight;
        gear=startGear;
        speed=startSpeed;
    }

    public void setHeight(int newValue){
        seatHeight=newValue;
    }

    @Override
    public void applyBrake(int dec) {
        speed-=1;
    }

       @Override
    public void speedUp(int inc) {

    }
}
