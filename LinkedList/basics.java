public class basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;
        int length = 0;
        void display(){  //printing loop
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
              int size(){  //printing loop
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
           return count;
        }
        void addAtEnd(int num){
            Node temp  = new Node(num);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
            length++;
        }
         void addAtStart(int num){
            Node temp  = new Node(num);
            if(head==null){
                head = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
            length++;
        }
        void addAtIndex(int index , int num){
            Node temp = head;
            Node t = new Node(num);
            if(index == size()){
                addAtEnd(num);
            }
            else if(index == 0){
                addAtStart(num);
            }
            for(int i = 1;i<=index-1;i++){
               temp=temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            length++;
        }
        int getElement(int index){
            Node temp = head;
            for(int i=1;i<=index;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int index){
            Node temp = head;
            if(index==0){
                head = head.next;
            }
            for(int i=1;i<=index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            length--;
        }
    }
 
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtEnd(5);
         ll.addAtEnd(10);
          ll.addAtEnd(10);
          ll.addAtStart(6);   
          ll.addAtIndex(2, 200); 
            ll.addAtIndex(0, 700); 
        ll.display();
        System.out.println();
       System.out.println( ll.getElement(3));
       ll.deleteAtIndex(3);
       ll.display();
    }
}
