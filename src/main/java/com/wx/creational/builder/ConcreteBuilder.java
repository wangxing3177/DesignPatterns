package com.wx.creational.builder;

/**
 * Created by 王兴
 * 2022/5/16 10:36
 *
 * 具体建造类：实现了抽象建造类的生产产品的方法
 */
public class ConcreteBuilder extends Builder {
    @Override
    public void builderPartA() {
        product.setPartA("建造PartA");
    }

    @Override
    public void builderPartB() {
        product.setPartB("建造PartB");
    }

    @Override
    public void builderPartC() {
        product.setPartC("建造PartC");
    }
}
