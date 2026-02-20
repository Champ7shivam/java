package javaOops.introducingClasses;
// 01

class Box {
     double width;
     double height;
     double depth;
}

public class boxDemo {
     public static void main(String[] args) {
          Box mybox = new Box();

          // System.out.println(mybox.width);

          mybox.width = 10;
          mybox.height = 20;
          mybox.depth = 15;

          // System.out.println(mybox.width);

          double vol;
          vol = mybox.depth * mybox.width * mybox.height;
          System.out.println("volume is " + vol);
     }
}

class BoxDemo2 {
     public static void main(String[] args) {
          Box mybox1 = new Box();
          Box mybox2 = new Box();

          mybox1.width = 10;
          mybox1.height = 20;
          mybox1.depth = 15;

          double vol;
          vol = mybox1.depth * mybox1.width * mybox1.height;

          System.out.println("volume is " + vol);

          mybox2.width = 3;
          mybox2.height = 6;
          mybox2.depth = 9;

          vol = mybox2.width * mybox2.height * mybox2.depth;
          System.out.println("Volume is " + vol);
     }
}