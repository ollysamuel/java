
public class Booking
{
	String name;
	Person personBooking;
	String month;
	int day;
	int slot;
	Room room;
	
	// Constructor
	public Booking(Room roomIn, Person personIn, String monthIn, int dayIn, int slotIn)
	{
		room = roomIn;
		personBooking = personIn;
		name = personIn.getName();
		month = monthIn;
		day = dayIn;
		slot = slotIn;
	}
	
	public String getPersonName()
	{
		return name;
	}
	
	public Person getPerson()
	{
		return personBooking;
	}
	
	public Booking getBooking()
	{
		return this;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getSlot()
	{
		return slot;
	}
	
	public String getRoomNumber()
	{
		return room.getRoomNumber();
	}
	
	public Room getRoom()
	{
		return room;
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\nMonth: " + month +"\nDay: " + day + "\nSlot: " + slot + "\n";
	}
}
