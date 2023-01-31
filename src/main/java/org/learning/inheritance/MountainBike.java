package org.learning.inheritance;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike (int startHeight, int startGear, int startSpeed){
        super(startGear,startSpeed);
        seatHeight=startHeight;
    }

    public void setHeight(int newValue){
        seatHeight=newValue;
    }
}
