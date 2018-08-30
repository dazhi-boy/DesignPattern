package com.dazhi6.structuralMode.flyweight;

/**
 * Created by Administrator on 2018/8/21.
 */
public class FlyweightPattern {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String [] str){
        System.out.println("----- flyweight pattern start -----");

        for(int i=0; i < 20; ++i) {
            Circle circle =
                    (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        System.out.println("----- flyweight pattern start -----");
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
