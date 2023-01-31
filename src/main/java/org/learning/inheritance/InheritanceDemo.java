package org.learning.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        MountainBike mBike = new MountainBike(20,1,10);
        System.out.println("Gear is :"+mBike.gear);
        System.out.println("Seat height is :"+mBike.seatHeight);
        System.out.println("Bike Speed is :"+mBike.speed);
        mBike.applyBrake(1);
        System.out.println("Bike speed after applying break :"+mBike.speed);
    }
}
