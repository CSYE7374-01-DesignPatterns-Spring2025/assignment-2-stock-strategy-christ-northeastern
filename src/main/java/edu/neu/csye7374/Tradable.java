/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.neu.csye7374;

/**
 *
 * @author christrodrigues
 */

public interface Tradable {

    /**
     * Place a bid to buy a stock
     * 
     * @param bid the bid value as a string
     */
    void setBid(String bid);

    /**
     * Return a metric indicating the measure of positive performance of this stock.
     * A large positive index means consider buying this well-performing stock,
     * and a large negative index means consider selling this poorly performing stock.
     * 
     * @return an integer representing the performance metric
     */
    int getMetric();
}
