package JavaForEachLoop;

public class ForEachLoop {
    public static void main(String args[]){
        //declaring an array
        int arr[]={12,13,14,44};
        //traversing the array with for-each loop
//        for(data_type variable : array | collection){
            for(int i:arr){
            System.out.println(i);
        }
    }
}
