package arrayRecursion;
public class arrayRecursion {
    public static void arrayPrint(int arr[],int index){
        //base line 
        if(index==arr.length) return;
        //self work
        System.out.println(arr[index]);
        //recurssive function
        arrayPrint(arr, index+1);
    }

    //max number 

    
    public static int maxNumberRecursion(int arr[],int index){
        //base line 
        if(index==arr.length-1) return arr[index];
        //recurssive function
        int small = maxNumberRecursion(arr, index+1);
        //self work
        return Math.max(arr[index],small);
    }

    //sum using recursion 


    public static int sumOfAllNumbers(int arr[],int index){
         //base line 
        if(index==arr.length) return 0;
        //recurssive function
        int small = sumOfAllNumbers(arr, index+1); 
        //self work
        return small+arr[index];
    }
    public static void main(String[] args) {
        int arr[] = {4 ,5 ,6 ,7};
       // arrayPrint(arr, 0);
      //System.out.println(maxNumberRecursion(arr, 0));
      System.out.println(sumOfAllNumbers(arr, 0));
    }
}
