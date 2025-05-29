public class BST_maxHeap {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(16);
        Node d = new Node(1);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(20);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        
    }
}
