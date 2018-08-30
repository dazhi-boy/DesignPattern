package com.dazhi6.createObject.prototype;

/**
 * 原型模式
 */
public class PrototypePattern {
    public static void main(String [] str){
        System.out.println("----- prototype pattern start -----");

        ShapeCache.loadCache();

        Shape clonedShape = null;
        try {
            clonedShape = (Shape) ShapeCache.getShape("1");
            System.out.println("Shape : " + clonedShape.getType());

            Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
            System.out.println("Shape : " + clonedShape2.getType());

            Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
            System.out.println("Shape : " + clonedShape3.getType());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("----- prototype pattern end -----");
    }
}
