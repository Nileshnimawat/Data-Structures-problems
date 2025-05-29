package basicRecursion;
import java.util.Scanner;

public class powerPQfind {
    //given two numbers p and q find the value p and q using recurssive fuction.
    public static int power(int p, int q){
       
        //base case
        if(q==0) return 1;
        //reccursive work and self work
        
       return p*power(p, q-1);
     }
     //function  with better time and space complexity
     public static int betterPower(int p,int q){
        //base case
        if(q==0) return 1;
        int half = betterPower(p, q/2);
        if(q%2==0) return half*half;
        else return p*half*half;
        //reccursive work and self work
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the number : ");
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.close();
        System.out.println(power(n,q));
        System.out.println(betterPower(n, q)); 
     }
}
