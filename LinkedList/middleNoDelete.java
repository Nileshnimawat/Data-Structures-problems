public class middleNoDelete {
     //Definition for singly-linked list.
 public static class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
 }
 // 2nd one at even time
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next.next!=null && fast.next.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
         Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d= new Node(4);
            a.next=b;
            b.next=c;
            c.next=d;
        Node temp = middleNode(a);
        System.out.println(temp.data);
    }

}
