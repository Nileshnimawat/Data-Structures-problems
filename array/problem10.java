package array;
import java.util.Arrays;
import java.util.Scanner;
public class problem10 {
    //Write a program to check if an array is a palindrome (reads the same forwards and backwards).
    //easy ques the reverse of an array is equals to the array
    public static void reversearr(int arr[],int i,int j){
       
        int temp=0;
         temp = arr[i];
         arr[i]= arr[j];
         arr[j] =temp;
        
    }
    public static int[] reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            reversearr(arr, i, j);
            j--;
            i++;
        }
        return arr;
        
}
public static void printLoop(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }System.out.println();
}
public static boolean checkpalindrome(int arr[], int ans[]) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != ans[i]) {
            return false;
        }
    }
    return true;

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
sc.close();
int ans[]= reverse(arr);
printLoop(ans);
int originalArrayCopy[] = Arrays.copyOf(arr, arr.length);
boolean check = checkpalindrome(originalArrayCopy, ans);
        if (check) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
}
}
