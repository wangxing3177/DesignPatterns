package com.wx.creational.abstractfactory;

/**
 * Created by 王兴
 * 2022/5/13 11:03
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA newProductA() {
        System.out.println("工厂1生产");
        return new ConcreteProductA1();
    }

    @Override
    public ProductB newProductB() {
        System.out.println("工厂1生产");
        return new ConcreteProductB1();
    }
}
