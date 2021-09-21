package classFiles;

public class TimeTable 
{
	// booking array
	private Booking[][] times;
	
	// constructor
	public TimeTable(int daysIn, int periodsIn)
	{
		times = new Booking[daysIn][periodsIn];
	} 
	
	// methods
	
	public boolean makeBooking(int dayIn, int periodIn, Booking bookingIn)
	{
		if (!valid(dayIn, periodIn))
			return false;
		else if (times[dayIn][periodIn] == null)
		{
			times[dayIn][periodIn] = bookingIn;
			System.out.println("Booking for day " + dayIn + " period " + periodIn + " successful.");
			return true;
		}
		else 
			return false;
	}
	
	public boolean cancelBooking(int dayIn, int periodIn)
	{
		if (!valid(dayIn, periodIn))
			return false;
		else if (times[dayIn][periodIn] == null)
		{
			System.out.println("No booking is registered at that time");
			return false;
		}
		else
		{
			times[dayIn][periodIn] = null;
			System.out.println("Cancellation successful");
			return true;
		}
	}
	
	public boolean isFree(int dayIn, int periodIn)
	{
		if (!valid(dayIn, periodIn))
			return false;
		else if (times[dayIn][periodIn] != null)
		{
			System.out.println("Equipment is not free on day " + dayIn + " period " + periodIn + ".");
			return false;
		}
		else 
		{
			System.out.println("Equipment is free on day " + dayIn + " period " + periodIn + ".");
			return true;
		}
	}
	
	public Booking getBooking(int dayIn, int periodIn)
	{
		if (valid(dayIn, periodIn))
			return times[dayIn][periodIn];
		else 
			return null;
	}
	
	public int numberOfDays()
	{
		return times.length;
	}
	
	public int numberOfPeriods()
	{
		return times[0].length;
	}
			
	// validates input
	private boolean valid(int dayIn, int periodIn)
	{
		if (dayIn >= 1 && dayIn <= 5 && periodIn <= 7 && periodIn >= 1)
			return true;
		else
		{
			System.out.println("Invalid entry");
			return false;
		}
	}
}