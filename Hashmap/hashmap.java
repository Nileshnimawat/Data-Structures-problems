import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {
    public static ArrayList<Integer> threeDigit(HashMap<Integer,Integer> mp){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 100; i<=999; i+=2){
            int x = i;
            int a = x%10;
            x = i/10;
            int b = x%10;
            x = i/10;
            int c = x;
        if(mp.containsKey(a) ){
                mp.put(a, mp.get(a)-1);
                if(mp.get(a)==0) mp.remove(a);
            if(mp.containsKey(b)){
                mp.put(b, mp.get(b)-1);
                if(mp.get(b)==0) mp.remove(b);
                if(mp.containsKey(c)) list.add(i);
                mp.put(b, mp.get(b)+1);
            }
            mp.put(a, mp.get(a)+1);
        }
       // mp.put(a, mp.get(a)+1);
    }
    return list;
    }


    public static HashMap<Integer,Integer> freq(int arr[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i =0; i < arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }
        return mp;
    }
    public static void main(String[] args) {
        //finding the 3 digit unique even no and push back to the vector it must not start with zero
        int arr[] = {2,1,3,0};
        HashMap<Integer,Integer> mp = freq(arr);
        ArrayList<Integer> list = threeDigit(mp);

        System.out.println(list);

}
}