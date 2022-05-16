package com.wx.creational.builder;

/**
 * Created by 王兴
 * 2022/5/16 10:20
 *
 * 产品角色：包含多个组成部件的复杂对象
 *
 */
public class Product {

    private String partA;
    private String partB;
    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("partA:" + partA + "\n" + "partB:" + partB + "\n" + "partC:" + partC);
    }
}
