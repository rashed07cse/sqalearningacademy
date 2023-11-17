package JavaForEachLoop;


import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public final String  name= "DEPARTMENT";
    public static void main(String args[]) {


        //Creating a list of elements
        // create ArrayList

        List<Object> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add("pritom Mondol");
        System.out.println(arrayList);

        for (Object name:arrayList){
            System.out.println(name);
        }
    }
}
