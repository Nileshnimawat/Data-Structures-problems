package DFS;
import java.util.LinkedList;
import java.util.Queue;

public class diameterOfTree {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static class Info{
        int diameter;
        int height;
        Info(int diameter,int height){
            this.diameter = diameter;
            this.height = height;
        }
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
        System.out.println();
    }

    public static int height(Node root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }

    public static Info diameter2(Node root){
        if(root==null) return new Info(0, 0);

        Info leftDia = diameter2(root.left);
        Info rightDia = diameter2(root.right);

        int centre = (leftDia.height+rightDia.height)+1;

        int height = Math.max(leftDia.height,rightDia.height)+1;

        int dia = Math.max(centre,Math.max(leftDia.diameter, rightDia.diameter));

        return new Info(dia, height);
    }

    public static int diameter(Node root){
        if(root == null) return 0;
        int left = diameter(root.left);
        int leftHeight = height(root.left);
        int right = diameter(root.right);
        int rightHeight = height(root.right);

        int centerRoot = leftHeight+1+rightHeight;

        return Math.max(left,Math.max(right, centerRoot));
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.left.left = new Node(7);

        levelOrder(root);

        System.out.println(diameter2(root).diameter);

         

    }
}
