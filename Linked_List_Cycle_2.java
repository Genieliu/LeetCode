
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //if(head == null) return null;
        ListNode lPoint = isCycle(head);
        if(lPoint == null) return null;
        else {
            ListNode a = head;     //because the a is define in block, so we can't return a
            while(lPoint != a) {
                lPoint = lPoint.next;
                a = a.next;
            }
        }
        return lPoint;
    }

    public ListNode isCycle(ListNode head) {
        //if(head == null) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null) {
            p1 = p1.next;
            if(p2.next == null) return null;
            p2 = p2.next.next;
            if(p1 == p2) return p1;
        }
        return null;

    }
}