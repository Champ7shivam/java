package javaOops.classes2;

class AccessTest {
    int a;
    public int b;
    private int c;

    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        AccessTest ob = new AccessTest();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 100; // error
        ob.setc(100);

        // System.out.println(ob.c); // error
        System.out.println(ob.getc());
    }
}
