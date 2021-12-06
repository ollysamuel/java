
public class TestResetable {

	public static void main(String[] args) {
		// create an Oblong object and BankAccount Object
		Oblong oblongObj = new Oblong(13.5, 9.254);
		BankAccount bankAccObj = new BankAccount("12345678", "Olly");
		
		// Make a deposit into the BankAccount object
		bankAccObj.deposit(16.56);
		
		System.out.println("Oblong Object Details");
		System.out.println("Height: " + oblongObj.getHeight() + "\nLength: " + oblongObj.getLength());
		System.out.println();
		System.out.println("Bank Account Object Details");
		System.out.println("Name: " + bankAccObj.getAccountName() + "\nNumber: " + bankAccObj.getAccountNumber() + 
								"\nBalance: " + bankAccObj.getBalance());
		
		/* call the resetObject method with a lambda expression that sets
		the length and height of the Oblong to 1 */
		
		resetObject( () -> {
								oblongObj.setLength(1);
								oblongObj.setHeight(1);
			}
		);
		
		/* call the resetObject method with a lambda expression that sets
		the balance of the BankAccount object to zero. You can't do this
		directly because there is no setBalance method - but you can
		withdraw the total amount that is in the account */
		
		resetObject( () -> {
			bankAccObj.withdraw(bankAccObj.getBalance());
			}	
		);
		
		/* display the length and height of the oblong (which should now
		be 1) and the balance of the bank account (which should now be
		zero) */
		System.out.println();
		System.out.println("Oblong Object Details After Reset");
		System.out.println("Height: " + oblongObj.getHeight() + "\nLength: " + oblongObj.getLength());
		System.out.println();
		System.out.println("Bank Account Object Details After Reset");
		System.out.println("Name: " + bankAccObj.getAccountName() + "\nNumber: " + bankAccObj.getAccountNumber() + 
								"\nBalance: " + bankAccObj.getBalance());
	}
		// write a resetObject method as follows:
		
		static void resetObject(Resetable objectIn)
		{
			objectIn.reset();
		}
	
}
