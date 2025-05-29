package basicRecursion;
import java.util.*;
public class sumOfnumber {
    //wap to enter the number suppose 1234 add 1+2+3+4=10 and print the 10
     public static int sumOFnNumbers(int n){
        //base case
        if(n<=9&&n>=0) return n;
        //reccursive work
        int star = sumOFnNumbers(n/10);
        //self work
        return n%10+star;
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(sumOFnNumbers(n)); 
     }
    }