package classFiles;

public class Booking 
{
	// declare variables
	private String room, name;
	
	// constructor
	public Booking(String nameIn, String roomIn)
	{
		room = roomIn;
		name = nameIn;
	}
	
	public String toString() 
	{
	    return name + " in room " + room;
	}
	
	// methods
	public String getRoom()
	{
		return room;
	}
	
	public String getName()
	{
		return name;
	}
}