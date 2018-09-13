package com.ly.design.creational.factory;

/**
 * 抽象工厂
 * @author li.yang.dz1
 * @Date created in 2018/9/13
 * @Description
 */
public interface Creator {
    /**
     * 工厂方法,创建一个产品对象，其输入参数类型可以自行设置
     *
     * @param c
     * @param <T>
     * @return
     */
    <T extends Product> T factory(Class<T> c);
}
