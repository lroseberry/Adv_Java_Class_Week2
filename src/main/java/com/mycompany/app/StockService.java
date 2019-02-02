package com.mycompany.app;

/**
 * An interface for StockService
 *
 * @author Linda M Roseberry
 */

public interface StockService {
	/**
	* Return the price for a share of stock for the given symbol
	* @param symbol the stock symbol of the company you want a quote for.
	* e.g. APPL for APPLE
	* @return a <CODE>StockQuote </CODE> instance
	*/
	StockQuote getQuote(String symbol);
	
}