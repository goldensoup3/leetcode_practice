package com.example.linkedlist;

/**
 * @author goldensoup3
 * @create 2025-03-25 12:10
 *
 * 相交链表
 */
public class Hot106 {
    public class ListNode106 {
        int val;
        ListNode106 next;
        ListNode106(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode106 getIntersectionNode(ListNode106 headA, ListNode106 headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode106 ptrA = headA;
        ListNode106 ptrB = headB;
        while (ptrA != ptrB) {
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
    }
}
