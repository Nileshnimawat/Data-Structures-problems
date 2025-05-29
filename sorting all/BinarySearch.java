import java.util.*;

public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements or size of Array : ");
        int size = sc.nextInt();
        System.out.println("enter the elements in sorted increaing order : ");
        int arr[] = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be Searched : ");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);
        if(index != -1){
            System.out.println("the index of the element : "+index);
        }else{
            System.out.println("there is no element that exists");
        }
    }
}
