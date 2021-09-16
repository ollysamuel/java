package classFiles;

public class IncubatorTester 
{
	public static void main(String[] args) 
	{
		// create incubator object
		Incubator incubate = new Incubator();
		
		System.out.println("MAX: " + Incubator.max);
		System.out.println("MIN: " + Incubator.min);
		
		System.out.println("Temp: " + incubate.getTemperature());
		
		// test increase temp method. Expected output: WARNING temp too high
		for (int i = 0; i < 6; i++)
			incubate.increaseTemperature(true);
		
		System.out.println("Temp: " + incubate.getTemperature());
		
		// test decrease temp method. Expected output: WARNING temp too low
		for (int i = 0; i < 21; i++)
			incubate.decreaseTemperature(true);
		
		System.out.println("Temp: " + incubate.getTemperature());
	}
}