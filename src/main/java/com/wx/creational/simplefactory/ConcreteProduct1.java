package com.wx.creational.simplefactory;

/**
 * Created by 王兴
 * 2022/5/13 9:45
 *
 * 具体产品1
 */
public class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1");
    }
}
