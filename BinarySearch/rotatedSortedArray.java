public class rotatedSortedArray {
    public static int BinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target)
            {
                 return mid;
            }
            else if (arr[mid] < arr[end]){
                if((target>=mid)&&(target<=arr[end])){
                    start = mid+1;
                }
                else{
                    end=mid-1;
                }
            }
           else if (arr[mid] > arr[start]){
                if((target<=mid)&&(target>=arr[start])){
                    end = mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {3,4,4,5,6,1,2};
       int target = 5;
      System.out.println( BinarySearch(arr, target));
    }
}
