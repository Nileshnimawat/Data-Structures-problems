import java.util.Scanner;
public class basics2 {
    static Scanner sc;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node creation(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = creation(root.left, val);
        }
        else{
            root.right = creation(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
//
    public static Node input(Node root) {
       int val = sc.nextInt();
         while (val != -1) {
        root = creation(root, val);
        val = sc.nextInt();
    }
    return root;
}

    public static void main(String[] args) {
         sc = new Scanner(System.in);
        Node root = null;
        root = input(root);
        inorder(root);
        
    }
}
