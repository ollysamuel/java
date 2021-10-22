import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.lang.*;

public class Calculator
{
	private String answerString = "";
	private double answer = 0;
	char operator;
	
	//constructor
	public Calculator()
	{
	}
	
	public String getAnswerString()
	{
		return answerString;
	}
	
	
	public double getAnswer()
	{
		return answer;
	}
	
	public void calculate(char operationIn)
	{
		operator = operationIn;
		double tempNum = Double.parseDouble(answerString);
		if (operationIn == '+')
			answer += tempNum;
		else if (operationIn == '-')
			answer = answer - tempNum;
		else if (operationIn == 'x')
			answer = answer * tempNum;
		else if (operationIn == '/')
			answer /= tempNum;
		//else if (operationIn == '=')
		//	answer = tempNum;
		answerString = "";
	}
	
	public double equals()
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
		answerString = "";
		return answer;
	}
	
	public void clear()
	{
		answerString = "";
		answer = 0;
	}
	
	public void numberButtons(String buttonIn)
	{
		answerString = answerString + buttonIn;
	}
	
	
	
	/*
	static String calculate(String displayIn)
	{
		// checks that first and last digits are numbers
		if (!Character.isDigit(displayIn.charAt(0)) || !Character.isDigit(displayIn.charAt(displayIn.length() - 1)))
		{
			return "error 1";
		}
		String tempNum = "";
		String num1 = "";
		String num2 = "";
		char operator;
		double answer = 0;
		
		for (int i = 0; i < displayIn.length(); i++)
		{
			if (Character.isDigit(displayIn.charAt(i)) || displayIn.charAt(i) == '.')
			{
				tempNum += displayIn.charAt(i);
				num1 = tempNum;
				return tempNum + "";
			}
		}
		return "hello";
	}
			/*
			else if (displayIn.charAt(i) == '+' || displayIn.charAt(i) == 'x' ||
						displayIn.charAt(i) == '/' || displayIn.charAt(i) == '-')
			{
				operator = displayIn.charAt(i);
				for (int j = displayIn.charAt(i + 1); j < displayIn.length(); j++)
				{
					if (Character.isDigit(displayIn.charAt(j)) || displayIn.charAt(j) == '.')
					{
						tempNum += displayIn.charAt(j);
						num2 = tempNum;
					}
				}
				if (operator == '+')
					answer = Double.parseDouble(num1) + Double.parseDouble(num2);
				else if (operator == '-')
					answer = Double.parseDouble(num1) + Double.parseDouble(num2);
				else if (operator == 'x')
					answer = Double.parseDouble(num1) * Double.parseDouble(num2);
				else if (operator == '/')
					answer = Double.parseDouble(num1) / Double.parseDouble(num2);
				else 
					return "error2";
			}
			return "error";
		}
		
		return answer + "";
	
	}
		*/

}
