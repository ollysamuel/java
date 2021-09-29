package classList;

public class SafeSensorTester 
{

	public static void main(String[] args) 
	{
		SafeSensor waterPressure1 = new SafeSensor(10);
		SafeSensor waterPressure2 = new SafeSensor(10, 12);
		
		// display pressure after creation of objects
		System.out.println(waterPressure1.getPressure());
		System.out.println(waterPressure2.getPressure());
				
		// set pressure
		System.out.println(waterPressure1.setPressure(2));
		System.out.println(waterPressure2.setPressure(4));
		
		// display new pressure values
		System.out.println(waterPressure1.getPressure());
		System.out.println(waterPressure2.getPressure());
				
		// test validation of pressure input
		System.out.println(waterPressure1.setPressure(-50));
		System.out.println(waterPressure2.setPressure(-40));
		System.out.println(waterPressure1.setPressure(50));
		System.out.println(waterPressure2.setPressure(62));
	}

}
