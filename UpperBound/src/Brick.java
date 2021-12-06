public class Brick implements Calculatable {
	
	private double length, width, height;
	
	public Brick (double lengthIn, int widthIn, int heightIn)
	{
		length = lengthIn;
		width = widthIn;
		height = heightIn;
	}
	
	@Override
	public double calculateVolume()
	{
		return length * width * height;
	}

}
