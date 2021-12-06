
public class CheckableOblong extends Oblong implements Checkable
{
	// override constructor
	public CheckableOblong (double lengthIn, double heightIn)
	{
		super(lengthIn, heightIn);
	}
	
	@Override //overrides the check method of Checkable interface
	public boolean check()
	{
		// the length and height must be greater than zero
		return getLength() > 0 && getHeight() > 0; 
	}
}
