public class intersectionFind {
  
 // Definition for singly-linked list.
  public class Node {
      int val;
      Node next;
     Node(int x) {
          val = x;
         next = null;
      }
  }
  
 //
public class Solution {
    public Node getIntersectionNode(Node headA, Node headB) {
        int sizeA = 0;
        int sizeB = 0;
        Node tempA = headA;
        Node tempB = headB;
        while(tempA!=null){
            sizeA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            sizeB++;
            tempB=tempB.next;
        }
        tempB=headB;
        tempA=headA;
     
        if(sizeA>sizeB){
            int n = sizeA-sizeB;
            for(int i=1;i<=n;i++){
                tempA=tempA.next;
            }
        }
        else {
            int n = sizeB-sizeA;
            for(int i=1;i<=n;i++){
                tempB =tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA =tempA.next;
            tempB =tempB.next;
        }
        return tempA;
    }
}
}
