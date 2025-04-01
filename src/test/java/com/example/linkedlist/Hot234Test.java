package com.example.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author goldensoup3
 * @create 2025-03-25 21:11
 */
public class Hot234Test {

    @Test
    public void test() {
        Hot206 hot206 = new Hot206();
        Hot206.ListNode206 a5 = hot206.new ListNode206(1, null);
        Hot206.ListNode206 a4 = hot206.new ListNode206(3, a5);
        Hot206.ListNode206 a3 = hot206.new ListNode206(3, a4);
        Hot206.ListNode206 a2 = hot206.new ListNode206(2, a3);
        Hot206.ListNode206 a1 = hot206.new ListNode206(1, a2);

        Hot206.ListNode206 head = a1;
        Hot234 demo = new Hot234();
        boolean result = demo.isPalindrome2(head);
        System.out.println("isPalindrome: " + result);
    }
}