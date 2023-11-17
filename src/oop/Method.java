package oop;

public class Method {
    int a;
    int b;
    int c;
    float d;
    double e;
    //Method not take parameter, not return any value
    public void sum() {
        a = 10;
        b = 30;
        System.out.println(a + b);
    }
    public void sum(int num1, int num2) {
        a = num1;
        b = num2;
        System.out.println(a + b);
    }
    public int sum(int num1, int num2, int num3) {
        a = num1;
        b = num2;
        c = num3;
//        int rest = a + b + c;
        return (a + b + c);
    }
    public void sum(int num1, int num2, float num3) {
        a = num1;
        b = num2;
        d = num3;
        System.out.println(a + b + d);
    }

    public void sum(int num1, double num2, float num3) {
        a = num1;
        e = num2;
        d = num3;
        System.out.println(a + b + d);
    }
}
