package com.ly.design.creational.abstractFactory.impl;

import com.ly.design.creational.abstractFactory.ProductB;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/14
 * @Description
 */
public class ProductB1 implements ProductB {
    @Override
    public void method1() {
        System.out.println(this.getClass().getName()+" : method1");
    }

    @Override
    public void method2() {
        System.out.println(this.getClass().getName()+" : method2");
    }
}
