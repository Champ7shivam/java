package javaOops.introducingClasses;

class ThisBox {
    double width;
    double height;
    double depth;

    ThisBox(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class This {
    public static void main(String[] args) {
        ThisBox mybox1 = new ThisBox(10, 20, 15);
        ThisBox mybox2 = new ThisBox(3, 6, 9);

        System.out.println("volume of mybox1 " + mybox1.volume());
        System.out.println("volume of mybox2 " + mybox2.volume());
    }
}
