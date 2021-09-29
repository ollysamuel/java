import java.util.ArrayList;

public class Catalogue 
{
	private ArrayList<SecondHandVehicle> carList = new ArrayList<>();
	
	// search function
	private int search(String regIn)
	{
		for (int i = 0; i < carList.size() - 1; i++)
		{
			SecondHandVehicle tempCar = carList.get(i);
			String tempReg = tempCar.getReg();
			if (tempReg.equals(regIn))
				return i;
		}
		return -999;
	}
	
	// add vehicle
	public void addNewVehicle(String regNoIn, String makeIn, int yearIn, Double valueIn, int numberOfOwnersIn)
	{
		if (search(regNoIn) != -999)
			System.out.println("Car is already in system");
		else
			carList.add(new SecondHandVehicle(regNoIn, makeIn, yearIn, valueIn, numberOfOwnersIn));
	}
	
	// Display vehicle details
	public void displayVehicle(String regIn)
	{
		int index = search(regIn);
		
		if (index != -999)
		{
			System.out.println("Reg: " + carList.get(index).getReg());
			System.out.println("Make: " + carList.get(index).getMake());
			System.out.println("Value: " + carList.get(index).getValue());
			System.out.println("Year: " + carList.get(index).getYear());
			System.out.println("Age: " + carList.get(index).calculateAge(2021));
			System.out.println("Number of Owners: " + carList.get(index).getNumberOfOwners());
		}
		else
			System.out.println("Car not in catalogue");
	}
	
	// deletes vehicle
	public void deleteVehicle(String regIn)
	{
		int index = search(regIn);
		
		if (index != -999)
			carList.remove(index);
		else
			System.out.println("Car not in Catalogue");
	}
}