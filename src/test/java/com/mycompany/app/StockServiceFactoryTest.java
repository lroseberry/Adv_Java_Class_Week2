package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Calendar;

/**
 * JUnit tests for the StockServiceFactory class
 *
 * @author Linda M Roseberry
 */
public class StockServiceFactoryTest {

    /**
     * Verifies that the return value is an instance of the specified class
     */
    @Test
    public void testGetStockServicePositive() {
        assertTrue("The value returned from getStockService is an instance of StockService interface",StockServiceFactory.createStockService("BASIC") instanceof StockService);
    }

    /**
     * Verifies that the return value is not an instance of the specified class
     */
    @Test
    public void testGetStockServiceNegative() {
        assertFalse("The value returned from getStockService is an instance of Calendar class",StockServiceFactory.createStockService("BASIC") instanceof Calendar);
    }
}