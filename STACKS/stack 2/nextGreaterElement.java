import java.util.Stack;

public class nextGreaterElement {
    public static int[] nextGreater(int arr[]) {  //from backward
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        st.push(arr[n - 1]);
        res[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size()!=0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size()==0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }
    public static int[] nextGreater2(int arr[]){
         Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i=0;i<=arr.length-1;i++){
            int curr = arr[i];
            while(st.size()!= 0 && curr > arr[st.peek()] ){
                res[st.peek()] = curr;
                st.pop();
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        int res[] = nextGreater(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int res2[] = nextGreater2(arr);
         for (int i = 0; i < res2.length; i++) {
            if(res2[i]==0){
                res2[i]=-1;
            }
            System.out.print(res2[i] + " ");
        }
    }
}
