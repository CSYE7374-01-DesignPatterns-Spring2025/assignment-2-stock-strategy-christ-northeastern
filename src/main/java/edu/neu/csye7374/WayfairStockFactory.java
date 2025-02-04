package edu.neu.csye7374;

public class WayfairStockFactory extends AbstractFactory {

    @Override
    public Stock getObject(double price, StockStrategy strategy) {
        return new WayfairStock(price, strategy);
    }
}
