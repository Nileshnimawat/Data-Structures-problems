package basicRecursion;
import java.util.Scanner;
public class factorial {
    public static int factorialOrder(int n){
        //base case
        if(n==1) {
            return 1;
        }
       
        //recurence elation
        return n * factorialOrder(n-1);
        
    }
    
    public static int sumOrder(int n){
        //base case
        if(n==1) {
            return 1;
        }
         //self work
        int i = sumOrder(n-1);
        //recurence elation
        return n + i;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
    System.out.println("the factorial total : "+factorialOrder(n));
    System.out.println("the sum of order : "+sumOrder(n));
      
    }
}
