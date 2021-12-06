package classFiles;

public class TimeTable2 
{
	// booking array
	private Booking[][] times;
	
	// constructor
	public TimeTable2(int daysIn, int periodsIn) throws TimeTableException
	{
		if (valid(daysIn, periodsIn))
				times = new Booking[daysIn][periodsIn];
		else if (!valid(daysIn, periodsIn))
			throw new TimeTableException("Day and/or time not valid");
		else
			throw new TimeTableException("Something went wrong");
	} 
	
	// methods
	public void makeBooking(int dayIn, int periodIn, Booking bookingIn) throws TimeTableException
	{
		if (!valid(dayIn, periodIn))
			throw new TimeTableException("Day and/or time not valid");
		else if (times[dayIn][periodIn] == null)
		{
			times[dayIn][periodIn] = bookingIn;
			System.out.println("Booking for day " + dayIn + " period " + periodIn + " successful.");
		}
		else 
			throw new TimeTableException("Something went wrong");
	}
	
	public void cancelBooking(int dayIn, int periodIn) throws TimeTableException
	{
		if (!valid(dayIn, periodIn))
			throw new TimeTableException("Day and time not valid");
		else if (times[dayIn][periodIn] == null)
			throw new TimeTableException("No booking is registered at that time");
		else
		{
			times[dayIn][periodIn] = null;
			System.out.println("Cancellation successful");
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