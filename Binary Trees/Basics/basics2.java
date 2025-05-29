package Basics;
import java.util.*;
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
    public static class binaryTrees{
       static int val;
      public static Node binarytrees(){
        System.out.println("enter the no ");
         val = sc.nextInt();
        Node newNode = new Node(val);

        if(val ==-1 ) return null;

        System.out.println("enter for left "+val);
        newNode.left = binarytrees();
        System.out.println("enter for right "+val);
        newNode.right = binarytrees();
        return newNode;
    }
}
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTrees bt = new binaryTrees();
        Node root = bt.binarytrees();
        System.out.println(root.data);
    }
}
