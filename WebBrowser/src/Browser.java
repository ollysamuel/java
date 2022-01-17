import java.util.List;
import java.util.ArrayList;

public class Browser
{
	private double height;
	private double width;
	private int currentPos;
	private String homeScreen = "http://google.com";
	private List<String> history;
	
	// Constructor
	public Browser(double heightIn, double widthIn)
	{
		height = heightIn;
		width = widthIn;
		history = new ArrayList<>();
	}
	
	public String getHomeScreen()
	{
		addURL(homeScreen);
		return homeScreen;
	}
	
	public boolean setHomeScreen(String homeScreenIn)
	{
		homeScreen = homeScreenIn;
		return true;
	}
			
	/** Get the height of browser
	 *  @return returns height of browser
	 */
	public double getHeight()
	{
		return height;
	}
		
	/** Get the height of browser
	 *  @return returns width of browser
	 */
	public double getWidth()
	{
		return width;
	}
		
	/** Sets the height of browser
	 *  @param heightIn: new height of browser
	 *  @return returns true if successful and false otherwise
	 */
	public boolean setHeight(int heightIn)
	{
		height = heightIn;
		if (height == heightIn)
			return true;
		else
			return false;
	}
		
	/** Sets the width of browser
	 *  @param widthIn: new width of browser
	 *  @return returns true if successful and false otherwise
	 */
	public boolean setWidth(int widthIn)
	{
		width = widthIn;
		if (width == widthIn)
			return true;
		else
			return false;
	}
		
	/** Formats the url to the correct format
	 *  @param urlIn: url entered into browser text bar
	 *  @return returns the newly formatted url
	 */
	public String formatURL(String urlIn)
	{
		String url = urlIn.toLowerCase();
		if (!(url.startsWith("http://") || url.startsWith("https://")))
			url = "http://" + url;
		return url;
	}	
	
	public String back()
	{
		
		if (currentPos == 0)
			return getURL(0);
		else
		{
			currentPos--;
			history.add(getURL(currentPos));
			return getURL(currentPos);
		}
	}
	
	public String forward()
	{
		if (!(currentPos == getLength() - 1)) 
		{
			currentPos++;
			history.add(getURL(currentPos));
			return getURL(currentPos);
		}
		else
		{
			return getURL(getLength() - 1);
		}
	}
	
	public boolean addURL(String urlIn)
	{
		if(history.add(urlIn))
		{
			currentPos = history.size() - 1;
			return true;
		}
		else
			return false;
	}
	
	public int getLength()
	{
		return history.size();
	}
	
	public String getURL(int indexIn)
	{
		return history.get(indexIn);
	}
}