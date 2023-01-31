package org.learning.abstracts;

abstract class GraphicObject {
    int x,y,z;

    GraphicObject(){
        System.out.println("abstract class constructor");
    }
    void moveTo(int newX, int newY){
        System.out.println("moved to x "+x + " and y "+y);
    }

    abstract void draw();
    abstract void resize();
}
