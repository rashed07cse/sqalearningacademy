package Interface;

public class InterfaceTest implements Printable, Showable{
    @Override
    public void print() {
        System.out.println("Print something");
    }
    @Override
    public void show() {
        System.out.println("show something");
    }

    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.print();
        interfaceTest.show();
    }

}
