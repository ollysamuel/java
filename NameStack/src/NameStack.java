import java.util.*;

public class NameStack
{
	private List<String> stack;
	
	public NameStack()
	{
		stack = new ArrayList<>();
	}
	
	public void push(String nameIn)
	{
			stack.add(nameIn);
	}
	
	public String pop() throws NamesStackException
	{
		if (stack.isEmpty())
		{
			throw new NamesStackException();
		}
		else
		{
			return stack.remove(stack.size()-1);
		}
	}
	
	public int size()
	{
		return stack.size();
	}
	
	public boolean isEmpty()
	{
		return stack.isEmpty();
	}
	
	@Override
	public String toString()
	{
		String names = "";
		for (String name : stack)
		{
			names = names + name + ", ";
		}
		names = "[" + names.substring(0, names.length() - 2) + "]";
		return names;
	}
}
