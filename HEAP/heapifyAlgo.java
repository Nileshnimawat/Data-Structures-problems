public class heapifyAlgo {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void heapify(int i, int arr[], int n) {
        while (true) {
            int left = 2 * i;
            int right = 2 * i + 1;
            
            if (left >= n)
                break;
            
            if (right >= n) {
                if (arr[left] < arr[i]) {
                    swap(arr, i, left);
                }
                break;
            }
            
            if (arr[left] < arr[right]) {
                if (arr[left] < arr[i]) {
                    swap(arr, i, left);
                    i = left;
                } else break;
            } else {
                if (arr[right] < arr[i]) {
                    swap(arr, i, right);
                    i = right;
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 10, 2, 14, 11, 1, 4};
        display(arr);
        int n = arr.length;
        for (int i = n / 2; i >= 1; i--) {
            heapify(i, arr, n);
        }
        display(arr);
    }
}
