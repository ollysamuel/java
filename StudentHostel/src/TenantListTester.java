
public class TenantListTester 
{
	public static void main(String[] args) 
	{
		int choice, tenantNumber;
		
		System.out.print("Enter number of tenants: ");
		tenantNumber = EasyScanner.nextInt();
		
		TenantList tList = new TenantList(tenantNumber);
		
		do
		{
			System.out.println();
			System.out.println("[1] ADD TENANT");
			System.out.println("[2] REMOVE TENANT");
			System.out.println("[3] SEARCH FOR TENANT");
			System.out.println("[4] GET TENANT");
			System.out.println("[5] CHECK IF EMPTY");
			System.out.println("[6] CHECK IF FULL");
			System.out.println("[7] GET TOTAL");
			System.out.println("[8] DISPLAY TENANT DETAILS");
			System.out.println("[9] QUIT");
			System.out.println();
			
			System.out.print("Please enter your choice: ");
			choice = EasyScanner.nextInt();
			
			switch (choice)
			{
				case 1: addTenant(tList); break;
				case 2: removeTenant(tList); break;
				case 3: search(tList); break;
				case 4: getTenant(tList); break;
				case 5: isEmpty(tList); break;
				case 6: isFull(tList); break;
				case 7: getTotal(tList); break;
				case 8: tenantInfo(tList); break;
				case 9: System.out.println("Testing Complete");
				default: System.out.println("Please enter a number betwe 1 and 9");
			}
		} while (choice != 9);
	}
	
	static void addTenant(TenantList tListIn)
	{
		System.out.print("Tenant Name: ");
		String name = EasyScanner.nextString();
		System.out.print("Room Number: ");
		int room = EasyScanner.nextInt();
		Tenant tenantTemp = new Tenant(name, room);
		tListIn.addTenant(tenantTemp);
	}
	
	static void removeTenant(TenantList tListIn)
	{
		System.out.println("You have chosen to remove a tenant.");
		System.out.print("Room number of tenant: ");
		
		if (tListIn.removeTenant(EasyScanner.nextInt()) == true)
			System.out.println("Tenant has been removed");
		else
			System.out.println("Tenant does not exist");
	}
	
	static void search(TenantList tListIn)
	{
		System.out.println("You have chosen to search for a tenant.");
		System.out.print("Room number of tenant: ");
		
		Tenant result = tListIn.search(EasyScanner.nextInt());

		if (result == null)
			System.out.println("Tenant has been removed");
		else
			System.out.println(result);
	}
	
	static void getTenant(TenantList tListIn)
	{
		System.out.print("Enter number of tenant: ");
		Tenant result = tListIn.getTenant(EasyScanner.nextInt());
		if (result == null)
			System.out.println("Tenant not found");
		else 
			System.out.println(result);
	}
	
	static void isEmpty(TenantList tListIn)
	{
		if (tListIn.isEmpty() == true)
			System.out.println("List is empty");
		else 
			System.out.println("List is not empty");
	}
	
	static void isFull(TenantList tListIn)
	{
		if (tListIn.isFull() == true)
			System.out.println("List is full");
		else 
			System.out.println("List is not full");
	}
	
	static void getTotal(TenantList tListIn)
	{
		System.out.println("There are " + tListIn.getTotal() + " tenants in the hostel");
	}
	
	static void tenantInfo(TenantList tListIn)
	{
		System.out.println(tListIn.toString());
	}
}