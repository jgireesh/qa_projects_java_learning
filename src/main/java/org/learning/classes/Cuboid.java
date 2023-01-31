package org.learning.classes;

public class Cuboid {

    int w;
    int h;
    int d;
    Cuboid(){
        this.w=4;
        this.h=5;
        this.d=6;
    }
    Cuboid(int w, int h){
        this.w=w;
        this.h=h;
        this.d=10;
    }

    Cuboid(int w, int h, int d){
        this.w=w;
        this.h=h;
        this.d=d;
    }

    Cuboid(int d){
        this.w=20;
        this.h=15;
        this.d=d;
    }

    int volume(){
        return w*h*d;
    }

    public static void main(String[] args) {
        Cuboid obj1 = new Cuboid(2,3,4);
        System.out.println(obj1.volume());

        Cuboid obj2 = new Cuboid(2,3);
        System.out.println(obj2.volume());

        Cuboid obj3 = new Cuboid(2);
        System.out.println(obj3.volume());

        Cuboid defCoubiod = new Cuboid();
        System.out.println(defCoubiod.volume());
    }
}
