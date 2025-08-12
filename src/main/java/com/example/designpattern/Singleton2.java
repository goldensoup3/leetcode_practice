package com.example.designpattern;

/**
 * @author goldensoup3
 * @create 2025-08-12 16:46
 *
 * double-check，线程安全
 */
public class Singleton2 {

    private static volatile Singleton2 instance;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
