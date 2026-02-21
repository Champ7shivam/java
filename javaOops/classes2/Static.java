package javaOops.classes2;

class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Static block initialized. ");
        b = a * 4;
    }

    int d = 1;

    public static void main(String[] args) {
        meth(42);
        // System.out.println(d); give error
    }
}

class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void callme() {
        System.out.println("a = " + a);
    }
}

public class Static {
    public static void main(String[] args) {
        // System.out.println(ob.a); give error
        UseStatic.meth(4);
        System.out.println(UseStatic.a);

        StaticDemo.callme();
        System.out.println("b = " + StaticDemo.b);
    }
}
