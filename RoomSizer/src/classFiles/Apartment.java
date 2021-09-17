package classFiles;

import java.util.ArrayList;

public class Apartment 
{
	private ArrayList<Oblong>rooms = new ArrayList<>();
	
	// methods
	public void addRoom(double lengthIn, double widthIn)
	{
		if (lengthIn <= 0 || widthIn <= 0)
			System.out.println("ERROR: Please enter a positive number");
		else
			rooms.add(new Oblong(lengthIn, widthIn));
	}
	
	public double getRoomArea(int roomIn)
	{
		roomIn -= 1;
		if (roomExists(roomIn))
			return rooms.get(roomIn).calculateArea();
		else
			return 0.0;
	}
	
	public double getRoomLength(int roomIn)
	{
		roomIn -= 1;
		if (roomExists(roomIn))
			return rooms.get(roomIn).getLength();
		else
			return 0.0;
	}
	
	public double getRoomWidth(int roomIn)
	{
		roomIn -= 1;
		if (roomExists(roomIn))
			return rooms.get(roomIn).getHeight();
		else
			return 0.0;
	}
	
	private boolean roomExists(int roomNum)
	{
		if (roomNum < 1 || roomNum > rooms.size())
		{
			System.out.println("ERROR: Room does not exist");
			return false;
		}
		else
			return true;
	}
}
