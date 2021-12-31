import java.util.InputMismatchException;
import java.util.Scanner;
public class CarRegisterTester
{

	public static void main(String[] args) throws CarRegisterException
	{
		int choice = -1;
		CarRegister HarwoodHill;
		Integer capacity = -1;
		
		System.out.println("Car Register Tester");
		System.out.println();
		
		do
		{
			try
			{
				System.out.println("Enter capacity of car park: ");
				capacity = EasyScanner.nextInt();
				if (capacity <= 0)
					throw new CarRegisterException("Please enter a number greater than 0");
			}
			catch (InputMismatchException e)
			{
				System.out.println(e + ": Please enter a whole number\n");
			}
			catch (CarRegisterException e)
			{
				System.out.println(e + "\n");
			}
		} while (capacity <= 0);

		HarwoodHill = new CarRegister(capacity);
		
		do 
		{	
			//menu
			System.out.println("Car Register Menu");
			System.out.println();
			System.out.println("[1] Create New Permit");
			System.out.println("[2] Park Car");
			System.out.println("[3] Exit Car Park");
			System.out.println("[4] Check if Car is Parked");
			System.out.println("[5] Check if Car Park is Full");
			System.out.println("[6] Check Number of Cars Parked");
			System.out.println("[7] Get permits");
			System.out.println("[8] Get Parked Cars");
			System.out.println("[9] Get Capacity");
			System.out.println("[0] Exit Program");
			System.out.println();
			System.out.print("Please enter your choice: ");
			try
			{
				choice = EasyScanner.nextInt();
				if (choice < 0 || choice > 9)
				{
					System.out.println("Please enter a number 0 - 9");
					break;
				}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Please enter a number");
			}
			
			switch (choice)
			{
			case 1: System.out.println(HarwoodHill.givePermit(EnterReg()));
					break;
			case 2: System.out.println(HarwoodHill.recordParking(EnterReg()));
					break;
			case 3: System.out.println(HarwoodHill.recordExit(EnterReg()));
					break;
			case 4: System.out.println(HarwoodHill.isParked(EnterReg()));
					break;
			case 5: System.out.println(HarwoodHill.isFull());
					break;
			case 6: System.out.println(HarwoodHill.numberParked());
					break;
			case 7: System.out.println(HarwoodHill.getPermit());
					break;
			case 8: System.out.println(HarwoodHill.getParked());
					break;
			case 9: System.out.println(HarwoodHill.getCapacity());
					break;
			case 0: System.out.println("Goodbye");
					break;
			default: System.out.println("Please enter a number 0 to 9");
			}
		}
		while (choice != 0);
	}
	
	static String EnterReg()
	{
		System.out.print("Please enter the registration number: ");
		return EasyScanner.nextString();
	}

}
