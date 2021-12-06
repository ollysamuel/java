
public class testComputable 
{

	public static void main(String[] args) 
	{
		Computable<Integer> comp = (x, y) -> x + y; 
		
		printResult(comp);
		
		Computable<Double> comp1 = (x, y) -> x + y; 
		
		printResult(comp1);
	}
	
	public static void printResult(Computable<? extends Number> compIn)
	{
		Number num1 = 10;
		Number num2 = 5;
		System.out.println(compIn.compute(num1, num2));
	}

}
