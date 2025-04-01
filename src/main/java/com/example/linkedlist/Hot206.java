package com.example.linkedlist;

/**
 * @author goldensoup3
 * @create 2025-03-25 15:37
 *
 * 反转链表
 */
public class Hot206 {
    public class ListNode206 {
        int val;
        ListNode206 next;
        ListNode206() {}
        ListNode206(int val) { this.val = val; }
        ListNode206(int val, ListNode206 next) { this.val = val; this.next = next; }
    }

    public ListNode206 getReverse(ListNode206 head) {
        // 递归
        if (head == null || head.next == null) {
            return head;
        }
        ListNode206 newHead = getReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
