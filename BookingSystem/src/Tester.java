public class Tester
{
	public static void main(String[] args)
	{
		Company samuelInc = new Company("Samuel Inc");
		
		samuelInc.addPerson("Olly", "", "", "");
		samuelInc.addPerson("James", "", "", "");
		samuelInc.addPerson("Dom", "", "", "");
		samuelInc.addPerson("Jasper", "", "", "");
		samuelInc.addPerson("Maeve", "", "", "");
		samuelInc.addPerson("Vicki", "", "", "");
		
		samuelInc.addRoom("A111");
		samuelInc.addRoom("B111");
		samuelInc.addRoom("C111");
		samuelInc.addRoom("D111");
		
		
		
		samuelInc.getCalendar().addBooking(samuelInc.getRoom("a111"), samuelInc.getPerson("Olly"), "February", 15, 3);
		samuelInc.getCalendar().addBooking(samuelInc.getRoom("b111"), samuelInc.getPerson("James"), "January", 30, 1);
		samuelInc.getCalendar().addBooking(samuelInc.getRoom("c111"), samuelInc.getPerson("Vicki"), "March", 25, 2);
		samuelInc.getCalendar().addBooking(samuelInc.getRoom("a111"), samuelInc.getPerson("Olly"), "December", 18, 3);
		
		System.out.println(samuelInc.getCalendar().getBookings());

	}
}