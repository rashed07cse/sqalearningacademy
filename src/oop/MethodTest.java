package oop;

public class MethodTest {
    public static void main(String[] args) {
        Method method = new Method();
        method.sum();
        method.sum(10, 290);
        int result = method.sum(10, 10, 30);
        System.out.println("Total sum of 3 values:" + result);
        method.sum(10, 10.30, 10.5f);
    }
}
