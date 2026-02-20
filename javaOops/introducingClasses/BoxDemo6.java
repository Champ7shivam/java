package javaOops.introducingClasses;

class Box6 {
    double width;
    double height;
    double depth;

    // Box6() {
    // System.out.println("This is the by default constructor. ");
    // }

    Box6() {
        System.out.println("COnstructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();

        System.out.println("volume of mybox1 " + mybox1.volume());
        System.out.println("volume of mybox2 " + mybox2.volume());
    }
}
