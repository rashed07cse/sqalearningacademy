package oop;

public class Constructor {
    public String name;
    String gender;
    int stdId;

    Constructor(){
        System.out.println("Hello World");
    }
    Constructor(String n, String g, int id){
       name= n;
       gender = g;
       stdId = id;
    }


    public void studying() {
        System.out.println("Shamim reads");
    }

    public void displayStudentInformation(String n, String g, int id) {
        name = n;
        gender = g;
        stdId = id;
        System.out.println(name);
        System.out.println(gender);
        System.out.println(stdId);
    }

    public void displayStudentInformation() {
        System.out.println(name);
//        System.out.println(gender);
//        System.out.println(stdId);
    }
}
