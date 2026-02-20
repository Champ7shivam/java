package javaOops.introducingClasses;

// This program includes a method inside the box class. 
class Box3 {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("volume is " + width * height * depth);
    }

    // compute and return volume
    double volume2() {
        return width * height * depth;
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();

        System.out.println("volume is " + mybox1.volume2());
        System.out.println("volume is " + mybox2.volume2());
    }
}