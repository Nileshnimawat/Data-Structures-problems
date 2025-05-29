package Basics;
public class basics {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static class binaryTrees{
        static int idx = -1;
      public static Node binarytrees(int arr[]){
        idx++;
        if(arr[idx] == -1) return null;
        Node newNode = new Node(arr[idx]);
        newNode.left = binarytrees(arr);
        newNode.right = binarytrees(arr);

        return newNode;
    }
}
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTrees bt = new binaryTrees();
        Node root = bt.binarytrees(arr);
        System.out.println(root.data);
    }
}
