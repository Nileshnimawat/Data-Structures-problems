package array;
import java.util.Scanner;
public class problem4 {
    //Write a program that searches for a specific element in an array and prints its index if found, or -1 if not found.
    public static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println("enter the array");
   
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("enter the target");
    int target = sc.nextInt();
    sc.close();
    int ans = linearsearch(arr, target);
    if (ans>0){
        System.out.println(ans+" : true");
    } 
    else System.out.println(ans);
    }
}
