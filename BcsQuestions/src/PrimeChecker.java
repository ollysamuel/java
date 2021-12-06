import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		while (true)
		{
			System.out.print("Number: ");
			int input = keyboard.nextInt();
			if (isPrime(input))
				System.out.println(input + " is a prime number.");
			else
				System.out.println(input + " is NOT a prime number.");
		}
	}
	
	static boolean isPrime(int n)
	{
		for (int i = 2; i <= n-1; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}

}

/*
BEGIN isPrime(n)
	FOR i = 2 to n-1 Step 1
		IF n % i == 0
			RETURN false
			STOP
	RETURN true
STOP
*/
