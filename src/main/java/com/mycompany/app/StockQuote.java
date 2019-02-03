package com.mycompany.app;

/**
 * A class that stores information about a stock quote
 *
 * @author Linda M Roseberry
 */

public class StockQuote {  
	private String currDate;
    private String symbol;
    private double price;

	/**
     * Constructs a new StockQuote instance
	 * @param currDate date this price is being retrieved
     * @param price price of the stock 
     * @param symbol symbol for the company issuing the stock
     */
    public StockQuote(String currDate, double price, String symbol) {     
		this.currDate = currDate;
        this.price = price;
        this.symbol = symbol;
    }
    /**
     * @return the current date used to get the stock price
     */
    public String getCurrDate() {
        return currDate;
    }

    /**
     * @return the symbol that represents the company issuing this stock
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the price of one share of this stock
     */
    public double getPrice() {
        return price;
    }
}
