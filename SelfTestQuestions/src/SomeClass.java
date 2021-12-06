/*
 * Chapter 13 Question 2
 * The original code wouldn't compile because the argument in the overriden method was different to the argument in the interface method
 * 
 * 3. A functional interface is an interface with only one method.  A lambda expression can be used to change/add 
 * the code to the method in a functional interface in an easier less complex way than using an anonymous class
 * 
 * 4. In a Lambda expression o the left of the -> symbol goes the parameters in parentheses, to the right goes the code, within 
 * curly braces if it is more than one line
 * 
 * 5. The WontCompile class won't compile because it is attempting to modify a variable that is defined outside of the 
 * code block of the lambda expression. Inside a lambda expression, variables defined outside of the scope of the lambda expression
 * cannot be modified as they need to be final or effectively final.
 * 
 * 8. 
 * a) Generic Class
 * A Generic Class is a class that can accept undefined types as it's attributes, that the user defines when they declare an object.
 * The user sends in a type within a pair of angle brackets <> when they declare the object.  The generic class has a pair of angle brackets
 * within its header which contain a placeholder (e.g. a letter or name) that can be used through the class.  When the user sends in a type
 * with the object declaration this placeholder represents this type throughout the class.
 * 
 * b) upper bound
 * An upper bound in a generic class is when the placeholder extends a parent class. This means that the class can accept any subclass of that
 * super/parent class.  For example the wrapper classes Integer and Double are subclasses of the Number class.  Therefore if the type stated in
 * the header of the generic class 'extends Number', this generic class can accept all sub classes of the Number class a it's type when it is
 * declared as an object.
 * 
 * c) wildcard
 * A wildcard refers to the specific piece of Java syntax '?'. This is used when defining the upper bound of a generic class declaration.
 * For example, by placing the ? within the angle brackets of a generic class object declaration (<?>) it will accept any type.  However, when
 * setting an upper bound you can use the syntaxt <? extends someClass> which gives enough flexibility to include all child classes of 'someClass'
 * as well as 'someClass'
 * 
 * a) Method Overloading
 * This is the process of providing methods of the same name but with different types or numbers of parameters
 * e.g. public HighClass() and public HighClass(int numIn, String strIn) have the same name but the method to be executed will depend on the 
 * pattern of arguments used when calling the method
 * 
 * b) Operator Overloading
 * This is when an operator is processed differently by the compiler based on the context it is used in
 * e.g. 100 + mult * num - the '+' operator is used to add two numbers
 * str + strIn - the '+' operator is used to concatenate two strings a into a single string
 * 
 * c) Method Overriding
 * This is when a method from a parent class or implemented interface is overridden with new code. It is good practice to include the @Override
 * notation even when it is not strictly necessary for the compiler to make it clear to other programmers that this method has been overridden
 * 
 * d) type polymorphism
 * This is the ability for objects of different types to be able to have the type of their parent (and interface) classes as well as their own.
 * 
 */

public class SomeClass implements SomeInterface {

	private double y;
	
	@Override
	public double SomeMethod(double x)
	{
		return 2.5 * x;
	}
}


