import java.util.HashMap;

public class mostFreqElement {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int arr[] = {1,1,2,3,4,5,6,7,6,5,4,1,1,1,1,2,2,2,2};
        int mx = -1;
        int idx = -1;
        // I need to find the most freq element and its value
        for(int i = 0; i < arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }
        //
       for (var i : mp.entrySet()) {
        if(i.getValue() > mx){
            mx = i.getValue();
            idx = i.getKey();
        }
       }
       System.out.println(mx);
       System.out.println(idx);
    }
}
