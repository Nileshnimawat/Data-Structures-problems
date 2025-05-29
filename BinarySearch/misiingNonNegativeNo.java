public class misiingNonNegativeNo {
    public static int BinarySearchmissing(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int missing = arr.length;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==mid){
                start=mid+1;
            }else{
                missing=mid;
                end=mid-1;
            }
    }return missing;
}
    public static void main(String[] args) {
       int arr[] = {0,1,2,3,10,60};
      System.out.println( BinarySearchmissing(arr));
    }
}
