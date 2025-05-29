import java.util.ArrayList;

public class swapNo {
    public static void swap(ArrayList<Integer> arr,int i , int j){
         int temp = arr.get(i);
         arr.set(i, arr.get(j));
         arr.set(j,temp);  
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(66);
       System.out.println(arr);
      
        swap(arr, 1, 2);
      
     
       System.out.println(arr);
    }
}
 