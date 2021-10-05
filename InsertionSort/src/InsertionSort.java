
public class InsertionSort 
{

	public static void main(String[] args) 
	{
		//declare and initialize and array
		int[] age = {12, 4, 5, 2, 5};
		int current;
		int iteration = 0;
		
		// insertion sort
		for (int i = 1; i < age.length; i++) // iterates through array
		{
			for (int j = i; j > 0; j--)
			{
				current = age[j];
				
				if (current < age[j - 1])
				{
					age[j] = age[j - 1];
					age[j - 1] = current;
					iteration++;
				}
			}
			iteration++;
		}
		
		for (int item : age)
		{
			System.out.print(item + " ");
		}
		
		System.out.println("Iterations: " + iteration);
	}
}