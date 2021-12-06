
public class CheckableBankAccount extends BankAccount implements Checkable 
{
	// override constructor
	public CheckableBankAccount(String numberIn, String nameIn)
	{
		super(numberIn, nameIn);
	}
	
	@Override // overrides check function
	public boolean check()
	{
		if (getAccountNumber().length() != 8)
			return false;
		else 
		{
			for (int i = 0; i < 8; i++)
			{
				if (!Character.isDigit(getAccountNumber().charAt(i)))
					return false;
			}
			return true;
		}	
	}
}
