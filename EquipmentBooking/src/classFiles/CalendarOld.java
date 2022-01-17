package classFiles;

import java.util.ArrayList;
import java.util.List;

public class CalendarOld
{
	String calendarName;
	List<Booking> allBookings;
	
	// Constructor
	public CalendarOld(String calendarNameIn)
	{
		calendarName = calendarNameIn;
		allBookings = new ArrayList<>();
	}
	
	public boolean addBooking(Booking bookingIn)
	{
		return allBookings.add(bookingIn);
	}
	
	public String getBooking(int monthIn, int dayIn, int timeSlotIn)
	{
			for (int i = 0; i < allBookings.size(); i++)
			{
				if (allBookings.get(i).getMonth() == monthIn)
					if (allBookings.get(i).getDay() == dayIn)
						if (allBookings.get(i).getTimeSlot() == timeSlotIn)
							return allBookings.get(i).getRoom() + ": " + allBookings.get(i).getName();
			}
			return "Available";
	}
}
