package classFiles;

public class Student 
{
	// declare variables
	private String name, number;
	private int mathScore = -999, englishScore = -999, scienceScore = -999;
	private static double fee = 3000;

	// constructor
	public Student(String numberIn, String nameIn) 
	{
		name = nameIn;
		number = numberIn;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void enterMarks(int engIn, int mathIn, int sciIn)
	{
		englishScore = engIn;
		mathScore = mathIn;
		scienceScore = sciIn;
	}
	
	public int getMathsMark()
	{
		return mathScore;
	}
	
	public int getEnglishMark()
	{
		return englishScore;
	}
	
	public int getScienceMark()
	{
		return scienceScore;
	}
	
	public double calculateAverage()
	{
		return (mathScore + englishScore + scienceScore) / 3; 
	}
	
	public static double getFee()
	{
		return fee;
	}
	
	public static void setFee(double feeIn)
	{
		fee = feeIn;
	}
}