import java.util.Stack;

public class slidingWindow {
     public static int[] maxSlidingWindow(int[] nums, int k) {
        Stack <Integer> st = new Stack<>();
        int n = nums.length;
        int ans[] = new int[n-k+1];
         int r=0;
        st.push(n-1);
        int nge[] = new int [n];
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--){
            int curr = nums[i];
            while(st.size()>0 && curr >= nums[st.peek()]) st.pop();
            if(st.size()==0) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
       }
         int j=0;
       for(int i=0;i<n-k+1;i++){
         
          if(j>=i+k) j = i;
           int max = nums[j];
           while(j<i+k){
               max = nums[j];
               j = nge[j];
           }
           ans[r++]=max;
       }
       return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int ans [] = maxSlidingWindow(nums,3);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
