
public class WontCompile {

	public static void main(String[] args)
	{
		int x = 2;
		
		helper( () -> 
		{
			x = x * 2;
			System.out.println(x);
		}
		);
	}
	
	static void helper(Testable objectIn)
	{
		objectIn.test();
	}

}
