import java.util.Objects;

public class Person
{
	String name;
	String idNum;
	String email;
	String tel;
	
	public Person(String nameIn, String idNumIn, String emailIn, String telIn)
	{
		name = nameIn;
		idNum = idNumIn;
		email = emailIn;
		tel = telIn;
	}
	
	public Person getPerson()
	{
		return this;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean setName(String nameIn)
	{
		name = nameIn;
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(idNum, name);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(idNum, other.idNum) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString()
	{
		return "Name: " + name + "\nID Number: " + idNum + "\nEmail: " + email + "\nTel: " + tel;
		
	}
}
