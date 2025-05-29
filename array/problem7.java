package array;
import java.util.Arrays;
import java.util.Scanner;

public class problem7 {
    //Write a program to find and print the second largest element in an array.
    //here are the two methodfs first using the sorting algo 
    //second one is the bruteforce method.
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-2;i++){
            max=Math.max(max, arr[i]);
        }
        return max;
    }
    public static int maxElement(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
                max=Math.max(max, arr[i]);
        }
        return max;
    }
    public static int bruteForce(int arr[]){
        int max = maxElement(arr);
        for(int i=0;i<arr.length;i++){
            if (max==arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax= maxElement(arr);
        return secondmax;
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
    sc.close();
    System.out.println(bruteForce(arr));
}
}