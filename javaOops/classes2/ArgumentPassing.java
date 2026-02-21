package javaOops.classes2;

class TestArgument {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        TestArgument ob = new TestArgument();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b before call: " + a + " " + b);
    }
}

class TestArgument2 {
    int a, b;

    TestArgument2(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TestArgument2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class passObjRef {
    public static void main(String[] args) {
        TestArgument2 ob = new TestArgument2(15, 20);

        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}