package classFiles;

public class Student
{
	String name;
	String studentNumber;
	
	public Student(String nameIn, String studentNumberIn)
	{
		name = nameIn;
		studentNumber = studentNumberIn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getStudentNumber()
	{
		return studentNumber;
	}
}
