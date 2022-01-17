package classFiles;

import java.util.ArrayList;
import java.util.List;

public class Room
{
	String roomNumber;
	List<Booking> bookings;
	
	public Room(String roomNumberIn)
	{
		roomNumber = roomNumberIn;
		bookings = new ArrayList<>();
	}
	
	public boolean addBooking(Booking bookingIn)
	{
		if (!search(bookingIn))
			return bookings.add(bookingIn);
		else
			return false;
	}

	public String getRoomNumber()
	{
		return roomNumber;
	}

	public void setRoomNumber(String roomNumberIn)
	{
		this.roomNumber = roomNumberIn;
	}
	
	public boolean search(Booking bookingIn)
	{
		return bookings.contains(bookingIn);
	}
	
	public List<Booking> searchMonth(String monthIn)
	{
		List<Booking> monthBookings = new ArrayList<>();
		for (int i = 0; i < bookings.size(); i++)
		{
			if (bookings.get(i).getMonth().equals(monthIn))
				monthBookings.add(bookings.get(i));
		}
		return monthBookings;
	}
}