public class mountainArray {
    public static int BinarySearchMountainArray(int arr[]){
        int start = 1;
        int end = arr.length-2;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if((arr[mid]>arr[mid-1]) && (arr[mid] < arr[mid+1]) )
            {
                start = mid+1;
            }
            else if ((arr[mid]>arr[mid+1]) && (arr[mid] < arr[mid-1]) ) 
            {
                end = mid-1;
            }
            else{ 
                return mid;
            }
        
      
        }return -1;
    }
    public static void main(String[] args) {
       int arr[] = {1,3,5,4,2};
     
      System.out.println( BinarySearchMountainArray(arr));
    }
}
