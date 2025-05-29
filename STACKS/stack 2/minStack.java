import java.util.*;
class minStack {
    public static class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public MinStack() {
       //constructor 
    }
    
    public void push(int val) {
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(val>min.peek()) min.push(min.peek());
            else min.push(val); 
        }
    }
    
    public void pop() {
        if(st.size()==0|| min.size()==0) return;
        st.pop();
        min.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
       return min.peek();
    }
}
public static void main(String[] args) {
    MinStack obj = new MinStack();
    obj.push(6);
    System.out.println(obj.top());
    System.out.println(obj.getMin());
}
}