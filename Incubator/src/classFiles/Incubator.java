package classFiles;

public class Incubator 
{
	// declare variables
	private int temperature;
	public static int max = 10;
	public static int min = -10;
	
	// constructor
	public Incubator()
	{
		temperature = 5;
	}
	
	// methods
	public int getTemperature()
	{
		return temperature;
	}
	
	public boolean increaseTemperature(boolean boolIn)
	{
		if (temperature < max)
		{
			temperature += 1;
			return true;
		}
		else 
		{
			System.out.println("WARNING Temp too high");
			return false;
		}
	}
	
	public boolean decreaseTemperature(boolean boolIn)
	{
		if (temperature > min)
		{
			temperature -= 1;
			return true;
		}
		else 
		{
			System.out.println("WARNING Temp too low");
			return false;
		}
	}
}