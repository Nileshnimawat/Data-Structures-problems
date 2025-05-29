import java.util.*;
public class stockSpan {
    public static int[] stocksSpan(int stocks[]){
        int n = stocks.length;
        int span[] = new int[n];
        Stack <Integer> st = new Stack<>();
        span[0]=1;
        st.push(0);
        

        for(int i=1;i<=stocks.length-1;i++){
            int currStocks = stocks[i];
            while(st.size()!=0 && currStocks > stocks[st.peek()]){
                st.pop();
            }
            if(st.size()==0) span[i]=1;
            else{
                span[i] = i-st.peek();
            }
            st.push(i);

        }
        return span;


    } 
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        int res[] = stocksSpan(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
