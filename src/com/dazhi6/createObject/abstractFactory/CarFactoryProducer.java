package com.dazhi6.abstractFactory;

/**
 * 工厂中的产品
 */
public class CarFactoryProducer {
    public static CarAbstractFactory getFactory(String choice){
        CarAbstractFactory carAbstractFactory = null;
        switch (choice){
            case "brand":
                carAbstractFactory = new BrandFactory();
                break;
            case "parts":
                carAbstractFactory = new PartsFactory();
                break;
            default:
                break;
        }
        return carAbstractFactory;
    }
}
