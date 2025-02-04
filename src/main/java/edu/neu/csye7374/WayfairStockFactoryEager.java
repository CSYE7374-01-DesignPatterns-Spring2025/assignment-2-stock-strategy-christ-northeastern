package edu.neu.csye7374;

public class WayfairStockFactoryEager extends AbstractFactory {

    private static final WayfairStockFactoryEager instance = new WayfairStockFactoryEager();

    private WayfairStockFactoryEager() {}

    public static WayfairStockFactoryEager getInstance() {
        return instance;
    }

    @Override
    public Stock getObject(double price, StockStrategy strategy) {
        return new WayfairStock(price, strategy);
    }
}
