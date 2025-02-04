package edu.neu.csye7374;

public class WalmartStockFactoryLazy extends AbstractFactory {

    private WalmartStockFactoryLazy() {}

    private static AbstractFactory instance = null;

    public static AbstractFactory getInstance() {
        if (instance == null) {
            synchronized (WalmartStockFactoryLazy.class) {
                if (instance == null) {
                    instance = new WalmartStockFactoryLazy();
                }
            }
        }
        return instance;
    }

    @Override
    public Stock getObject(double price, StockStrategy strategy) {
        return new WalmartStock(price, strategy);
    }
}
