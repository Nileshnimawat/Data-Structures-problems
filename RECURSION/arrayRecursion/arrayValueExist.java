package arrayRecursion;
public class arrayValueExist {
    //given  an array find the value exist or not'
    public static boolean arrayTarget(int arr[],int index , int target){
        //base line 
        if(index>=arr.length) return false;
        //self work
        if(arr[index]==target) return true;  
        //recurssive function 
        return arrayTarget(arr, index+1, target);
    }
    //return indexes if x is present in the array.
     public static void arrayIndexTarget(int arr[],int index , int target){
        //base line 
        if(index>=arr.length){
          //  System.out.println("not found");
            return;
        }
        //self work
        if(arr[index]==target) {
            System.out.println(index);
        } 
        //recurssive function 
        arrayIndexTarget(arr, index+1, target);
    }
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,4 ,5};
        //boolean target = arrayTarget(arr, 0, 3);
        arrayIndexTarget(arr, 0, 4);
        /*if(target){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }*/
    }
}
