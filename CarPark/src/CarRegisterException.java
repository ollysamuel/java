
public class CarRegisterException extends RuntimeException
{
	public CarRegisterException()
	{
		super("There was an error");
	}
	
	public CarRegisterException(String messageIn)
	{
		super(messageIn);
	}
}
