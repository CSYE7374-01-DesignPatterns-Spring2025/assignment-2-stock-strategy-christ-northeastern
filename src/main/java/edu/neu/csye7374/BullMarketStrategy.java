/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye7374;

/**
 *
 * @author christrodrigues
 */


public class BullMarketStrategy implements StockStrategy {
    @Override
    public double calculateNewPrice(double currentPrice) {
        return currentPrice * 1.15; // Increase price by 15%
    }
}

