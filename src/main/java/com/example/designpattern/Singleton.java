package com.example.designpattern;

/**
 * @author goldensoup3
 * @create 2025-08-12 16:41
 *
 * 懒汉式单例，线程不安全
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
