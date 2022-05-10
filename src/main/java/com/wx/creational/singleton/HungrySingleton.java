package com.wx.creational.singleton;

/**
 * Created by 王兴
 * 2022/5/9 13:34
 *
 * 单例模式：饿汉式
 * 优点：简单实用，推荐使用
 * 缺点：不管用不用到这个实例，类加载的时候就完成了实例化，可能存在不被使用的情况，会造成内存空间的浪费
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
