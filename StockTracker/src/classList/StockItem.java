package classList;

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
}