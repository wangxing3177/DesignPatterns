package com.wx.creational.abstractfactory;

/**
 * Created by 王兴
 * 2022/5/13 11:09
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public ProductA newProductA() {
        System.out.println("工厂2生产");
        return new ConcreteProductA2();
    }

    @Override
    public ProductB newProductB() {
        System.out.println("工厂2生产");
        return new ConcreteProductB2();
    }
}
