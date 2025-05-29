public class upperBound {
    
        public static int BinarySearchUpperBound(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            int mid;
            while(start<=end){
                mid = (start+end)/2;
                if((arr[mid]==target)&&(arr[mid]!=arr[mid+1])){
                    return arr[mid+1];
                }
                else if (arr[mid] < target) start = mid+1;
                else if (arr[mid] > target)  end = mid-1;
            }
            return start;
        }
    
        public static void main(String[] args) {
           int arr[] = {1,2,2,6,7};
           int target = 2;
          System.out.println(BinarySearchUpperBound(arr, target));
        }
    }
