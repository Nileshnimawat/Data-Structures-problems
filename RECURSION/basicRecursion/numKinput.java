package basicRecursion;
import java.util.Scanner;

public class numKinput {
    //given a number num and a value k . print k multiples of sum.
    // num = 12 k=5
    // 12 24 36 48 60 
    // by using the recursion 
    
    public static void numInputt(int num , int k){
        //base case 
        if(k==1) 
        {
            System.out.println(num); 
            return;
        }
        //recurssive call
        numInputt(num , k-1);
       
        //self work
         System.out.println(num*k);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        numInputt(num, k);
    }
}

