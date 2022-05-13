package com.wx.creational.factorymethod;

/**
 * Created by 王兴
 * 2022/5/13 10:38
 *
 * 具体产品类1
 */
public class ConcreteProduct1 implements Product{
    @Override
    public void show() {
        System.out.println("具体产品1");
    }
}
