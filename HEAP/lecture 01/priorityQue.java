import java.util.*;
public class priorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> Pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(2);
        pq.add(1);
        pq.add(4);
        System.out.println(pq);
        Pq.add(2);
        Pq.add(1);
        Pq.add(4);
        System.out.println(Pq);
        
    }
}
