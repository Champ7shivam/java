package javaOops.classes2;

class TestReturnObject {
    int a;

    TestReturnObject(int i) {
        a = i;
    }

    TestReturnObject incrByTen() {
        TestReturnObject temp = new TestReturnObject(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        TestReturnObject ob1 = new TestReturnObject(2);
        TestReturnObject ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}
