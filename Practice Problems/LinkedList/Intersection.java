public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode a=headA;
        ListNode b=headB;
        while(a!=b){
            a=a.next;
            b=b.next;    
        }
        return a;
    }
}