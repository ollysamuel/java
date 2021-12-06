/** 
 * @author Olly Samuel
 * @version 27-11-2021
 * @throws NumberFormatException if non digit is entered
 * @throws InvalidPositionException if number is entered that is greater than the length of the array
 */

public class ExceptionsQ4
{
	public static void main(String[] args)
	{
		int[] someArray = {12,9,3,11};
		try
		{
			int position = getPosition();
			display (someArray, position);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Number format exception " + e.getMessage());
		}
		catch (InvalidPositionException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong: " + e.getStackTrace());
		}
		finally
		{
			System.out.println("End of program" );
		}
	}
	
	static int getPosition() throws NumberFormatException
	{
		System.out.println("Enter array position to display");
		String positionEntered = EasyScanner.nextString(); // requires EasyScanner class
		return Integer.parseInt(positionEntered);
	}
	
	static void display (int[] arrayIn, int posIn) throws InvalidPositionException
	{
		if (posIn > arrayIn.length)
			throw new InvalidPositionException(posIn + " is an invalid position");
		else
			System.out.println("Item at this position is: " + arrayIn[posIn]);
	}
}
