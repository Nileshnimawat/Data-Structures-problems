public class findingNth {
    public static void display(Node head){  //printing loop
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthFromLast1(Node head,int index){
            Node temp = head;
            int size = 0;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            temp=head;
            int resize = (size-index)+1;
            for(int i=1;i<=resize-1;i++){
                temp=temp.next;
            }
            return temp;
          


        }
        public static Node nthFromLast(Node head,int index){
           // Node temp = head;
            Node low = head;
            Node high = head;
            for(int i=1;i<=index;i++){
                high=high.next;
            }
            while(high!=null){
                low=low.next;
                high=high.next;
            }
            return low;
        }
         public static Node nthFromLastDelete(Node head,int index){
           // Node temp = head;
            Node low = head;
            Node high = head;
            for(int i=1;i<=index;i++){
                high=high.next;
            }
            while(high.next!=null){
                low=low.next;
                high=high.next;
            }
            low.next=low.next.next;
            return head;
        }
        public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d= new Node(4);
            a.next=b;
            b.next=c;
            c.next=d;
            Node temp = nthFromLast(a,2);
            System.out.println(temp.data);
            Node temp1 = nthFromLast1(a,2);
            System.out.println(temp1.data);
            display(nthFromLastDelete(a, 2));


        }
    }

