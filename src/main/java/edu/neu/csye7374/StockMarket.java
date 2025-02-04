package edu.neu.csye7374;

public class StockMarket {

    private static StockMarket instance;

    private StockMarket() {
        instance = null;
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    public static void demo() {
        System.out.println("\n============ Stock Market Strategy Pattern Demo ============\n");

        // Use Factory and Singleton patterns to create stocks
        Stock walmartStock = WalmartStockFactoryLazy.getInstance().getObject(100, new BullMarketStrategy());
        Stock wayfairStock = WayfairStockFactoryEager.getInstance().getObject(60, new BearMarketStrategy());

        // Applying Strategy Pattern
        System.out.println("Before applying strategies:");
        System.out.println(walmartStock);
        System.out.println(wayfairStock);

        walmartStock.applyMarketStrategy();
        wayfairStock.applyMarketStrategy();

        System.out.println("\nAfter applying strategies:");
        System.out.println(walmartStock);
        System.out.println(wayfairStock);

        System.out.println("\n============================================================\n");
    }
}
