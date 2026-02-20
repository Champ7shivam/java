package javaOops.introducingClasses;

class Box7 {
    double width;
    double height;
    double depth;

    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box7() {
        System.out.println("This is the by default constructor. ");
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);
        Box7 mybox3 = new Box7();

        System.out.println("volume of mybox1 " + mybox1.volume());
        System.out.println("volume of mybox2 " + mybox2.volume());
        System.out.println("volume of mybox2 " + mybox3.volume());

        mybox3.width = 1;
        mybox3.depth = 11;
        mybox3.height = 111;
        System.out.println("volume of mybox2 " + mybox3.volume());

    }
}
