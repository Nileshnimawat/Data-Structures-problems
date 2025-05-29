package basics;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack <Integer> st  = new Stack<>();
        st.push(1);
        st.push(2);
         st.push(3);
        st.push(4);

         Stack <Integer> gt  = new Stack<>();
         while(st.size()>0){
            gt.push(st.peek());
            st.pop();
         }
         System.out.println(gt);
         Stack <Integer> rt  = new Stack<>();
         while(gt.size()>0){
            rt.push(gt.peek());
            gt.pop();
         }
         System.out.println(rt);

          while(rt.size()>0){
            st.push(rt.peek());
            rt.pop();
         }
         System.out.println(st);

    }
}
