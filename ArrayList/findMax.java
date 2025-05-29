import java.util.ArrayList;

public class findMax {
    public static int Max(ArrayList<Integer> arr){
        int maxi = Integer.MIN_VALUE;
        int i = 0;
        while(i<arr.size()){
          maxi = Math.max(maxi, arr.get(i));
          i++;
        }
        return maxi;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(6);
        arr.add(5);
        arr.add(10);
        arr.add(4);
        arr.add(66);
        System.out.println(Max(arr));
    }
}
