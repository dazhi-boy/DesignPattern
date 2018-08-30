package com.dazhi6.abstractFactory;

/**
 * 品牌工厂
 */
public class BrandFactory extends CarAbstractFactory {
    @Override
    public Brand getBrand(String brand) {
        Brand brandType = null;
        switch (brand){
            case "benz":
                brandType = new BrandBenz();
                break;
            case "bmw":
                brandType = new BrandBmw();
                break;
            case "ford":
                brandType = new BrandFord();
                break;
            default:
                break;
        }
        return brandType;
    }

    @Override
    public Parts getParts(String parts) {
        return null;
    }
}
