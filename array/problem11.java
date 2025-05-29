package array;
import java.util.Scanner;

public class problem11 {
    //Write a program to calculate and print the sum of positive and negative numbers separately in an array.
    public static void sumAndDiff(int arr[]){
        int negative=0;
        int positive= 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative+=arr[i];
            }
            else{
                positive+=arr[i];
            }

        }System.out.println("the negative sum : "+negative);
        System.out.println("the posstive sum : "+positive);

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println("enter the array");
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }sc.close();
    sumAndDiff(arr);
}
}