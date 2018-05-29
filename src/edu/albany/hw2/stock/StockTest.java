package edu.albany.hw2.stock;

import java.text.DecimalFormat;
import edu.albany.hw2.stock.Stock.Symbol;

/*
 * Tester class for Stock. Creates two stock objects
 * and tests the getChangePercent() function
 */
public class StockTest {

	public static void main(String args[]) {
		
		//first Stock object
		Stock microsoft = new Stock(Symbol.MSFT);
		microsoft.setPreviousClosingPrice(58.9);
		microsoft.setCurrentPrice(59);
		//format decimal
		DecimalFormat format = new DecimalFormat("#0.0000");
		System.out.println("Stock: " + microsoft.getName() +", Previous Closing Price: " + microsoft.getPreviousClosingPrice() +
				", Current Price: " + microsoft.getCurrentPrice() + ", Percent change: " + format.format(microsoft.getChangePercent()));
		
		//second Stock object
		Stock google = new Stock(Symbol.GOOGL);
		google.setPreviousClosingPrice(25);
		google.setCurrentPrice(253);
		System.out.println("Stock: " + google.getName() +", Previous Closing Price: " + google.getPreviousClosingPrice() +
				", Current Price: " + google.getCurrentPrice() + ", Percent change: " + format.format(google.getChangePercent()));
	}
}
