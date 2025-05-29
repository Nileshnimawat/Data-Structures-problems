package Basics;
import java.util.*;
public class ownImplmentation {
    static Scanner sc;
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    //
    public static class binaryTrees{
        static int idx =-1;
        public static Node binarytrees(int arr[]){
            idx++;
            if(arr[idx] == -1) return null;
            Node newNode = new Node(arr[idx]);
            newNode.left = binarytrees(arr);
            newNode.right = binarytrees(arr);
    
            return newNode;
        }
        //
        public static Node addNodes(){
            int n = sc.nextInt();
            Node root = new Node(n);
            if(n==-1) return null;
            root.left = addNodes();
            root.right = addNodes();

            return root;
        }

        //traversal of roots using bfs level-order
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(q.size()!=0){
                Node temp = q.remove();
                if(temp == null){
                    System.out.println();
                    if(q.size()!=0) q.add(null);
                }
                else{
                System.out.print(temp.data);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            }
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTrees bt = new binaryTrees();
        Node temp = bt.binarytrees(arr);
        bt.levelOrder(temp);
    }
}
