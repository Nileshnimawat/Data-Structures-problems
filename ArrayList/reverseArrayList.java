import java.util.ArrayList;

public class reverseArrayList {
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
       int i = 0;
        int j =arr.size()-1;
       while(i<j){
        swap(arr, i, j);
        i++;
        j--;
        }
     
       System.out.println(arr);
    }
}
