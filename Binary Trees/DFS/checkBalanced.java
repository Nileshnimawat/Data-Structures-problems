package DFS;
import javax.swing.tree.TreeNode;

public class checkBalanced {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

     public int max(Node root,int max[]){
        if(root == null) return 0;
        int left = Math.max(0,max(root.left,max));
          int right = Math.max(0,max(root.right,max));

          max[0] = Math.max(max[0],left+right+root.val);

          return Math.max(left,right)+root.val;
    }
    public int maxPathSum(Node root) {
         int max[] = new int[1];
         max[0] = Integer.MIN_VALUE;
        max(root,max);
        return max[0];
    }

    public static class Info{
        boolean bool;
        int height;
        Info(boolean bool,int height){
            this.bool = bool;
            this.height = height;
        }
    }

    public static int height(Node root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }

    public static boolean BalancedTree(Node root){
        if(root == null) return true;
        boolean left = BalancedTree(root.left);
        int lh = height(root.left);
        boolean right = BalancedTree(root.right);
        int rh = height(root.right);
        boolean curr;
        if(Math.abs(lh-rh)<=1){
            curr = true;
        }
        else {
            curr = false;
        }

        if((left && right && curr)==true) return true;
        else return false;
    }

    public static Info BalancedTree2(Node root){
        if(root == null) return new Info(true, 0);

        Info left = BalancedTree2(root.left);
        Info right = BalancedTree2(root.right);

        int h = Math.max(left.height, right.height)+1;

        boolean ans = Math.abs(left.height-right.height)<=1;

        if(left.bool && right.bool && ans){
            return new Info(true, h);
        }
        else return new Info(false, h);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        System.out.println(BalancedTree2(root).bool);

    }
}
