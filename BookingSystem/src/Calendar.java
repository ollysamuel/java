import java.util.ArrayList;
import java.util.List;

public class Calendar
{
	private List<Booking> bookings;
	private int daysNum = 7;
	private int monthsNum = 12;
	private final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	private int year = 2022;
	private String calName;
	
	public Calendar(String calNameIn)
	{
		calName = calNameIn;
		bookings = new ArrayList<>();
	}
	
	public boolean addBooking(Room roomIn, Person personIn, String monthIn, int dayIn, int slotIn)
	{
		return bookings.add(new Booking(roomIn, personIn, monthIn, dayIn, slotIn));
	}
	
	public ArrayList<Booking> searchByName(String nameIn)
	{
		ArrayList<Booking> bookingsByName = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getPersonName().equals(nameIn))
				bookingsByName.add(bookings.get(i));
		return bookingsByName;
	}
	
	public ArrayList<Booking> searchByMonth(String monthIn)
	{
		ArrayList<Booking> bookingsByMonth = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getMonth().equals(monthIn))
				bookingsByMonth.add(bookings.get(i));
		return bookingsByMonth;
	}
	
	public int searchByDay(int dayIn)
	{
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getDay() == dayIn)
				return i;
		return -1;
	}
	
	/*public ArrayList<Booking> searchByPerson(Person personIn)
	{
		ArrayList<Booking> bookingsByPerson = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getPerson().equals(personIn))
				bookingsByPerson.add(bookings.get(i));
		return bookingsByPerson;
	}*/
	
	public ArrayList<Booking> searchBySlot(int slotIn)
	{
		ArrayList<Booking> bookingsBySlot = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getSlot() == slotIn)
				bookingsBySlot.add(bookings.get(i));
		return bookingsBySlot;
	}
	
	public ArrayList<Booking> searchByRoom(String roomNumberIn)
	{
		ArrayList<Booking> bookingsByRoom = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
			if (bookings.get(i).getRoomNumber().equals(roomNumberIn))
				bookingsByRoom.add(bookings.get(i));
		return bookingsByRoom;
	}
	
	public List<Booking> getBookings()
	{
		return bookings;
	}
	
	public Booking getBooking(int indexIn)
	{
		return bookings.get(indexIn);
	}
	
	public String getCalName()
	{
		return calName;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public ArrayList<String> getDays()
	{
		ArrayList<String> daysOfTheWeek = new ArrayList<>();
		for (int i = 0; i < daysNum; i++)
			daysOfTheWeek.add(DAYS[i]);
		return daysOfTheWeek;
	}
	
	public ArrayList<String> getMonths()
	{
		ArrayList<String> monthsOfTheYear = new ArrayList<>();
		for (int i = 0; i < monthsNum; i++)
			monthsOfTheYear.add(MONTHS[i]);
		return monthsOfTheYear;
	}
	
	@Override
	public String toString()
	{
		String bookingsString = "";
		
		for (int i = 0; i < bookings.size(); i++)
			bookingsString += bookings.get(i) + "\n\n";
		return bookingsString;
	}
}
