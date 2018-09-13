package com.ly.design.creational.factory;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/13
 * @Description
 */
public class FactoryMethodDemo {

    public static void main(String[] args) {
        ConcreteCreator creator = new ConcreteCreator();
        ConcreteProduct product = creator.factory(ConcreteProduct.class);
        product.method1();
        product.method2();
    }
}
