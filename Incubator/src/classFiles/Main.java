package classFiles;

public class Main 
{
	public static void main(String[] args) 
	{
		// create incubator object
		Incubator incubate = new Incubator();
		
		// test increase temp method. Expected output: WARNING temp too high
		for (int i = 0; i < 6; i++)
			incubate.increaseTemperature(true);
		
		// test decrease temp method. Expected output: WARNING temp too low
		for (int i = 0; i < 21; i++)
			incubate.decreaseTemperature(true);
	}
}