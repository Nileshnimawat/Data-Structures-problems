public class last_occurence {
    public static int BinarySearch(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                if(mid<arr.length && arr[mid]==arr[mid+1]){ 
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            else if (arr[mid] < target) start = mid+1;
            else if (arr[mid] > target)  end = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5,5,5,6};
       int target = 5;
      System.out.println(BinarySearch(arr, target));
    }
}
