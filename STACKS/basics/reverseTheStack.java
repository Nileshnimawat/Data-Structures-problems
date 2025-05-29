package basics;
import java.util.Stack;

    public class reverseTheStack {

        public static void setAtBottom(Stack<Integer> st,int top){

            if(st.size()==0) {
                st.push(top);
                return;
            }
            int x = st.pop();
           setAtBottom(st,top);
            st.push(x);

        }

    public static void Stackreverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top =  st.pop();
        Stackreverse(st);
        setAtBottom(st,top);
        //st.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
         st.push(3);
        st.push(4);
         Stack <Integer> gt  = new Stack<>();
        // int x=5;

        Stackreverse(st);
        System.out.println(st);
    }
}

