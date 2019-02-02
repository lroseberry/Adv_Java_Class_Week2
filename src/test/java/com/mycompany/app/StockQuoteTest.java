package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the StockQuote class
 *
 * @author Linda M Roseberry
 */
 
public class StockQuoteTest {
   
	private String currDate;
    private String symbol;
    private double price;

    @Before
    public void setUp() {
		currDate = "20190202";
        symbol = "APPL";
        price = 163.50;
    }
/**
     * Verifies that the correct date is returned
     */
    @Test
    public void testGetCurrDatePositive() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
        assertTrue("Value returned from getCurrDate() equals expected string",stockQuote.getCurrDate().equals(currDate));
    }

    /**
     * Verifies that the current date returned is not equal to the expected result
     */
    @Test
    public void testGetCurrDateNegative() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
		String expected = "20190201";
        assertFalse("Value returned from getCurrDate() is not equal expected result",stockQuote.getCurrDate().equals(expected));
    }

/**
     * Verifies that the correct symbol is returned
     */
    @Test
    public void testGetSymbolPositive() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
        assertTrue("Value returned from getSymbol() equals expected string",stockQuote.getSymbol().equals(symbol));
    }

    /**
     * Verifies that the symbol returned is not equal to the expected result
     */
    @Test
    public void testGetSymbolNegative() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
		String expected = "IBM";
        assertFalse("Value returned from getSymbol() is not equal expected result",stockQuote.getSymbol().equals(expected));
    }

    /**
     * Verifies that the correct stock price is returned
     */    
	@Test
    public void testGetPricePositive() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
        assertTrue("Value returned from getPrice() equals the expected value",stockQuote.getPrice() == price);
    }

    /**
     * Verifies that an stock price is returned is not equal to the expected result
     */
    @Test
    public void testGetPriceNegative() {
		StockQuote stockQuote = new StockQuote(currDate, price, symbol);
		double expected = 164.50;
        assertFalse("Value returned from getPrice() is not equal to the expected result",stockQuote.getPrice() == expected);
    }

}
