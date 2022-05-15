package com.wx.creational.abstractfactory;

/**
 * Created by 王兴
 * 2022/5/13 11:11
 */
public class AbstaractFactoryTest {

    public static void main(String[] args) {
//        AbstractFactory factory1 = new ConcreteFactory1();
//        ProductA productA = factory1.newProductA();
//        ProductB productB = factory1.newProductB();
//        productA.showA();
//        productB.showB();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA = factory2.newProductA();
        productA.showA();
        ProductB productB = factory2.newProductB();
        productB.showB();
    }
}
