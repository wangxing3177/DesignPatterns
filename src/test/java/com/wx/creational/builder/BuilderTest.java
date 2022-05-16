package com.wx.creational.builder;

/**
 * Created by 王兴
 * 2022/5/16 12:15
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
