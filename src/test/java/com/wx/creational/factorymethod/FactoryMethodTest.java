package com.wx.creational.factorymethod;

/**
 * Created by 王兴
 * 2022/5/13 10:44
 *
 * 工厂方法测试类
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        product1.show();

        Factory factory2 = new ConcreteFactory2();
        Product product2 = factory2.newProduct();
        product2.show();
    }
}
