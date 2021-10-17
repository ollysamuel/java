/** Constructs an oblong shape and returns a range of mathematical calculations
 * based on its proportions
 * @author Oliver Samuel
 * @version 16/10/2021
 */
public class Oblong
{
	// class attributes
	private double length;
	private double height;

	/** Constructor initialises the length and height of the oblong
	 * @param lengthIn: length of oblong
	 * @param heightIn: height of oblong
	 */
	public Oblong(double lengthIn, double heightIn)
	{
		length = lengthIn;
		height = heightIn;
	}

	/** Gets length dimension
	 * @return Returns length of oblong
	 */
	public double getLength()
	{
		return length;
	}

	/** Gets height dimension
	 * @return Returns height of oblong
	 */
	public double getHeight()
	{
		return height;
	}

	/** Sets a new length for the oblong
	 * @param lengthIn: new length of oblong
	 */
	public void setLength(double lengthIn)
	{
		length = lengthIn;
	}

	/** Sets a new height for the oblong
	 * @param heightIn: new height of oblong
	 */
	public void setHeight(double heightIn)
	{
		height = heightIn;
	}

	/** Calculates the area of oblong
	 * @return Returns area of oblong (length x height)
	 */
	public double calculateArea()
	{
		return length * height;
	}

	/** Calculates the perimeter of oblong
	 * @return Returns perimeter of oblong
	 */
	public double calculatePerimeter()
	{
		return 2 * (length + height);
  	}
}

