public class deletion {
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

    public static Node Isucessor(Node root){
        Node temp = root;
        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    public static Node delete(Node root,int key){
        if(root == null) return root;
        if(root.data > key) {
         root.left = delete(root.left, key);
        }
        else if(root.data < key) {
        root.right = delete(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){
             return null;
            }

            else if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            else {
                Node IS = Isucessor(root.right);
                root.data = IS.data;
                root.right = delete(root.right, key);
            }
        }
        return root;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Node root = null;
       for(int i = 0; i < arr.length; i++){
        root = creation(root, arr[i]);
       }
       inorder(root);

       System.out.println();
       delete(root, 2);

       inorder(root);
    }
}
