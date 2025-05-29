package Traversals;
import java.util.LinkedList;
import java.util.Queue;

public class traversal {
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


        void preorder(Node root){ //preorder
            if(root==null)return;
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }


        void inorder(Node root){ //preorder
            if(root==null)return;
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }


        void postorder(Node root){ //preorder
            if(root==null)return;
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data+" ");
        }

    
        void levelOrder(Node root){ //levelorder
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
            int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binaryTrees bt = new binaryTrees();
            Node root = bt.binarytrees(arr);

            bt.preorder(root);
            System.out.println();

            bt.postorder(root);
            System.out.println();
            
            bt.inorder(root);
            System.out.println();

            bt.levelOrder(root);
            
        }
    
}
    

