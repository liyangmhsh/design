package com.ly.design.creational.factory;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/13
 * @Description
 */
public class ConcreteProduct implements Product {
    @Override
    public void method1() {
        System.out.println("this is method1");
    }

    @Override
    public void method2() {
        System.out.println("this is method2");
    }
}
