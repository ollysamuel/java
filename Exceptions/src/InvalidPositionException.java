
public class InvalidPositionException extends RuntimeException
{
	InvalidPositionException()
	{
		super("An error has occurred");
	}
	
	InvalidPositionException(String message)
	{
		super(message);
	}
}
