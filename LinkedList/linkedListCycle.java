public class linkedListCycle {
    class ListNode {
           int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
            }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast!=null){
                if(head.next==null)return false;
                if(slow==null)return false;
                if(fast.next==null)return false;
                slow = slow.next;
                fast = fast.next.next;
                 if(slow==fast)return true;
            }
            return false;
        }
    }
}
