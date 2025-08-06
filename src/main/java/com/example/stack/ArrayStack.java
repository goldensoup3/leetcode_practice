package com.example.stack;

/**
 * @author goldensoup3
 * @create 2025-08-06 18:34
 *
 * 栈的数组实现
 */
public class ArrayStack<T> {

    private Object[] elements;

    private int top;

    private int capacity;

    /**
     * 初始化栈
     */
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new RuntimeException("stack is full.");
        }
        elements[++top] = item;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        return (T) elements[top];
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty.");
        }
        return (T) elements[top--];
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Integer size() {
        return top + 1;
    }
}
