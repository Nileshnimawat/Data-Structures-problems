
import java.util.*;
public class selectionSort1 {
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
//


    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i;j<arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                swap(arr, min, i);
            }
        }
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
        selectionSort(arr);
        printLoop(arr);

    }
}
