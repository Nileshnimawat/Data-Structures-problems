package array;
import java.util.*;
public class problem5 {
    //Write a program to calculate and print the sum of all even numbers in an array.
    public static int sumOfEven(int arr[]){
        int sum= 0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        
        }return sum;
       
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println("enter the array");
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }sc.close();
    System.out.println("sum of even : "+sumOfEven(arr));
}
}