import java.util.LinkedList;
import java.util.Queue;

public class successor {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static Node successorOfNext(Node root,int key){
          Queue<Node> q = new LinkedList<>();
        if(root == null) return null;
        q.add(root);
        while(q.size()!=0){
             Node temp = q.remove();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!= null ) q.add(temp.right);
            if(temp.val == key) break;  
        }
        return q.peek();
    }
}


