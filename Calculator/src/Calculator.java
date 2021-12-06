/** Calculator class to perform calculator functions
 *  @author Olly Samuel
 *  @version 1.0
 */

public class Calculator
{
	private String answerString = "";
	private double answer = 0;
	private char operator = 'e';
	
	/** Constructor for calculator
	 */
	public Calculator()
	{
	}
	
	/** Gets the answer variable as a String
	 * @return Returns answer as a string
	 */
	public String getAnswerString()
	{
		return answerString;
	}
	
	/** Gets the answer variable as a double
	 * @return Returns answer as a double
	 */
	public double getAnswer()
	{
		return answer;
	}
	
	/** performs calculations of the calculator
	 *  @param operationIn: The operation that is entered into the calculator GUI
	 */
	public void calculate(char operationIn)
	{	
		double tempNum = Double.parseDouble(answerString);
		if (answer == 0)
			answer = tempNum;
		else
		{
			if (operator == '+')
				answer += tempNum;
			else if (operator == '-')
				answer -= tempNum;
			else if (operator == 'x')
				answer *= tempNum;
			else if (operator == '/')
				answer /= tempNum;
		}
		operator = operationIn;
		answerString = "";
	}
	
	/** Performs final calculation when equals button is pressed
	 *  @return Returns final answer as a double
	 */
	public double equals()
	{
		if (operator == 'e')
			 answerString = "";
		else if (operator == 'a')
			return answer;
		else
		{
			double tempNum2 = Double.parseDouble(answerString);
			if (operator == '+')
				answer += tempNum2;
			else if  (operator == '-')
				answer -= tempNum2;
			else if (operator == 'x')
				answer *= tempNum2;
			else if (operator == '/')
				answer /= tempNum2;
			else
				answer = tempNum2;
			operator = 'a';
		}
		answerString = "";
		return Math.round(answer * 100.0) / 100.0;
	}
	
	/** Adds numbers to temporary number string when number button pressed
	 *  @param buttonIn: number pressed on calculator GUI
	 */
	public void numberButtons(String buttonIn)
	{
		if (answer == 0)
			answerString = "";
		answerString += buttonIn;
	}
	
	/** Resets the calculator
	 */
	public void clear()
	{
		answerString = "";
		answer = 0;
		operator = 'e';
	}
	
	
}