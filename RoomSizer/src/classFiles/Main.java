package classFiles;

import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		// variables
		int choice;
		
		// create objects
		Apartment apart1 = new Apartment();
		Scanner keyboard = new Scanner(System.in);

		do
		{
			// display menu
			System.out.println("Room Sizer");
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("[1] Add a room");
			System.out.println("[2] Get room area");
			System.out.println("[3] Get room width");
			System.out.println("[4] Get room length");
			System.out.println("[5] Exit");
			System.out.println();
			
			// get user choice
			System.out.print("Please enter a number: ");
			choice = keyboard.nextInt();

			switch (choice) 
			{
				case 1: apart1.addRoom(enterDimension("length: "), enterDimension("width: "));
						break;
				case 2: System.out.print("What room area would you like?: ");
						System.out.println(apart1.getRoomArea(keyboard.nextInt()) + "m^2");
						break;
				case 3: System.out.print("What room width would you like?: ");
						System.out.println(apart1.getRoomWidth(keyboard.nextInt()) + "m");
						break;
				case 4: System.out.print("What room length would you like?: ");
						System.out.println(apart1.getRoomLength(keyboard.nextInt()) + "m");
						break;
				case 5: keyboard.close();
						return;
				default: System.out.println();
						 System.out.println("Please enter a number 1-4");
			}
			System.out.println();
		} while (choice != 4);
	}
	
	static double enterDimension(String dimensionIn)
	{
		double tempDim = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter " + dimensionIn + ": ");
		tempDim = keyboard.nextDouble();
		keyboard.close();
		return tempDim;
	}
}