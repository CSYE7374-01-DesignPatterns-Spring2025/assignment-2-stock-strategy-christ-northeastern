/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.csye7374;

/**
 *
 * @author christrodrigues
 */

public class BearMarketStrategy implements StockStrategy {
    @Override
    public double calculateNewPrice(double currentPrice) {
        return currentPrice * 0.95; // Decrease price by 5%
    }
}

