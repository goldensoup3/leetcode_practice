package com.example.linkedlist;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author goldensoup3
 * @create 2025-04-16 16:15
 *
 * 环形链表
 */
public class Hot141 {

    /**
     * 快慢指针
     */
    public Boolean hasCycle(Hot106.ListNode106 head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        Hot106.ListNode106 slow = head;
        Hot106.ListNode106 fast = head.next;
        while (slow != fast) {
            if(fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    /**
     * HashSet
     */
    public Boolean hasCycle2(Hot106.ListNode106 head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        HashSet<Hot106.ListNode106> nodes = new HashSet<>();
        while(head.next != null) {
            if (!nodes.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
