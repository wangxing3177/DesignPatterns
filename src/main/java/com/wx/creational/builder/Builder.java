package com.wx.creational.builder;

/**
 * Created by 王兴
 * 2022/5/16 10:32
 *
 * 抽象建造者：包含创建产品各个子部件的抽象方法
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void builderPartA();
    public abstract void builderPartB();
    public abstract void builderPartC();

    public Product getResult() {
        return product;
    }


}
