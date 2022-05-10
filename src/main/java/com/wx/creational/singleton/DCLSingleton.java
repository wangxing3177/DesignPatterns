package com.wx.creational.singleton;

/**
 * Created by 王兴
 * 2022/5/7 17:23
 * 单例模式：DCL(double check lock)式
 */
public class DCLSingleton {

    /**
     * volatile一定要加，解决指令重排序问题
     *
     */
    private static volatile DCLSingleton dclSingleton;

    private DCLSingleton() { }

    public static DCLSingleton getInstance() {
        /*
        * 省略业务代码
        * */
        //第一次检查是为了减少线程等待获取synchronized锁，提高效率
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                //第二次检查是为了避免declSingleton多次被实例化
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }

        return dclSingleton;
    }
}
