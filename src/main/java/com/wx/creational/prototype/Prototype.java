package com.wx.creational.prototype;

import java.io.*;

/**
 * Created by 王兴
 * 2022/5/10 17:02
 *
 * 原型模式
 */
public class Prototype implements Cloneable,Serializable{

    private static final long serialVersionUID = 7354600991282152660L;
    private Student student;

    public Prototype(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
    /*
    @Override
    public Object clone() throws CloneNotSupportedException {
        //浅克隆
        return (Prototype)super.clone();
    }*/

    @Override
    public Object clone() throws  CloneNotSupportedException {
        //深克隆
        try {
            //写入当前对象的二进制流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //读出二进制流产生的新对象
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object newObject = objectInputStream.readObject();
            return newObject;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return super.clone();
    }
}
