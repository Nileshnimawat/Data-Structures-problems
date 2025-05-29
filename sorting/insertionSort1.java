import java.util.*;
public class insertionSort1 {
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


    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int j=i;
            while(i>=0 && arr[j]<arr[j-1]){
                swap(arr, j-1, j);
                j--;
                
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
        insertionSort(arr);
        printLoop(arr);

    }

}