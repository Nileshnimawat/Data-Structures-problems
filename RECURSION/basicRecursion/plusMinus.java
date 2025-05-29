package basicRecursion;
import java.util.Scanner;

public class plusMinus {
    //given  a number n find the sum of natural numbers till n with alternate sign.
    //example : n = 5
    // 1-2+3-4+5 = 3
    public static int evenOddMinusPlus(int n){
        //base case
        if(n==0) {return n;}
        //recursive work
        if(n%2==0){
            return evenOddMinusPlus(n-1)-n;
        }
        else return evenOddMinusPlus(n-1)+n;
        //self work
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
    System.out.println(evenOddMinusPlus(n));
      
    }
}
