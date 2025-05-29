import java.util.Scanner;

public class Traversal {
    static Scanner sc;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key) return true;
        else if(root.data > key) return search(root.left, key);
        else return search(root.right, key);
    }

    public static void main(String[] args) {
       sc = new Scanner(System.in);
       
       
    }
}
