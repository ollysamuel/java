package classFiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// declare array list of student accounts
		ArrayList<Student> accountList = new ArrayList<>();
		
		// declare scanner objects
		Scanner keyboard = new Scanner(System.in);
		
		// create accounts
		accountList.add(new Student("43672843", "James Richards"));
		accountList.add(new Student("56724654", "Chloe Turner"));
		accountList.add(new Student("68391432", "Jamie Wiston"));
		
		for (int i = 0; i < accountList.size(); i++)
		{
			System.out.println("Enter English results for " + accountList.get(i).getName() + ": ");
			int eng = keyboard.nextInt();
			
			System.out.println("Enter Maths results for " + accountList.get(i).getName() + ": ");
			int maths = keyboard.nextInt();
			
			System.out.println("Enter Science results for " + accountList.get(i).getName() + ": ");
			int science = keyboard.nextInt();
			
			accountList.get(i).enterMarks(eng, maths, science);
		}
		
		for (Student item : accountList)
		{
			System.out.println("Name: " + item.getName() + "  ");
			System.out.println("Number: " + item.getNumber());
			System.out.println("Maths score: " + item.getMathsMark() + 
								"  English score: " + item.getEnglishMark() + 
									"  Science score: " + item.getScienceMark());
		}

	}

}
