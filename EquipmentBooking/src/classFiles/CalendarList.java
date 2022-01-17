package classFiles;

import java.util.ArrayList;
import java.util.List;

public class CalendarList
{
	List<Calendar> calendars;
	Calendar currentCal;
	Room currentRoom;
	
	public CalendarList()
	{
		calendars = new ArrayList<>();
	}
	
	public boolean setCurrentCal(Calendar currentCalIn)
	{
		currentCal = currentCalIn;
		return true;
	}
	
	
	
	public Calendar getCurrentCal()
	{
		return currentCal;
	}
	
	public boolean setCurrentRoom(Room roomIn)
	{
		currentRoom = roomIn;
		return true;
	}
	
	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	
	public int getSize()
	{
		return calendars.size();
	}
	
	public boolean addCalendar(String nameIn)
	{
		return calendars.add(new Calendar(nameIn));
	}
	
	public Calendar getCalendar(int indexIn)
	{
		return calendars.get(indexIn);
	}
}
