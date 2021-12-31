/** CarRegister class that gives out parking permits and checks in and out cars to car park
 *  @author Olly Samuel
 *  @version 30-12-21
 */

import java.util.Set;
import java.util.HashSet;

public class CarRegister
{
	private Set<String> permit;
	private Set<String> parked;
	private int capacity;
	
	/** Constructor for CarRegister class
	 * @param capacityIn: capacity of car park
	 */
	public CarRegister(int capacityIn)
	{
		try
		{
			checkCapacity(capacityIn);
			capacity = capacityIn;
			permit = new HashSet<>();
			parked = new HashSet<>();
		}
		catch (CarRegisterException e)
		{
			System.out.println(e);
		}
	}
	
	/** Gives out permit to user
	 * @param RegIn: registration number of vehicle
	 * @return Returns true if permit is given and false if permit already exists and is not added
	 */
	public boolean givePermit(String RegIn)
	{
		boolean ok = permit.add(RegIn);
		if (!ok)
		{
			System.out.println("A permit has already been issued for this car registration number");
		}
		return ok;
	}
	
	/** Permits given car into car park if not full and they have a permit
	 *  @param regIn: registration number of vehicle
	 *  @return Returns true if car successfully permitted entry into car park and false if car park is full or there is not permit
	 */
	public boolean recordParking(String regIn)
	{
		if (!permit.contains(regIn))
		{
			System.out.println("Your car registration number does not have a permit");
			return false;
		}
		else if (permit.contains(regIn) && parked.size() == capacity)
		{
			System.out.println("Car park is full");
			return false;
		}
		else
			return parked.add(regIn);
	}
	
	/** Removes given car from car park
	 *  @param regIn: registration number of vehicle
	 *  @return Returns true if care successfully removed from set of parked cars
	 */
	public boolean recordExit(String regIn)
	{
		return parked.remove(regIn);
	}
	
	/** Checks if provided car is parked
	 *  @param regIn: registration number of vehicle
	 *  @return Returns true is given registration number is currently parked in car park
	 */
	public boolean isParked(String regIn)
	{
		return parked.contains(regIn);
	}
	
	/** Checks if car park is full
	 *  @return Returns true is car park is full and false if not
	 */
	public boolean isFull()
	{
		if (parked.size() == capacity)
			return true;
		else
			return false;
	}
	
	/** Provides the number of cars currently parked
	 *  @return Returns number cars currently parked in car park
	 */
	public int numberParked()
	{
		return parked.size();
	}
	
	/** Gets the full set of permits currently registered
	 *  @return Returns set of permits currently registered
	 */
	public Set<String> getPermit()
	{
		return permit;
	}
	
	/** gets the full set of cars currently parked
	 *  @return Returns the set of cars currently parked
	 */
	public Set<String> getParked()
	{
		return parked;
	}
	
	/** Gets the capacity of the car park
	 *  @return Returns capacity
	 */
	public int getCapacity()
	{
		return capacity;
	}
	
	private void checkCapacity(int capacityIn) throws CarRegisterException
	{
		if (capacityIn < 0)
		{
			throw new CarRegisterException("Capacity must be zero or more");
		}
	}
}
