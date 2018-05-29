package edu.albany.hw2.stock;

/*
 * Class that stores an enum consisting of a stock symbol and a name,
 * a previousClosingPrice, and the current price. The class also has a method to
 * calculate the percent change of the current price from the previous closing price
 */
public class Stock {

	private Symbol symbol;
	private double previousClosingPrice;
	private double currentPrice;
	
	//Constuctor class that takes a Symbol and sets the symbol field
	public Stock(Symbol symbol) {
		this.symbol = symbol;
	}
	
	//Accessor method for symbol
	public Symbol getSymbol() {
		return symbol;
	}
	
	//Accessor method for name
	public String getName() {
		return symbol.getName();
	}
	
	//Accessor method for previousClosingPrice
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	
	//Accessor method for currentPrice
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	//Mutator method for previousClosingPrice
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	
	//mutator method for currentPrice
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	//method to get the percent change of the currentPrice from the previousClosingPrice
	//returns 0 if previousClosingPrice is 0 because of division by 0
	public double getChangePercent() {
		if(previousClosingPrice != 0) {
			return (100 * (currentPrice - previousClosingPrice)/ previousClosingPrice);
		} else {
			return  0;
		}
	}
	
	//enum of stock symbols and a the name of the stock as a field
	public enum Symbol {
		//constants of enum type
		MSFT("Microsoft"),
		AAPL("Apple"),
		GOOGL("Google"),
		AMZN("Amazon"),
		T("AT&T");
		
		//instance field
		private String name;
		
		//Constuctor
		Symbol(String name) {
			this.name = name;
		}
		
		//Accessor for name
		public String getName() {
			return name;
		}
	}
}
