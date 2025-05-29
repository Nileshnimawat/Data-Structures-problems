import java.util.Stack;

public class queueUsingStack {
    
    class MyQueue {
    Stack<Integer> st = new Stack<>();
     Stack<Integer> gt = new Stack<>();
     int size =0;


    public MyQueue() {
        //useless constuctor
    }
    
    public void push(int x) {
        if(st.size()==0) st.push(x);
        else{
            while(st.size()!=0) gt.push(st.pop());
        st.push(x);
        while(gt.size()!=0) st.push(gt.pop());
        size++;
    }
    }
    
    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
       if(st.size()==0) return true;
       else return false;
    }
    }
    
}
