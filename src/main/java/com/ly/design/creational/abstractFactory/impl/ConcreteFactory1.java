package com.ly.design.creational.abstractFactory.impl;

import com.ly.design.creational.abstractFactory.AbstractFactory;
import com.ly.design.creational.abstractFactory.ProductA;
import com.ly.design.creational.abstractFactory.ProductB;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/14
 * @Description
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
