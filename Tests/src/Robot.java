
public abstract class Robot
{
	private String id;
	private int securityLevel;
	private int warningLevel = 0;
	
	public Robot(String IdIn, int levelIn)
	{
		id = IdIn;
		securityLevel = levelIn;
	}
	
	public String getId()
	{
		return id;
	}
	
	public int getSecurityLevel()
	{
		return securityLevel;
	}
	
	public abstract void calculateWarningLevel();
}