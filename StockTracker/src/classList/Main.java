package classList;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		// create scanner keyboard objects
		Scanner keyboard = new Scanner(System.in);
		Scanner keyboardString = new Scanner(System.in);
		
		// create array list of stock item objects
		ArrayList<StockItem>StockList = new ArrayList<>();
		
		// declare variables
		String tempNumber, tempName;
		double tempPrice;
		
		StockItem.setSalesTax(10);
		
		// input item details
		System.out.print("Enter the stock number: ");
		tempNumber = keyboardString.nextLine();
		System.out.print("Enter the name of the item: ");
		tempName = keyboardString.nextLine();
		System.out.print("Enter the price of the item: ");
		tempPrice = keyboard.nextDouble();
		
		// Create a new item of stock using the values that were entered by the user
		StockList.add(new StockItem(tempNumber, tempName, tempPrice));
		
		// Increase the total number of items in stock by 5
		StockList.get(0).increaseTotalStock(5);
		
		// Display the stock number
		System.out.println("Stock Number: " + StockList.get(0).getStockNumber());
		
		// Display the total price of all items in stock
		System.out.println("Total price: £" + StockList.get(0).calculateTotalPrice());
	}
}