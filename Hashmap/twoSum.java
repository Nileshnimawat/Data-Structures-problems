import java.util.HashMap;

public class twoSum {
    public static int[] twosum(int[] arr, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0 ; i < arr.length; i++){
            int comp = target-arr[i];
            if(mp.containsKey(comp)){
                 return new int[] {i,mp.get(comp)};
            }
            else {
                mp.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}
