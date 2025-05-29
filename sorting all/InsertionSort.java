import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void InsertionSort(int[] arr){
        for(int i=1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        printArray(arr);
        System.out.println();
        InsertionSort(arr);
        System.out.println("Array after sorting: ");
        printArray(arr);

    }
}
