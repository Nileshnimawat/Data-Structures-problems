package basicRecursion;
import java.util.Scanner;

public class countTHEnumber {
    //
    //wap to enter the number suppose 1234 add return 4 using recursion
    
    
    public static int sumOFnNumbers(int n){
       
        //base case
        if(n<=9&&n>=0) return 1;
        //reccursive work
        
       int count = sumOFnNumbers(n/10)+1;
        
        //self work
        return count;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(sumOFnNumbers(n)); 
     }
}
