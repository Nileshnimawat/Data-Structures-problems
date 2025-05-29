//import java.util.Comparator;
import java.util.PriorityQueue;

public class kthLargest {
     public static void main(String[] args) {
        int arr[] = {2,3,4,1,5,6,7};
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i < arr.length; i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.remove();
        }
        System.out.println(pq.peek());
    }
}
