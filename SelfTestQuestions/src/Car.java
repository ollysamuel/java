public class Car
{
	private String registration;
	private String make;
	private double price;
	
	public Car(String registrationIn, String makeIn, double priceIn)
	{
		registration = registrationIn;
		make = makeIn;
		price = priceIn;
	}
	
	public String getRegistration()
	{
		return registration;
	}

	public String getMake()
	{
		return make;
	}

	public double getPrice()
	{
		return price;
	}
	
	@Override
	public String toString()
	{
		return "Reg: " + registration + "\nMake: " + make + "\nPrice: " + price + "\n\n";
	}
}