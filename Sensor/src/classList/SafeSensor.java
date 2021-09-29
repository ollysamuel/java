package classList;

public class SafeSensor extends Sensor 
{
	private double max;
	
	public SafeSensor(double maxIn)
	{
		super();
		max = maxIn;
		setPressure(8);
	}
	
	public SafeSensor(double maxIn, int pressureIn)
	{
		super(pressureIn);
		max = maxIn;
	}
	
	@Override
	public boolean setPressure(double pressureIn)
	{
		if (pressureIn < 0)
			return false;
		else if (pressureIn > max)
		{
			System.out.println("Pressure too high");
			return false;
		}
		else
		{
			pressure = pressureIn;
			return true;
		}
	}
}
