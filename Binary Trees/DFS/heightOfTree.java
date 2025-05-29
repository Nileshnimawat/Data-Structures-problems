package DFS;
import java.util.LinkedList;
import java.util.*;

public class heightOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static int count(Node root){
        if(root == null) return 0;
        int left = count(root.left);
        int right = count(root.right);
        return left+right+1;
    }

    public static int sum(Node root){
        if(root==null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        return left+right+root.val;
    }

    public static int height(Node root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }

    public static void display(Node root){
        if (root == null ) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            Node temp = q.remove();
            System.out.print(temp.val+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(sum(root));

    }
}
