public class basic {
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


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node root = null;
       for(int i = 0; i < arr.length; i++){
        root = creation(root, arr[i]);
       }
       inorder(root);
    }
}
