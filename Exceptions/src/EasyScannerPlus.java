import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScannerPlus
{
	public static int nextInt()
	{
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				int i = sc.nextInt();
				return i;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Error.");
				System.out.print("Please enter a number: ");
			}
			catch (Exception e)
			{
				System.out.println("Something has gone wrong. Please try again.");
			}
		}
	}
	
	public static double nextDouble()
	{
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				double d = sc.nextDouble();
				return d;
			}
			catch (InputMismatchException e)
			{
				System.out.println("Error.");
				System.out.print("Please enter a number: ");
			}
			catch (Exception e)
			{
				System.out.println("Something has gone wrong. Please try again.");
			}
		}
	}
	
	public static char nextChar()
	{
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				char c = sc.next().charAt(0);
				return c;
			}
			catch (Exception e)
			{
				System.out.println("Something has gone wrong. Please try again.");
			}
		}
	}
	
	public static String nextString()
	{
		while(true)
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				return s;
			}
			catch (Exception e)
			{
				System.out.println("Something has gone wrong. Please try again.");
			}
		}
	}
}