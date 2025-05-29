package DFS;
public class maxPath {
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
        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.left.left.left = new Node(7);
        }
    }
    

