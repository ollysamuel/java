/*
 * Student grade tracker Version 1.0
 * 
 * Author: Oliver Samuel
 * 
 * Date: 14/09/2021
 */

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
		
		// input grades
		for (int i = 0; i < accountList.size(); i++)
		{
			System.out.println("Enter English results for " + accountList.get(i).getName() + ": ");
			int eng = keyboard.nextInt();
			System.out.println();
			
			System.out.println("Enter Maths results for " + accountList.get(i).getName() + ": ");
			int maths = keyboard.nextInt();
			System.out.println();
			
			System.out.println("Enter Science results for " + accountList.get(i).getName() + ": ");
			int science = keyboard.nextInt();
			System.out.println();
			
			accountList.get(i).enterMarks(eng, maths, science);
		}
		
		keyboard.close();
		
		// display results and calculate average
		for (Student item : accountList)
		{
			System.out.println("Name: " + item.getName() + "  ");
			System.out.println("Account Number: " + item.getNumber());
			System.out.println("Maths score: " + item.getMathsMark() + 
								"  English score: " + item.getEnglishMark() + 
									"  Science score: " + item.getScienceMark());
			System.out.println("Average mark: " + item.calculateAverage());
			System.out.println();
		}
	}
}