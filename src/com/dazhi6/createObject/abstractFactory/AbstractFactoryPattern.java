package com.dazhi6.abstractFactory;

/**
 * 抽象工厂模式
 */
public class AbstractFactoryPattern {
    public static void main(String [] str){
        System.out.println("----- abstract factory pattern start -----");
        CarAbstractFactory brandFactory = CarFactoryProducer.getFactory("brand");
        Brand benz = brandFactory.getBrand("benz");
        benz.printBrand();
        Brand bmw = brandFactory.getBrand("bmw");
        bmw.printBrand();
        Brand ford = brandFactory.getBrand("ford");
        ford.printBrand();

        CarAbstractFactory partsFactory = CarFactoryProducer.getFactory("parts");
        Parts tyre = partsFactory.getParts("tyre");
        tyre.printParts();
        Parts engine = partsFactory.getParts("engine");
        engine.printParts();
        Parts ligthing = partsFactory.getParts("ligthing");
        ligthing.printParts();
        System.out.println("----- abstract factory pattern end -----");
    }
}
