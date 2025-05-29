import java.util.HashMap;
public class longestSubarray {

    public static int twosum(int[] arr, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max =-1;
        int prefSum = 0;
        mp.put(0, -1);
        for(int i=0 ; i < arr.length; i++){
            prefSum += arr[i];
            if(mp.containsKey(prefSum)){
                 max = Math.max(max,i-mp.get(prefSum));
            }
            else {
                mp.put(prefSum,i);
            }
        }
        return max;
    }
}


