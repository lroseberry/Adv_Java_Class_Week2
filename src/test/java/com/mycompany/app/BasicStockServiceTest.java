package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the BasicStockService 
 *
 * @author Linda M Roseberry
 */
public class BasicStockServiceTest {
	private BasicStockService basicStockService;
	private String symbol;

    @Before
    public void setup() {  
		basicStockService = (BasicStockService) StockServiceFactory.createStockService("BASIC");
		symbol = "APPL";
    }

	/**
     * Verify the return value has the correct symbol
     */
    @Test
    public final void testGetQuotePositive() {
		String expected = "APPL";
        assertTrue("The returned string is correct",basicStockService.getQuote(symbol).getSymbol().equals(symbol));
    }

    /**
     * Verify the return value does not match the correct symbol
     */
    @Test
    public final void testGetQuoteNegative() {
		String expected = "IBM";
        assertFalse("The returned string is correct", basicStockService.getQuote(symbol).getSymbol().equals(expected));
    }
	
}
