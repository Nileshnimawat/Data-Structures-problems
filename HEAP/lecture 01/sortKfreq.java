import java.util.*;

class sortKfreq {
    public static class Pair implements Comparable<Pair>{
        int element;
        int freq;
        
        Pair(int element, int freq){
            this.element = element;
            this.freq = freq;
        }
        
        @Override
        public int compareTo(Pair p2){
            if (this.freq == p2.freq) {
                return p2.element-this.element; // Sort by element value in decreasing order
            }
            return this.freq - p2.freq; // Sort by frequency in increasing order
        }
    }
    
    public int[] frequencySort(int[] arr) {
        int index = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        for(var entry : mp.entrySet()){
            Pair p = new Pair(entry.getKey(), entry.getValue());
            pq.add(p);
        }

        int arr2[] = new int[arr.length];
        
        while(!pq.isEmpty()){
            Pair temp = pq.remove();
            int ele = temp.element;
            int freq = temp.freq;
            for(int i = 0; i < freq; i++){
                arr2[index++] = ele;
            }
        }
        return arr2;
    }
}

