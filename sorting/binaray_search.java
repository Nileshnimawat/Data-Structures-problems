package sorting;
import java.util.Scanner;
import java.util.Arrays;
public class binaray_search {
    //find the index of entered element using the binaray search method
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    public static int binarySearch(int arr[],int key){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(key == arr[mid]){
                return mid;
            }else if(key > arr[mid]){
                i = mid+1;
            }else {
                j=mid-1;
            }
        } return-1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("write the arrays values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter the key value");
        int key = sc.nextInt();
        sc.close();
       // binarySearch(arr, key);
        System.out.println(binarySearch(arr, key));
       
    }
}
