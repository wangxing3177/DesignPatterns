package com.wx.creational.factorymethod;

/**
 * Created by 王兴
 * 2022/5/13 10:41
 *
 * 具体工厂类1
 */
public class ConcreteFactory1 implements Factory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct1();
    }
}
