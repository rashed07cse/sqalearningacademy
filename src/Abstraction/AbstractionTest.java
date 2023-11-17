package Abstraction;

public class AbstractionTest {
    public static void main(String[] args) {
        KrishiBank krishiBank = new KrishiBank();
        System.out.println("Interest Rate of krishi Bank" + " " + krishiBank.getInterestRate() + "%");

        PubaliBank bank = new PubaliBank();
        System.out.println("Interest Rate of krishi Bank" + " " + bank.getInterestRate() + "%");

    }

}
