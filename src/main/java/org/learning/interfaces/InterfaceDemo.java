package org.learning.interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        MountainBike mBike = new MountainBike(20,1,10);
        System.out.println("Gear is :"+mBike.getGear());
        System.out.println("Seat height is :"+mBike.getSeatHeight());
        System.out.println("Bike Speed is :"+mBike.getSpeed());
        mBike.applyBrake(1);
        System.out.println("Bike speed after applying break :"+mBike.getSpeed());
    }
}
