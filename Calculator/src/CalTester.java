
public class CalTester {

	public static void main(String[] args) 
	{
		Calculator calc = new Calculator(); 
		
		System.out.print("number 1: ");
		calc.numberButtons(EasyScanner.nextString());
		
		System.out.println(calc.getAnswer());
		System.out.println(calc.getAnswerString());
		
		System.out.print("operator: ");
		calc.calculate(EasyScanner.nextChar());
		
		System.out.println(calc.getAnswer());
		System.out.println(calc.getAnswerString());
		
		System.out.print("number 2: ");
		calc.numberButtons(EasyScanner.nextString());
		
		System.out.println("final answer: " + calc.equals());
		System.out.println(calc.getAnswerString());
	}

}
