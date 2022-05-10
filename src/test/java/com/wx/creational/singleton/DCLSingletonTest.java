package com.wx.creational.singleton;

/**
 * Created by 王兴
 * 2022/5/10 16:09
 */
public class DCLSingletonTest {

    public static void main(String[] args) {
        DCLSingleton dclSingleton1 = DCLSingleton.getInstance();
        DCLSingleton dclSingleton2 = DCLSingleton.getInstance();
        System.out.println(dclSingleton1 == dclSingleton2);
    }
}
