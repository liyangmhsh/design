package com.ly.design.creational.factory;

/**
 * @author li.yang.dz1
 * @Date created in 2018/9/13
 * @Description
 */
public class ConcreteCreator implements Creator {
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
