package com.mycompany.app;

/**
 * A factory class for StockService
 *
 * @author Linda M Roseberry
 */
public class StockServiceFactory {
	
	   public StockServiceFactory() {
    }

	
   public static StockService createStockService(String type){
	   
      if(type.equalsIgnoreCase("BASIC")){
         return new BasicStockService();
      }
	  
      return null;
   }
}