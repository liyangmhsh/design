package com.ly.design.creational.abstractFactory;

import com.ly.design.creational.abstractFactory.impl.ConcreteFactory1;
import com.ly.design.creational.abstractFactory.impl.ConcreteFactory2;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/14
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory concreteFactory1 = new ConcreteFactory1();
        AbstractFactory concreteFactory2 = new ConcreteFactory2();
        concreteFactory1.factoryA().method1();
        concreteFactory1.factoryA().method2();
        concreteFactory1.factoryB().method1();
        concreteFactory1.factoryB().method2();
        concreteFactory2.factoryA().method1();
        concreteFactory2.factoryA().method2();
        concreteFactory2.factoryB().method1();
        concreteFactory2.factoryB().method2();
    }

}
