public class twinSum {

 // Definition for singly-linked list.
  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode after = null;
       ListNode curr = head;
       while(curr!=null){
           after = curr.next;
           curr.next=prev;
           prev=curr;
           curr=after;
       }
       return prev;
   }
   public int pairSum(ListNode head) {
       int max = Integer.MIN_VALUE;
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next!=null && fast.next.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       ListNode temp = reverseList(slow.next);
       slow.next=temp;
       ListNode p1 = head;
       ListNode p2 = slow.next;
       int sum = 0;
       while(p2!=null){
           sum = p1.val+p2.val;
           if(sum > max){
               max = sum;
           }
           p1=p1.next;
           p2=p2.next;
       }
       return max;
   }

   }

}
