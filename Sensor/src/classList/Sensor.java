package classList;

public class Sensor 
{
	// declare variables
	private double pressure;
	
	// constructors
	public Sensor()
	{
		pressure = 0;
	}
	
	public Sensor(double pressureIn)
	{
		pressure = pressureIn;
	}
	
	// methods
	public boolean setPressure(double pressureIn)
	{
		if (pressureIn < 0)
			return false;
		else
		{
			pressure = pressureIn;
			return true;
		}
	}
	
	public double getPressure()
	{
		return pressure;
	}
}