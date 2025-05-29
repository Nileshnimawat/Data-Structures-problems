package sorting;
import java.util.Scanner;

public class insertionsort {
    //insertion shot \
    public static void printLoop(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }System.out.println();
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = temp;
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
        insertionSort(arr);
        printLoop(arr);

    }
}
