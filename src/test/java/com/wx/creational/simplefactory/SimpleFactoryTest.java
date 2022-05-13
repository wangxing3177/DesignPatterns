package com.wx.creational.simplefactory;

/**
 * Created by 王兴
 * 2022/5/13 10:27
 *
 * 简单工厂测试类
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Product product1 = SimpleFactory.makeProduct(CONST.PRODUCT_A);
        Product product2 = SimpleFactory.makeProduct(CONST.PRODUCT_B);
        product1.show();
        product2.show();
    }
}
