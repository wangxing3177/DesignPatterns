package com.wx.creational.prototype;

import com.wx.creational.prototype.Prototype;
import com.wx.creational.prototype.Student;

/**
 * Created by 王兴
 * 2022/5/10 17:04
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student();
        Prototype prototype = new Prototype(student);


        Prototype prototype1 = (Prototype) prototype.clone();
        System.out.println(prototype == prototype1);//false
        //如果clone()方法实现的是浅克隆，结果为true，如果时clone()方法实现的是深克隆，结果为false
        System.out.println(prototype.getStudent() == prototype1.getStudent());


    }
}
