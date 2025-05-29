package array;
import java.util.Scanner;

public class problem8 {
    //Write a program to rotate the elements of an array to the right by a given number of positions.
    //example k =2 1 2 3 4 5 
    // roatate  =  4 5 1  2  3
    // it means n-k to n 1 2 3 
    // 0 to n-k-1 for 4 5 
    public static void rotatearr(int arr[],int target){
        int n = arr.length;
        target = target % n;
        int arr2[] = new int[n];
        int j=0;
        for(int i=n-target;i<n;i++){
            arr2[j++]=arr[i]; 
                }
        for(int i=0;i<n-target;i++){
            arr2[j++]=arr[i];
        }    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+"  ");
        }  System.out.println();

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
    rotatearr(arr, target);
}
}
