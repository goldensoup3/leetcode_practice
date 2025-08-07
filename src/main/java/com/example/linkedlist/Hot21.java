package com.example.linkedlist;

/**
 * @author goldensoup3
 * @create 2025-08-07 12:09
 *
 * 合并两个有序链表
 */
public class Hot21 {

    /**
     * 递归
     */
    public Hot206.ListNode206 mergeSortedList(Hot206.ListNode206 l1, Hot206.ListNode206 l2) {

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeSortedList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeSortedList(l1, l2.next);
            return l2;
        }
    }

    /**
     * 迭代
     */
    public Hot206.ListNode206 mergeSortedList2(Hot206.ListNode206 l1, Hot206.ListNode206 l2) {
        Hot206.ListNode206 preHead = new Hot206().new ListNode206(-1, null);
        Hot206.ListNode206 cur = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return preHead.next;
    }
}
