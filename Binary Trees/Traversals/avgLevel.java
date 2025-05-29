import java.util.*;
public class avgLevel {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static List<Double> averageOfLevels(Node root) {
        List<Double> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        while(q.size()!=0){
            int levelSize = q.size();
            double sum = 0;
            for(int i=0; i < levelSize; i++){
                Node temp = q.remove();
                sum+=temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!= null ) q.add(temp.right);
            }
            Double avg = sum/levelSize;
            result.add(avg);
        }
        return result;
    }
}
