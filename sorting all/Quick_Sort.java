import java.util.*;

public class Quick_Sort {

    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while(i < j){
            while(arr[i] <= pivot && i < end) i++;
            while(arr[j] > pivot && j > start) j--;
            if(i<j)swap(arr, i, j);
        }
        swap(arr, start, j);
        return j;
    }

    public static void QuickSort(int[] arr, int start, int end){
        if(start >= end) return;
        int pivotIndex = partition(arr, start, end);
        QuickSort(arr, start, pivotIndex);
        QuickSort(arr, pivotIndex+1, end);
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
        QuickSort(arr,0,n-1);
        System.out.println("Array after sorting: ");
        printArray(arr);

    }
}