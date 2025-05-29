import java.util.*;

public class boundaryTreversal {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }

    public static Node levelBuildTree(int arr[],int val){
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int i = 1;
        int j = 2;
        while(q.size()!=0){
            Node temp  = q.remove();
            Node l;
            Node r;
            if(arr[i]!=Integer.MIN_VALUE) l = new Node(arr[i]);
            else l = null;
            if(arr[j]!=Integer.MIN_VALUE) r = new Node(arr[j]);
            else r = null;

            i+=2;
            j+=2;
        }
        return root;
    }

    public static int level(Node root){
        if(root == null) return 0;
        return Math.max(level(root.left),level(root.right))+1;
    }

    public static void levelOrder(Node root , int curr , int level){
        if(root == null) return;
        if(curr == level){
            System.out.print(root.data+" ");
            return;
        }
        levelOrder(root.left, curr+1, level);
        levelOrder(root, curr+1, level);
    }

    public static void nthLevel(Node root){
        int level = level(root);
        for(int i = 1; i <= level; i++){
            levelOrder(root, 1, i);
            System.out.println();
        }
    }

    public static void leftBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        System.out.print(root.data+" ");
        leftBoundary(root.left);
        if(root.left == null) leftBoundary(root.right);
    }

    public static void leafNode(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) System.out.print(root.data+" ");
        leafNode(root.left);
        leafNode(root.right);
    }
    public static void rightBoundary(Node root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        rightBoundary(root.right);
        if(root.right == null) rightBoundary(root.left);
        System.out.print(root.data+" ");
    }

    public static void boundaryTraversal(Node root){
        leftBoundary(root);
        leafNode(root);
        rightBoundary(root);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
    }
}
