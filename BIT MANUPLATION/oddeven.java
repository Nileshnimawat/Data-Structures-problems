//package BIT MANUPLATION;//

public class oddeven {
    public static void oddEven(int n){
        int bit=1;
        if((n & bit)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    //program for swap
    public static void swap(int a ,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        
    }
    //using bit manuplation to check wheter a mnumber is even or not
    public static void main(String[] args) {
        //check odd even using bit operator 
        System.out.println("enter the bit number ");
        
        swap(5, 6);
       
        

    }
}
