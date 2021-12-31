
public class NamesStackException extends IndexOutOfBoundsException
{
	public NamesStackException()
	{
		super("The list of names is empty");
	}
	
	public NamesStackException(String message)
	{
		super(message);
	}
}
