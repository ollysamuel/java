
public class SecondHandVehicle extends Vehicle
{
	// new attributes
	private int numberOfOwners;
	
	// constructor
	public SecondHandVehicle(String regNoIn, String makeIn, int yearIn, Double valueIn, int numberOfOwnersIn)
	{
		super(regNoIn, makeIn, yearIn, valueIn);
		numberOfOwners = numberOfOwnersIn;
	}
	
	// new methods
	public int getNumberOfOwners()
	{
		return numberOfOwners;
	}
	
	public boolean hasMultipleOwners()
	{
		if (numberOfOwners > 1)
			return true;
		else
			return false;
	}
}
