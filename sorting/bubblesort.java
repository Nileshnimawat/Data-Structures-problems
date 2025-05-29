package sorting;
import java.util.*;
public class bubblesort {
    public static void swap(int arr[],int i,int j){
        int temp=0;
        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
 }
    public static void bubbleSortIncreasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            //int swaps=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                  swap(arr, j, j+1);
                  //swaps++;
                }
                if(arr[j]==arr[j+1]){
                  swap(arr, j, j+1);
                }
               
            }//if (swaps==0) break;
        }
    }
    public static void bubbleSortDecreasing(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swaps=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                  swap(arr, j, j+1);
                  swaps++;
                }if(arr[j]==arr[j+1]){
                  swap(arr, j, j+1);
                }
                
            }if (swaps==0) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("write the arrays values");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }sc.close();
        bubbleSortIncreasing(arr);

        printLoop(arr);

    }
}