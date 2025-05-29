public class lowerBOund {
    public static int BinarySearchLowerBound(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid] < target) start = mid+1;
            else if (arr[mid] > target)  end = mid-1;
        }
        return start;
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,6,7,8,10};
       int target = 9;
      System.out.println(BinarySearchLowerBound(arr, target));
    }
}