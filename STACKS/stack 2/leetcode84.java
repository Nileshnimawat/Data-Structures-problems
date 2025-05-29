import java.util.Stack;

public class leetcode84 {
     public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse[] = new int [n];
        int pse[] = new int [n];
        Stack<Integer> st = new Stack<>();
        nse[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            int curr = heights[i];
            while(st.size()!=0 && curr <= heights[st.peek()]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek(); 
            st.push(i);
        }
        while(st.size()!=0){
            st.pop();
        }

        pse[0]= -1;
        st.push(0);
          for(int i=1;i<=pse.length-1;i++){
              int curr = heights[i];
            while(st.size()!=0 && curr <= heights[st.peek()]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek(); 
            st.push(i);
        }
        while(st.size()!=0){
            st.pop();
        }
        int max = -1;
        for(int i=0;i<=n-1;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            max = Math.max(area,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {5,2,4,6,3,5};
        System.out.println(largestRectangleArea(arr));
    }
}
