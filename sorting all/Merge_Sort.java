import java.util.*;

public class Merge_Sort {

    public static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int start, int mid, int end){
        ArrayList<Integer> list = new ArrayList<>();
        int low = start;
        int high = mid+1;

        while(low <= mid && high <= end){
            if(arr[low] <= arr[high]) list.add(arr[low++]);
            else list.add(arr[high++]);    
        }

        while(low <= mid) list.add(arr[low++]);
        while(high <= end) list.add(arr[high++]);
    
        for(int i=start; i <= end; i++){
            arr[i] = list.get(i-start);
        }
    }

    public static void MergeSort(int[] arr, int start, int end){
        if(start >= end) return;
        int mid = ( start + end ) / 2;
        MergeSort(arr, start, mid);
        MergeSort(arr, mid+1, end);
        merge(arr, start,mid, end);
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
        MergeSort(arr,0,n-1);
        System.out.println("Array after sorting: ");
        printArray(arr);

    }
}

