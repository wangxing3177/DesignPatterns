package com.wx.creational.simplefactory;

/**
 * Created by 王兴
 * 2022/5/13 10:00
 *
 * 简单工厂方法：用来生产具体产品
 */
public class SimpleFactory {

    public static Product makeProduct(CONST productConst) {
        switch (productConst) {
            case PRODUCT_A:
                return new ConcreteProduct1();
            case PRODUCT_B:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
