package com.ly.design.creational.structural;

/**
 * 懒汉式单例
 * Created by li.yang.dz1 on 2018/7/4.
 */
public class Structural1 {
    private static Structural1 instance = new Structural1();

    private Structural1() {
    }

    public static Structural1 getInstance() {
        return instance;
    }

}
