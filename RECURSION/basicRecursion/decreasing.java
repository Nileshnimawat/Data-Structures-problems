package basicRecursion;
import java.util.*;
public class decreasing {
    public static void decreasingOrder(int n){
        //base case
        if(n==1) {
            System.out.println("1");
            return;
        }
        //self work
        System.out.println(n);
        //recurence elation
        increasingOrder(n-1);
    }
    
    public static void increasingOrder(int n){
        //base case
        if(n==0) {
            return;
        }
        
        //recurence elation
        increasingOrder(n-1);
        //self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
      decreasingOrder(n);
      // increasingOrder(n);
    }
}
