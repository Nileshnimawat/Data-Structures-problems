package array;
import java.util.Scanner;
public class problem6 {
    //Write a program that counts and prints the number of occurrences of a specific element in an array.
    public static int occurrence(int arr[], int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
        }return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println("enter the array");
   
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("enter the target");
    int target = sc.nextInt();
    sc.close();
    System.out.println("occurence : "+occurrence(arr, target));
    
}
}