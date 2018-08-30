package com.dazhi6.abstractFactory;

/**
 * Created by Administrator on 2018/8/9.
 */
public class PartsFactory extends CarAbstractFactory {
    @Override
    public Brand getBrand(String brand) {
        return null;
    }

    @Override
    public Parts getParts(String parts) {
        Parts partsType = null;
        switch (parts){
            case "tyre":
                partsType = new PartsTyre();
                break;
            case "engine":
                partsType = new PartsEngine();
                break;
            case "ligthing":
                partsType = new PartsLighting();
                break;
            default:
                break;
        }
        return partsType;
    }
}
