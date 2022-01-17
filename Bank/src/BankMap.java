import java.util.*;

public class BankMap
{
    Map<String, BankAccount> accs = new HashMap<>();
	
	/** Searches map for specified account number and returns results
	 * @param accIn: User bank account number
	 * @return Return BankAccount object of given account number
	 */
    private BankAccount search(String accIn)
    {
    	if (!accs.containsKey(accIn))
    	{
    		System.out.println("Account does not exist");
    		return null;
    	}
    	else
    		return accs.get(accIn);
    }
        
   /** Gets the total number of bank accounts stored
    * @return Return the total number of bank accounts stored
    */
   public int getTotal()
   {
       return accs.size();
   }
                
    /** Adds Bank Account to list
     * @param accountNumberIn : Account number
     * @param nameIn : Name of user
     * @return Return false if account number already exists and true if added successfully
     */
    public boolean addAccount(String accountNumberIn, String nameIn)
    {
       if(accs.containsKey(accountNumberIn)) // check that account does not already exist
       {        
           System.out.println("Account number already registered");
           return false;
       }                         
       else
       {
    	   accs.put(accountNumberIn, new BankAccount(accountNumberIn, nameIn));
    	   return true;
       }
    }

    /** Deposits money into given bank account
     * @param accountNumberIn : Account number of user
     * @param amountIn :  Ammount to deposit
     * @return Returns true if successful and false otherwise
     */
    public boolean depositMoney(String accountNumberIn, double amountIn)
    {
       if (accs.containsKey(accountNumberIn))
       {
    	   accs.get(accountNumberIn).deposit(amountIn);
    	   return true;
       }
       else 
       {
    	   System.out.println("Account does not exist");
    	   return false;
       }
    }
	
    /** Withdraws money from specified account
     * @param accountNumberIn : Account number of user
     * @param amountIn : Amount to be deposited
     * @return Returns true is successful and false otherwise
     */
    public boolean withdrawMoney(String accountNumberIn, double amountIn)
    {
    	if (accs.containsKey(accountNumberIn))
        {
     	   accs.get(accountNumberIn).withdraw(amountIn);
     	   return true;
        }
        else 
        {
     	   System.out.println("Account does not exist");
     	   return false;
        }
    }
	
    /** Removes/deletes specified account
     * @param accountNumberIn : Account number of user to be deleted
     * @return Returns true is successful and false otherwise
     */
    public boolean removeAccount(String accountNumberIn)
    {
    	Character choice = 'a';
    	if (accs.containsKey(accountNumberIn))
        {
    		while (true) 
    		{
    			try
    			{
    				System.out.println("Are you sure you want to delete the account with account number " + accountNumberIn + "? Y/N\n");
    				choice = EasyScanner.nextChar();
    				if (choice != 'y' || choice != 'Y' || choice != 'n' || choice != 'N')
    				{
    					System.out.println("Please only enter 'y' or 'n'");
    				}
    				else if (choice == 'y' || choice == 'Y') 
    				{
    					accs.remove(accountNumberIn);
    					System.out.println("Account has been removed\n");
    					return true;
    				}
    				else
    				{
    					System.out.println("Account not deleted");
    					return false;
    				}
    			}
    			catch (InputMismatchException e)
    			{
    				System.out.println("Please only enter 'y' or 'n'");
    			}
    		}
        }
        else 
        {
     	   System.out.println("Account does not exist");
     	   return false;
        }
    }
}
