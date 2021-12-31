package classList;

import java.util.Objects;

public class StockItem 
{
	// declare variables
	private String stockNumber, name;
	private double price;
	private int totalStock = 0;
	private static double salesTax = 17.5; 
	
	// constructor
	public StockItem(String stockNumIn, String nameIn, double priceIn)
	{
		stockNumber = stockNumIn;
		name = nameIn;
		price = priceIn;
	}
	
	// class methods
	
	public void setPrice(double priceIn)
	{
		price = priceIn;
	}
	
	public void increaseTotalStock(int stockIn)
	{
		totalStock += stockIn;
	}
	
	public String getStockNumber()
	{
		return stockNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getTotalStock()
	{
		return totalStock;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double calculateTotalPrice()
	{
		return totalStock * price;
	}
	
	public static double getSalesTax()
	{
		return salesTax;
	}
	
	public static void setSalesTax(double salesTaxIn)
	{
		salesTax = salesTaxIn;
	}
	
	@Override
	public String toString()
	{
		return "Stock Number: " + stockNumber + " name: " + name + " Price: £" + price + " Total Stock: " + totalStock;
	}
	
	@Override
	public int hashCode()
	{
		return name.hashCode();
	}

	@Override
	public boolean equals(Object objIn)
	{
		if (this == objIn)
			return true;
		else if (objIn == null)
			return false;
		else if (objIn instanceof StockItem)
		{
			StockItem itemIn = (StockItem) objIn;
			if (name.equals(itemIn.getName()))
				return true;
		}
		return false;
	}
	
	
}