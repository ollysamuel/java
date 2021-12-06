
public class CheckableCustomer extends Customer implements Checkable
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
}
