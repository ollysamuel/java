package classList;

public class SensorTester 
{
	public static void main(String[] args) 
	{
		// create objects
		Sensor footPad = new Sensor();
		Sensor footPad2 = new Sensor(25);
		
		// display pressure after creation of objects
		System.out.println(footPad.getPressure());
		System.out.println(footPad2.getPressure());
		
		// set pressure
		System.out.println(footPad.setPressure(50));
		System.out.println(footPad2.setPressure(62));
		
		// test validation of pressure input
		System.out.println(footPad.setPressure(-50));
		System.out.println(footPad2.setPressure(-40));
		
		// display new pressure values
		System.out.println(footPad.getPressure());
		System.out.println(footPad2.getPressure());
	}
}