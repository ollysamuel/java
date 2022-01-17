import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextFileTester
{
	public static void main(String[] args)
	{
		char choice;

		List<Car> carList = new ArrayList<>();

		//readList(carList);
		
		System.out.println("\nText File Tester");
		System.out.println("Please add three cars");
		
		for (int i = 1; i <= 3; i++)
		{
			System.out.println("Car " + i);
			addCar(carList);
		}
		
		writeList(carList);
		
		System.out.println(carList);
	}

	static void addCar(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		double tempPrice;
		System.out.print("Please enter the registration number: ");
		tempReg = EasyScanner.nextString();
		System.out.print("Please enter the make: ");
		tempMake = EasyScanner.nextString();
		System.out.print("Please enter the price: ");
		tempPrice = EasyScanner.nextDouble();
		carListIn.add(new Car(tempReg, tempMake, tempPrice));
	}

	static void removeCar(List<Car> carListIn)
	{
		int pos;
		System.out.print("Enter the position of the car to be removed: ");
		pos = EasyScanner.nextInt();
		carListIn.remove(pos - 1);
	}

	static void listAll(List<Car> carListIn)
	
	{
		for(Car item : carListIn)
		{
		System.out.println(item.getRegistration()
		+ " "
		+ item.getMake()
		+ " "
		+ item.getPrice());
		}
	}
	
	static void writeList(List<Car> carListIn)
	{
	
		try(FileWriter carFile = new FileWriter("../../../../desktop/Cars.txt");
			PrintWriter carWriter = new PrintWriter(carFile);)
		{
	
			for(Car item : carListIn)
			{
				carWriter.println("Registration Number: " + item.getRegistration());
				carWriter.println("Make: " + item.getMake());
				carWriter.println("Price: " + item.getPrice());
				carWriter.println();
			}
		}
	
		catch(IOException e)
		{
			System.out.println("There was a problem writing the file");
		}
	}
	
	static void readList(List<Car> carListIn)
	{
		String tempReg;
		String tempMake;
		String tempStringPrice;
		double tempDoublePrice;
	
		try(FileReader carFile = new FileReader("Cars.txt");
			BufferedReader carStream = new BufferedReader(carFile);)
		{
	
			tempReg = carStream.readLine();
	
			while(tempReg != null)
			{
				tempMake = carStream.readLine();
				tempStringPrice = carStream.readLine();
	
				tempDoublePrice = Double.parseDouble(tempStringPrice);
				carListIn.add(new Car(tempReg, tempMake, tempDoublePrice));
				tempReg = carStream.readLine();
			}
		}

		catch(FileNotFoundException e)
		{
			System.out.println("\nNo file was read");
		}

		catch(IOException e)
		{
			System.out.println("\nThere was a problem reading the file");
		}
	}
}