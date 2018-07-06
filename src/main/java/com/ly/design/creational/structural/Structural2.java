package com.ly.design.creational.structural;

/**
 * 饿汉式单例
 * Created by li.yang.dz1 on 2018/7/4.
 */
public class Structural2 {
    private static Structural2 instance = null;

    private Structural2() {
    }

    public synchronized static Structural2 getInstance() {
        if (instance == null) {
            instance = new Structural2();
        }
        return instance;
    }
}
