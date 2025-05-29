import java.util.Scanner;

public class Heap_Sort {
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapify(int [] arr, int size, int i){
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if(left <= size && arr[largest] < arr[left]){
            largest = left;
        }

        if(right <= size && arr[largest] < arr[right]){
            largest = right;
        }

        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, size, largest);
        }
    }

    public static void heapSort(int [] arr, int size){
        for(int i = size / 2; i > 0; i--){
            heapify(arr, size, i);
        }

        for(int i = size; i > 1; i--){
            swap(arr, i, 1);
            heapify(arr, i - 1, 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; 

        System.out.println("Enter the elements of the array: ");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        printArray(arr);

        heapSort(arr, n);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }
}
