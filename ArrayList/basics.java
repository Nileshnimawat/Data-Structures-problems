import java.util.ArrayList;
import java.util.Collections;

public class basics{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(66);
        arr.add(5);
        arr.add(1000);
        arr.add(40);
        //adding element at some index i 
        arr.add(2,60);
        //modyfying element at index i 
        arr.set(2, 100);
        //removing element at index i 
        arr.remove(2);
        //remove the value of element
        arr.remove(Integer.valueOf(5));
        //checking element at index exists
        System.out.println(arr.contains(5));
        
//printLoop for arraylist

        for(int i = 0 ; i <arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        //direct printing
        System.out.println("\n"+arr);
        //sorting the arraylist
        Collections.sort(arr);
        System.out.println(arr);
        //soerting arraylist at descending order
        Collections.sort(arr , Collections.reverseOrder());
        System.out.println(arr);


    }
}