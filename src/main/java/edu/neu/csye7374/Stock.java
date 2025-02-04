package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Tradable {
    private String name;
    private double price;
    private String description;
    private int metric;
    private StockStrategy strategy;

    protected List<Double> prevPrices = new ArrayList<>();

    public Stock(String name, double price, String description, StockStrategy strategy) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.strategy = strategy;
        init(price);
    }

    private void init(double price) {
        prevPrices.add(price);
    }

    public void setStrategy(StockStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyMarketStrategy() {
        if (strategy != null) {
            this.price = strategy.calculateNewPrice(this.price);
        }
    }

    // Fix the method signature to match the interface
    @Override
    public void setBid(String bid) {
        try {
            double bidValue = Double.parseDouble(bid);  // Convert String to double
            prevPrices.add(bidValue);
            applyMarketStrategy();
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid value: " + bid);
        }
    }

    @Override
    public int getMetric() {
        double mean = prevPrices.stream().mapToDouble(i -> i).average().orElse(0.0);
        double dev = 0.0;
        for (double num : prevPrices) {
            dev += mean - num;
        }
        dev = dev / prevPrices.size();
        this.metric = dev > 0.0 ? 1 : -1;
        return this.metric;
    }

    @Override
public String toString() {
    return "Stock [name=" + name + ", price=" + String.format("%.2f", price) + ", description=" + description + ", Metric: " + metric + "]";
}
}
