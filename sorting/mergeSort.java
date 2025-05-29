import java.util.*;
public class mergeSort {
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
 }

 //function for merge sort 
 public static void mergeSort(int arr[],int start,int end){
    if(start>=end)return;
    int mid= (start+end)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size ");
    int n = sc.nextInt();
    int arr[]= new int[n];
    System.out.print("enter the array element ");
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    sc.close();
    mergeSort(arr,0,arr.length);
    printLoop(arr);
}
}