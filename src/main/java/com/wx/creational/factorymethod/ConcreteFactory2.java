package com.wx.creational.factorymethod;

/**
 * Created by 王兴
 * 2022/5/13 10:42
 *
 * 具体工厂类2
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public Product newProduct() {
        return new ConcreteProduct2();
    }
}
