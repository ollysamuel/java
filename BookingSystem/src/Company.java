import java.util.ArrayList;
import java.util.List;

public class Company
{
	Calendar calendar;
	private List<Room> rooms;
	private List<Person> people;
	private String compName;
	public Room currentRoom;
	public String currentMonth;
	
	public Company(String compNameIn)
	{
		compName = compNameIn;
		calendar = new Calendar("Sam Cal");
		rooms = new ArrayList<>();
		people = new ArrayList<>();
	}
	
	public boolean addPerson(String nameIn, String idNumIn, String emailIn, String telIn)
	{
		return people.add(new Person(nameIn, idNumIn, emailIn, telIn));
	}
	
	public boolean addRoom(String roomNumIn)
	{
		return rooms.add(new Room(roomNumIn));
	}
	
	public Room getRoom(String roomNumberIn)
	{
		for (int i = 0; i < rooms.size(); i++)
			if (rooms.get(i).getRoomNumber().equals(roomNumberIn))
				return rooms.get(i).getRoom();
		return null;
	}
	
	public Person getPerson(String nameIn)
	{
		for (int i = 0; i < people.size(); i++)
			if (people.get(i).getName().equals(nameIn))
				return people.get(i).getPerson();
		return null;
	}
	
	public List<Person> getPeople()
	{
		return people;
	}
	
	public int getRoomsLength()
	{
		return rooms.size();
	}
	
	public List<Room> getRooms()
	{
		return rooms;
	}
	
	public void setCurrentRoom(String roomIn)
	{
		currentRoom = this.getRoom(roomIn);
	}
	
	public void setCurrentMonth(String monthIn)
	{
		currentMonth = monthIn;
	}
	
	public String getCurrentMonth()
	{
		return currentMonth;
	}
	
	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	
	public Calendar getCalendar()
	{
		return calendar;
	}
}
