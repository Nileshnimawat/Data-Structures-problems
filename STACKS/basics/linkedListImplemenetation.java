package basics;
public class linkedListImplemenetation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class llstack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int peek(){
            return head.data;

        }
        int pop(){
            int top = head.data;
            head = head.next;
            size--;
            return top;
          
        }
        int size(){
            return size;
        }
        void reversedisplay(Node h){
            if(h==null)return;
            reversedisplay(h.next);
            System.out.print(h.data+" ");
        }
        void display(){
            reversedisplay(head);
            System.out.println();
        }

    }
    public static void main(String[] args) {
        llstack st = new llstack();
        st.push(1);
        st.display();//1
        st.push(2);
        st.display();//1,2
        st.push(3);
        st.display();//1,2,3
        st.push(4);
        st.display();//1,2,3,4

        //
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.size());
        //System.out.println(st.capacity());
    }
}
