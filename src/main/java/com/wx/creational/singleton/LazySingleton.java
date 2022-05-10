package com.wx.creational.singleton;

/**
 * Created by 王兴
 *
 * 单例模式：懒汉式
 * 该类加载的时候没有创建实例，只有在第一次调用getInstance()方法时才会创建这个单例
 * 优点：解决了饿汉式的缺点，保证只有在使用到这个单例时才会被创建。
 * 缺点：1.加了synchronized的后，保证了线程的安全性，但是因为需要同步，会影响性能。
 *      2.synchronized锁的是getInstance()方法，如果有业务代码也会被锁，锁的范围太大。
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
