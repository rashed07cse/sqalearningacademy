package MethodOverriding;

public class MethodOverridingTest {
    public static void main(String[] args) {
        KrishiBank krishiBank = new KrishiBank();
        System.out.println("Interest Rate of krishi Bank" + " " + krishiBank.getInterestRate() + "%");

        PubaliBank pubaliBank = new PubaliBank();
        System.out.println("Interest Rate of krishi Bank" + " " + pubaliBank.getInterestRate() + "%");

    }

}
