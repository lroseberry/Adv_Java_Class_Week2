package com.mycompany.app;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * BasicStockService provides a concrete implementation of StockService interface
 *
 * @author Linda M Roseberry
 */

public class BasicStockService implements StockService {
	
	private double price = 163.50;
	Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    String currdate = sdf.format(date);
	
   @Override
   public StockQuote getQuote(String symbol) {
      return new StockQuote(currdate, price, symbol);
   }
}