import java.util.Scanner;

public class ExtendedOblongTester
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter symbol: ");
		
		ExtendedOblong extOblong = new ExtendedOblong(10.2, 5.3, keyboard.next().charAt(0));
		System.out.println(extOblong.draw());
	}
}
