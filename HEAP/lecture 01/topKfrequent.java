import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class topKfrequent {

    public static class Pair implements Comparable<Pair>{
        int element ;
        int freq;
        Pair(int element,int freq){
            this.element = element;
            this.freq = freq;
        }
        @Override
        public int compareTo(Pair p2){
            return this.freq-p2.freq;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,1,1,2,2,3};
        int k = 2;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }else{
                mp.put(arr[i], 1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(var i : mp.keySet()){
            Pair p = new Pair(i, mp.get(i));
            pq.add(p);
            if(pq.size()>k) pq.remove();
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(pq.size()!=0){
            list.add(pq.remove().element);
        }
        Collections.reverse(list);
        System.out.println(list);

        int arr[] = new int[]
    }
}
