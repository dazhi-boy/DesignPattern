package com.dazhi6.createObject.builder;

/**
 * 食物条目,获取名字，包装和价钱
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
