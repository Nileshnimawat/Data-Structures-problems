package array;
import java.util.Scanner;
public class problem1 {
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elemnts");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array numbers");
        for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    } sc.close();
        System.out.println(sum(arr));
    }
    
}