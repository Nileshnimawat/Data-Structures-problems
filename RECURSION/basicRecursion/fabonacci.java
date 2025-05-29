package basicRecursion;
//import java
import java.util.Scanner;
public class fabonacci {
    public static int fabonaCCI(int n){
        //base case
        if(n==1||n==0) {
            return n;
        }
         //self work
        int i = fabonaCCI(n-1)+fabonaCCI(n-2);
        //recurence elation
        return i;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(fabonaCCI(n));
    }
}
