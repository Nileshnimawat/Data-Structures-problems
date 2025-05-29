import java.util.ArrayList;
import java.util.PriorityQueue;

public class kSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                list.add(pq.peek());
                pq.remove();
            }
        }
        while(pq.size()!=0){
            list.add(pq.remove());
        }
        System.out.println(list);
    }
}
