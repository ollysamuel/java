import java.util.InputMismatchException;

public class NameStackTester
{
	public static void main(String[] args)
	{
		NameStack names = new NameStack();
		
		int choice = 0;
		
		do
		{
			System.out.println("\nTester Program for Name Stack Class\n");
			
			System.out.println("[1] Add Name");
			System.out.println("[2] Remove Name");
			System.out.println("[3] Check Number of Names");
			System.out.println("[4] Check for No Names");
			System.out.println("[5] Display Names");
			System.out.println("[6] End Program");
			System.out.print("\nPlease enter your choice: ");
			try
			{
				choice = EasyScanner.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println("\nPlease enter a digit\n");
			}
			System.out.println("\n");
			// begin switch
			switch (choice)
			{
				case 1: System.out.print("Enter name: ");
						names.push(EasyScanner.nextString());
						break;
				case 2: try
						{
							System.out.print(names.pop() + " has been removed");
						}
						catch (NamesStackException e)
						{
							System.out.println("\nList is already empty\n");
						}
						break;
				case 3: System.out.println("Number of names: " + names.size());
						break;
				case 4: if (!names.isEmpty())
							System.out.println("List is not empty");
						else
							System.out.println("List is empty");
						break;
				case 5: System.out.println(names.toString());
						break;
				case 6: System.out.println("Goodbye");
						break;
				default: System.out.println("Enter a number from 1 to 6");
			}
		} while (choice != 6);
	}
}
