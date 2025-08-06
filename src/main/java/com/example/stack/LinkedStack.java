package com.example.stack;

/**
 * @author goldensoup3
 * @create 2025-08-06 19:01
 *
 * 栈的链表实现
 */
public class LinkedStack<T> {

    private static class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    private int capacity;

    public LinkedStack() {
        this.top = null;
        this.capacity = 0;
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        capacity++;
    }

    public Boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        return (T) top.data;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        T tmp = (T) top.data;
        top = top.next;
        capacity--;
        return tmp;
    }
}
