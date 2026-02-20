package javaOops.classes2;

class BoxObj {
    double width;
    double height;
    double depth;

    BoxObj(BoxObj ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxObj(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxObj() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }

    BoxObj(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        BoxObj mybox1 = new BoxObj(10, 20, 15);
        BoxObj mybox2 = new BoxObj();
        BoxObj mycube = new BoxObj(7);

        BoxObj myclone = new BoxObj(mybox1);

        double vol;

        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of cube is " + vol);

        // get volume of clone
        vol = myclone.volume();
        System.out.println("Volume of clone is " + vol);

    }
}
