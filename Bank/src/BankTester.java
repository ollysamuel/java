import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class BankTester {

	public static void main(String[] args) {
		
		Map<String, BankAccount> bankAccounts = new HashMap<>();

		bankAccounts.put("12345678", new BankAccount("12345678", "Olly Samuel"));
		bankAccounts.put("56763589", new BankAccount("56763589", "Victoria Samuel"));
		bankAccounts.put("15656558", new BankAccount("12345678", "Olly Samuel"));
		bankAccounts.put("56565659", new BankAccount("56763589", "Victoria Samuel"));
		
		bankAccounts.get("56763589").deposit(250);
		bankAccounts.get("12345678").deposit(52);

		/*bankAccounts.forEach((key, account) ->
		{
			if (account.getBalance() >= 100)
			{
				System.out.println(account);
			}
		});*/
		
		BankAccount[] bankAccountsArray = new BankAccount[4];
		
		bankAccountsArray[0] = new BankAccount("12345678", "Olly Samuel");
		bankAccountsArray[1] = new BankAccount("56763589", "Victoria Samuel");
		bankAccountsArray[2] = new BankAccount("12345678", "Ally Samuel");
		bankAccountsArray[3] = new BankAccount("56763589", "Victoria Samuel");
		
		//System.out.println(Arrays.toString(bankAccountsArray));
		
		List<BankAccount> bankAccountsList = Arrays.asList(bankAccountsArray);
		
		System.out.println("Before: " + bankAccountsList);
		
		/*bankAccountsList.sort((acc1, acc2) -> 
		{
			return acc1.getAccountName().compareTo(acc2.getAccountName());
		});*/
		
		bankAccountsList.sort(Comparator.comparing(BankAccount::getAccountName));
		
		System.out.println("\n\nAfter: " + bankAccountsList);
	}

}
