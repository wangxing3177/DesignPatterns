package com.wx.creational.builder;

/**
 * Created by 王兴
 * 2022/5/16 11:46
 *
 * 指挥者角色：调用建造者中的方法完成复杂对象的创建
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
        return builder.getResult();
    }
}
