import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
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
    
        void levelOrder(Node root, ArrayList<Integer> arr ,List<List<Integer>> matrix){ //levelorder
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            Node temp = q.remove();
            arr.add(temp.data);
            int size = q.size();
            
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }

        }
        matrix.add(arr);
    }
}


        public static void main(String[] args) {
            int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binaryTrees bt = new binaryTrees();
            ArrayList<Integer> arr2 = new ArrayList<>();
            List<List<Integer>> matrix = new ArrayList<>();
            Node root = bt.binarytrees(arr);


            bt.levelOrder(root,arr2,matrix);
            System.out.println(arr2);
            
          // matrix.add(arr2);
            System.out.println(matrix);
            
        }
    
}
    

