
public class Vehicle 
{
	// attributes
	private String regNo, make;
	private int year;
	private double value;
	
	// constructor
	public Vehicle(String regNoIn, String makeIn, int yearIn, Double valueIn)
	{
		regNo = regNoIn;
		make = makeIn;
		year = yearIn;
		value = valueIn;
	}
	
	// methods
	public String getReg()
	{
		return regNo;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public boolean setValue(double valueIn)
	{
		value = valueIn;
		return true;
	}
	
	 public int calculateAge(int currentYearIn)
	 {
		 return currentYearIn - year;
	 }
	
}
