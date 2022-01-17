import java.util.Scanner;

public class SearchAlgorithmsMain
{

	public static void main(String[] args)
	{
		char[] charsUnsorted = {'b', 't', 'f', 'g', 'h', 'a', 'y', 'e', 'l', 'z', 'k','w', 'u', 'q', 'j'};
		
		char[] charsSorted = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z'};
		
		System.out.print("Enter character to search for: ");
		char charSearch = EasyScanner.nextChar();
		int index = binarySearch(charsSorted, charSearch);
		
		if (index == -1)
			System.out.println("Character not found");
		else
			System.out.println("\nIndex for " + charSearch + " is: " + index);
		
		
	}
	
	public static int binarySearch(char[] arrayIn, char charIn)
	{
		int multiplier = 1;
		
		while (true)
		{
			char tempChar = arrayIn[arrayIn.length/(2*multiplier)];
			if (tempChar == charIn)
			{
				return arrayIn.length/(2*multiplier);
			}
			else if (tempChar > charIn)
			{
				return arrayIn.length/(2*multiplier);
			}
			else if (arrayIn[arrayIn.length/(2*multiplier)] < 1)
			{
				return -1;
			}
			multiplier *= 2;
		}
	}
}
