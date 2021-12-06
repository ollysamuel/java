
public class Main {

	public static void main(String[] args) {
		
		String name = "Olly";
		char symbol = '!';
		MyInterface myInterface = (nameIn, symbolIn) -> 
		{
			System.out.println("Hello World" + symbol);
			System.out.println("It is a nice day " + name + symbol);
		};
		
		MyInterface myInterface2 = (nameIn, symbolIn) ->
		{
			System.out.println("Hello " + nameIn + symbolIn);
		};
		
		myInterface.message(name, symbol);
		
		myInterface2.message(name, symbol);
	}

}
