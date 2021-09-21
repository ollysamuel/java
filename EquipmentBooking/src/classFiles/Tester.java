package classFiles;

public class Tester 
{
	public static void main(String[] args) 
	{
		// variables
		int choice;
		
		// display title
		System.out.println("Equipment Booking");
		
		do
		{
			choice = menu();
			
			switch (choice)
			{
			case 1: makeBooking();
					break;
			case 2: cancelBooking();
					break;
			case 3: checkFree();
					break;
			case 4: checkBooking();
					break;
			case 5: checkDays();
					break;
			case 6: checkPeriods();
					break;
			case 7: return;
			default: System.out.println("Please enter a number between 1 and 7");
			} 
		} while (choice != 7);
	}
	
	// menu methods
	
	// variables
	static int day, period;
	static String name, room;
	
	// create timetable object
	static TimeTable equipment = new TimeTable(5, 7);
	
	static int menu()
	{
		System.out.println();
		System.out.println("[1] Make Booking");
		System.out.println("[2] Cancel Booking");
		System.out.println("[3] Check Availability");
		System.out.println("[4] Check a Booking");
		System.out.println("[5] Number of Days");
		System.out.println("[6] Number of periods");
		System.out.println("[7] Quit");
		System.out.println();
		System.out.print("Please choose an option: ");
		return EasyScanner.nextInt();
	}
	
	static void makeBooking()
	{
		System.out.println("What day would you like to book the equipment? ");
		day = EasyScanner.nextInt();
		System.out.println("What period would you like to book the equipment? ");
		period = EasyScanner.nextInt();
		System.out.println("Name: ");
		name = EasyScanner.nextString();
		System.out.println("Room: ");
		room = EasyScanner.nextString();
		Booking person = new Booking(name, room);
		equipment.makeBooking(day, period, person);
	}
	
	static void cancelBooking()
	{
		System.out.println("Day: ");
		day = EasyScanner.nextInt();
		System.out.println("Period: ");
		period = EasyScanner.nextInt();
		equipment.cancelBooking(day, period);
	}
	
	static void checkFree()
	{
		System.out.println("Day: ");
		day = EasyScanner.nextInt();
		System.out.println("Period: ");
		period = EasyScanner.nextInt();
		equipment.isFree(day, period);
	}
	
	static void checkBooking()
	{
		
		System.out.println("Day: ");
		day = EasyScanner.nextInt();
		System.out.println("Period ");
		period = EasyScanner.nextInt();
		System.out.println(equipment.getBooking(day, period));
	}
	
	static void checkDays()
	{
		System.out.println("There are " + equipment.numberOfDays() + " in the timetable");
	}
	
	static void checkPeriods()
	{
		System.out.println("There are " + equipment.numberOfPeriods() + " in the timetable");
	}
}