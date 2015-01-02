import java.util.*;
import java.lang.*;


public class Reorder_List {
    public void reorderList(ListNode head) {
        int n = countList(head);
        ListNode half = breakList(head, n/2);
        half = reverseList(half);
        head = combine(head,half);
    }

    public ListNode combine(ListNode a,ListNode b) {
        if(a == null) return b;
        if(b == null) return a;
        ListNode output = new ListNode(1);// just use for the head,the val is useless
        ListNode tmpa;
        ListNode tmpb;
        ListNode tail = output;
        while (a != null && b != null) {
            tmpa = a.next;
            tmpb = b.next;
            a.next = null;
            b.next = null;
            tail.next = a;
            a.next = b;
            tail = b;
            a = tmpa;
            b = tmpb;
        }
        if(a == null) tail.next = b;
        else if(b == null) tail.next = a;

        return output.next;

    }

    public ListNode breakList(ListNode a,int n) {
		if(n == 0) return null;
        ListNode breakPoint;
        for(int i = 0; i < n-1; i++) {
            a = a.next;
        }
        breakPoint = a.next;
        a.next = null;
        return breakPoint;
    }

    public int countList(ListNode a) {
        int count = 0;
        while(a != null) {
            count++;
            a = a.next;
        }
        return count;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode rev = null;
        ListNode tmp = head;

        while(head != null) {
            head = head.next;
            tmp.next = rev;
            rev = tmp;
            tmp = head;
        }
        return rev;
    }

    public void printList(ListNode head) {

        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}