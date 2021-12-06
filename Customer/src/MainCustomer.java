
public class MainCustomer
{

	public static void main(String[] args)
	{	
		/*//inner class
		class CheckableCustomer extends Customer implements Checkable
		{
			// Override the constructor
			public CheckableCustomer(String IdIn, String nameIn, double limitIn)
			{
				super(IdIn, nameIn, limitIn);
			}
				
			@Override
			public boolean check()
			{
				if (Character.isLetter(getCustomerId().charAt(0)) && Character.isLetter(getCustomerId().charAt(1)) &&
						Character.isLetter(getCustomerId().charAt(2)) && Character.isDigit(getCustomerId().charAt(3)))
					return true;
				else
					return false;
			}
		}*/
		
		/* Anonymous class demo
		Checkable customer1 = new CheckableCustomer("1234", "Olly", 12.5)
		{
			@Override
			public boolean check()
			{
				if (Character.isLetter(getCustomerId().charAt(0)) && Character.isLetter(getCustomerId().charAt(1)) &&
						Character.isLetter(getCustomerId().charAt(2)) && Character.isDigit(getCustomerId().charAt(3)))
					return true;
				else
					return false;
			}
		}; 
		
		Checkable customer2 = new CheckableCustomer("ABC4", "Jasper", 13.6)
		{
			@Override
			public boolean check()
			{
				if (Character.isLetter(getCustomerId().charAt(0)) && Character.isLetter(getCustomerId().charAt(1)) &&
						Character.isLetter(getCustomerId().charAt(2)) && Character.isDigit(getCustomerId().charAt(3)))
					return true;
				else
					return false;
			}
		};*/
		
		// Lambda expression demo
		Customer customer1 = new CheckableCustomer("ABC4", "Jasper", 13.6);
		
		System.out.println("customer1 is " + checkValidity(() ->
		{
			if (Character.isLetter(customer1.getCustomerId().charAt(0)) && Character.isLetter(customer1.getCustomerId().charAt(1)) &&
				Character.isLetter(customer1.getCustomerId().charAt(2)) && Character.isDigit(customer1.getCustomerId().charAt(3)))
			return true;
		else
			return false;
		}
		));
		//System.out.println("customer2 is " + checkValidity(customer2));
	}
	
	private static String checkValidity(Checkable objectIn)
	{
		if(objectIn.check())
			return "valid";
		else
			return "invalid";
	}

}
