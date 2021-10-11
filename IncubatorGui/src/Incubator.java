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
	public String getTemperature()
	{
		return "Current temperature is " + temperature + "C";
	}
	
	public String increaseTemperature()
	{
		if (temperature < max)
		{
			temperature += 1;
			return "Current temperature is " + temperature + "C";
		}
		else 
			return "1";
	}
	
	public String decreaseTemperature()
	{
		if (temperature > min)
		{
			temperature -= 1;
			return "Current temperature is " + temperature + "C";
		}
		else 
			return "WARNING Temp too low";
	}
	
	public String alarm()
	{
		return "***ALARM***";
	}
		
	public String help()
	{
		return "Max Temperature: " + max + "C" + "\n\n" + 
					"Min Temperature: " + min + "C";
	}
}