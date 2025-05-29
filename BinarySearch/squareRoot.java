public class squareRoot {
    public static int BinarySearchSquareRoot(int n){
        int start = 0;
        int end = n;
        int mid,ans=-1;;
        while(start<=end){
            mid = (start+end)/2;
            if(mid*mid==n) return mid;
            else if (mid*mid>n) end = mid-1;
            else if (mid*mid <n ){
                ans=mid;
                start = mid+1;
        }
        
    }return ans;
}
    public static void main(String[] args) {
       
      System.out.println( BinarySearchSquareRoot(17));
    
}
}