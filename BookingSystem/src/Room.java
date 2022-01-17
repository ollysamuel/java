import java.util.ArrayList;
import java.util.List;

public class Room
{
	String roomNumber;
	
	public Room(String roomNumIn)
	{
		roomNumber = roomNumIn;
	}
	
	public String getRoomNumber()
	{
		return roomNumber;
	}
	
	public Room getRoom()
	{
		return this;
	}
	
	public String toString()
	{
		return roomNumber;
	}
}