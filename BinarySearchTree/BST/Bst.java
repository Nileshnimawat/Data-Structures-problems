package BST;
import java.util.Scanner;

public class Bst {
    static Scanner sc;
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static Node input(Node root){
        int n = sc.nextInt();
        while(n!=-1){
            root = insert(root, n);
            n = sc.nextInt();
        }
        return root;
    }

    public static Node insert(Node root,int val){
        if(root == null) {
            System.out.println("enter the val for root : ");
            root = new Node(val);
            return root;
        }
        if(root.val > val){
            System.out.println("enter the Node : ");
            root.left = insert(root.left, val);
        }
        else{
            System.out.println("enter the Node ");
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean searching(Node root, int key){
        if(root == null) return false;
        if(root.val == key) return true;
        else if(root.val > key) {
            return searching(root.left, key);
        }
        else{
            return searching(root.right, key);
        }
    }

    public static Node deletion(Node root , int val){
        if(root == null) return root;
        if(root.val > val){
            root.left = deletion(root.left, val);
        }
        else if(root.val < val){
            root.right = deletion(root.right, val);
        }

        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if (root.left == null){
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            else{
                Node is = successor(root.right);
                root.val = is.val;
               root.right =  deletion(root.right, val);
            }
        }
        return root;
    }

    public static Node successor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("creating BST : ");
        Node root = null;
        root = input(root);
        inorder(root);
        System.out.println(searching(root, 7));
        deletion(root, 3);
        inorder(root);
    }
}
