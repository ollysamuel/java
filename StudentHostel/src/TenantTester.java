
public class TenantTester 
{
	public static void main(String[] args) 
	{
		int choice;
		
		System.out.print("Enter name: ");
        String name = EasyScanner.nextString();
        System.out.print("Enter room: ");
        int room = EasyScanner.nextInt();
        
		Tenant testTenant = new Tenant(name, room);
		
		do
		{
            // display options
            System.out.println();
            System.out.println("[1] GET NAME");
            System.out.println("[2] GET ROOM");
            System.out.println("[3] GET PAYMENTS");
            System.out.println("[4] MAKE PAYMENT");
            System.out.println("[5] GET TENANT DETAILS");
            System.out.println("[6] QUIT");
            System.out.println();
            System.out.print("Enter a choice [1-6]: ");
            // get choice
            choice = EasyScanner.nextChar();
            System.out.println();
            // process choice
            switch(choice)
            {
                case '1': option1(testTenant); break;
                case '2': option2(testTenant); break;
                case '3': option3(testTenant); break;
                case '4': option4(testTenant); break;
                case '5': option5(testTenant); break;
                case '6': System.out.println("TESTING COMPLETE"); break;
                default: System.out.print("1-6 only");
            }
		} while (choice != '6');
    }
	
	// Get name
    static void option1(Tenant testTenantIn)
    {  
        System.out.println(testTenantIn.getName());
    }
    
    // Get room
    static void option2(Tenant testTenantIn)
    {
    	System.out.println(testTenantIn.getRoom());
    }
    
    // Get payments
    static void option3(Tenant testTenantIn)
    {
    	System.out.println(testTenantIn.getPayments());
    }
    
    // Add payment
    static void option4(Tenant testTenantIn)
    {
    	System.out.print("Enter month: ");
    	String month = EasyScanner.nextString();
    	System.out.print("Enter amount: ");
    	double amount = EasyScanner.nextDouble();
    	Payment payment = new Payment(month, amount);
    	testTenantIn.makePayment(payment);
    }
    
    // Display tenant details
    static void option5(Tenant testTenantIn)
    {
    	System.out.print("Tenant details: ");
    	System.out.println(testTenantIn.toString());
    }
    
}
