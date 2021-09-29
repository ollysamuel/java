import java.util.*;

public class VehicleSearch {

	public static void main(String[] args) 
	{
		
		int choice = 0;
		
		Catalogue carCat = new Catalogue(); 
		
		do 
		{
			displayMenu();
			
			choice = userInput();
			
			// start of switch
			switch (choice)
			{
				case 1: addVehicle(carCat);
				break;
				case 2: displayVehicle(carCat);
				break;
				case 3: deleteVehicle(carCat);
				break;
				case 4: System.out.println("Goodbye");
				break;
				default: System.out.println("Please enter a number between 1 and 4");
			}
			System.out.println();
		} while (choice != 4);
		
	}
	
	// menu, input and functions
	static void displayMenu()
	{
		System.out.println("[1] Add a vehicle" + "\n"
				 		 + "[2] Display a list of vehicle details" + "\n"
				         + "[3] Delete a vehicle" + "\n"
				         + "[4] Quit");
	}
	
	static int userInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter choice: ");
		return keyboard.nextInt();
	}
	
	static void addVehicle(Catalogue carCatIn)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Reg: ");
		String reg = keyboard.next();
		System.out.print("Make: ");
		String make = keyboard.next();
		System.out.print("Year: ");
		int year = keyboard.nextInt();
		System.out.print("Value: ");
		double value = keyboard.nextDouble();
		System.out.print("Number of Owners:");
		int numberOfOwners = keyboard.nextInt();
		carCatIn.addNewVehicle(reg, make, year, value, numberOfOwners);
	}
	
	static void displayVehicle(Catalogue carCatIn)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter reg: ");
		String reg = keyboard.next();
		carCatIn.displayVehicle(reg);
	}
	
	static void deleteVehicle(Catalogue carCatIn)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter reg: ");
		String reg = keyboard.next();
		carCatIn.deleteVehicle(reg);
	}
}