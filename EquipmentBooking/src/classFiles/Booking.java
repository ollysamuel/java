package classFiles;

public class Booking 
{
	// declare variables
	private String name;
	private String month;
	private int day;
	private int timeSlot = 0;
	
	// constructor
	public Booking(String nameIn, String monthIn, int dayIn, int timeSlotIn)
	{
		name = nameIn;
		month = monthIn;
		day = dayIn;
		timeSlot = timeSlotIn;
	}
	
	@Override
	public boolean equals(Object objIn)
	{
		Booking bookingIn = (Booking) objIn;
		if (this == bookingIn)
			return true;
		if (bookingIn == null)
			return false;
		return day == bookingIn.getDay() && bookingIn.getTimeSlot() == timeSlot && bookingIn.getMonth().equals(month);
	}
	
	// Getters and setters

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMonth()
	{
		return month;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}

	public int getDay()
	{
		return day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public int getTimeSlot()
	{
		return timeSlot;
	}

	public void setTimeSlot(int timeSlot)
	{
		this.timeSlot = timeSlot;
	}
}