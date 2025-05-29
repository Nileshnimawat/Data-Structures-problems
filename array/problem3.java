package array;
import java.util.*;
public class problem3 {
    //3. Array Reversal:Write a program to reverse the elements of an array
    public static int[] reversearr(int arr[]){
        int arr2[] = new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            arr2[j--] = arr[i];
        }
        return arr2;
    }
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println();
}
//creating reversing array without using the extra array .
public static void swap(int arr[] , int i, int j){
    int temp=0;
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

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
    //int ans[] = reversearr(arr);
    int i =0;
    int j= arr.length-1;
    while(i<j){
        swap(arr, i, j);
        i++;
        j--;
    }
    printLoop(arr);

}
}