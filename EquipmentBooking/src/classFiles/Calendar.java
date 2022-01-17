package classFiles;

import java.util.ArrayList;
import java.util.List;

public class Calendar
{
	private String calName;
	private List<Student> students;
	private List<Staff> staff;
	private List<Room> rooms;
	private List<Asset> assets; 
	private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public Calendar(String calNameIn)
	{
		calName = calNameIn;
		students = new ArrayList<>();
		staff = new ArrayList<>();
		rooms = new ArrayList<>();
	}
	
	public int getRoomIndex(String roomNumIn)
	{
		for (int i = 0; i < rooms.size(); i++)
		{
			if (rooms.get(i).getRoomNumber().equals(roomNumIn))
			{
				return i;
			}
		}
		return -999;
	}
	
	public boolean addStudent(String nameIn, String studentNumberIn)
	{
		return students.add(new Student(nameIn, studentNumberIn));
	}
	
	public boolean addRoom(String roomNumberIn)
	{
		return rooms.add(new Room(roomNumberIn));
	}
	
	public int getNumberOfRooms()
	{
		return rooms.size();
	}

	// Getters and Setters
	
	public String getCalName()
	{
		return calName;
	}

	public String[] getDays()
	{
		return days;
	}

	public void setDays(String[] days)
	{
		this.days = days;
	}
	
	public String getDay(int indexIn)
	{
		return days[indexIn];
	}


	public String[] getMonths()
	{
		return months;
	}
	
	public String getMonth(int indexIn)
	{
		return months[indexIn];
	}

	public void setMonths(String[] months)
	{
		this.months = months;
	}

	public void setCalName(String calName)
	{
		this.calName = calName;
	}

	public void setOrgName(String orgName)
	{
		this.calName = calName;
	}

	public List<Student> getStudents()
	{
		return students;
	}

	public void setStudents(List<Student> students)
	{
		this.students = students;
	}

	public List<Staff> getStaff()
	{
		return staff;
	}

	public void setStaff(List<Staff> staff)
	{
		this.staff = staff;
	}

	public List<Room> getRooms()
	{
		return rooms;
	}
	
	public Room getRoom(int indexIn)
	{
		return rooms.get(indexIn);
	}
	
	public String getRoomNumber(int indexIn)
	{
		return rooms.get(indexIn).getRoomNumber();
	}

	public void setRooms(List<Room> rooms)
	{
		this.rooms = rooms;
	}

	public List<Asset> getAssets()
	{
		return assets;
	}

	public void setAssets(List<Asset> assets)
	{
		this.assets = assets;
	}
}
