package com.ly.design.creational.abstractFactory;

/**
 * 抽象工厂模式
 * @author li.yang.dz1
 * @Date created in 2018/9/14
 * @Description
 */
public interface AbstractFactory {

    ProductA factoryA();

    ProductB factoryB();

}
