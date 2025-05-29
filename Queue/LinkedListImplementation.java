public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        Node head = null;
        Node tail = null;
        int size =0;

        void add(int val){
            Node temp = new Node(val);
            if(size==0){
               
                head = tail = temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        int remove(){
            int x = head.val;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            return head.val;
        }
        int size(){
            return size;
        }
        void display(){
            Node temp=head;;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}
