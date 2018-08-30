package com.dazhi6.createObject.builder;

/**
 * 创造者模式
 */
public class BuilderPattern {
    public static void main(String [] str){
        System.out.println("----- builder pattern start -----");
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("----- veg meal -----");
        vegMeal.showItems();
        System.out.println("cost price"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n----- non veg meal -----");
        nonVegMeal.showItems();
        System.out.println("cost price"+nonVegMeal.getCost());

        System.out.println("----- builder pattern end -----");
    }
}
