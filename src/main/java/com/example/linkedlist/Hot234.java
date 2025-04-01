package com.example.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * @author goldensoup3
 * @create 2025-03-25 20:47
 *
 * 回文链表
 */
public class Hot234 {

    private Hot206.ListNode206 temp;

    /**
     * 链表元素存放到 ArrayList
     */
    public boolean isPalindrome(Hot206.ListNode206 head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Hot206.ListNode206> nodes = new ArrayList<>();
        int count = 0;
        while (head != null) {
            nodes.add(head);
            head = head.next;
            count++;
        }
        for (int i = 0; i < count / 2; i++) {
            if (nodes.get(i).val != nodes.get(count - 1 - i).val) {
                return false;
            }
        }
        return true;
    }

    /**
     * 递归
     */
    public boolean isPalindrome2(Hot206.ListNode206 head) {
        if (head == null || head.next == null) {
            return true;
        }
        temp = head;
        return check(head);
    }

    private boolean check(Hot206.ListNode206 cur) {
        if (cur != null) {
            if (!check(cur.next)) {
                return false;
            }
            if (cur.val != temp.val) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
