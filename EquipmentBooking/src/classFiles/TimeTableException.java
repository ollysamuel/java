package classFiles;

public class TimeTableException extends RuntimeException
{
	TimeTableException()
	{
		super("An error has occurred");
	}
	
	TimeTableException(String message)
	{
		super(message);
	}
}
