package oop;

import oop.Constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Constructor defaultConstructor = new Constructor();
        Constructor paramConstructor = new Constructor("Nishat Apu", "Female", 001);
        paramConstructor.displayStudentInformation();

        System.out.println(paramConstructor.name);
       paramConstructor.displayStudentInformation();

    }
}
