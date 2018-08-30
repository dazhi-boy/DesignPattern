package com.dazhi6.behavior.command;

/**
 * Created by Administrator on 2018/8/23.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
