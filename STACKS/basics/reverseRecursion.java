package basics;
import java.util.Stack;

public class reverseRecursion {

    public static void Stackreverse(Stack<Integer> st,Stack<Integer> gt,int x){
        if(st.size()==0) {
            st.push(x);
            return;}
        System.out.println(st.peek());
       // gt.push(st.peek());
        int top = st.pop();
        Stackreverse(st, gt,x);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
         st.push(3);
        st.push(4);
         Stack <Integer> gt  = new Stack<>();
         int x=5;

        Stackreverse(st, gt,x);
        System.out.println(st);
    }
}
