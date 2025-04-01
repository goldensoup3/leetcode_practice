package com.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author goldensoup3
 * @create 2025-03-25 17:32
 */
public class Hot206Test {

    @Test
    public void testRecursion() {
        Hot206 hot206 = new Hot206();
        Hot206.ListNode206 a4 = hot206.new ListNode206(4, null);
        Hot206.ListNode206 a3 = hot206.new ListNode206(3, a4);
        Hot206.ListNode206 a2 = hot206.new ListNode206(2, a3);
        Hot206.ListNode206 a1 = hot206.new ListNode206(1, a2);

        Hot206.ListNode206 head = a1;
        System.out.println("origin:");
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        Hot206.ListNode206 newHead = hot206.getReverse(a1);
        System.out.println("reverse:");
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}