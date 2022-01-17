import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import classList.StockItem;

public class Chapter15
{
/*
 * Chapter 15 Self Test Questions
 * 
 * 1. Distinguish between the following types of collection in the Java CollectionsFramework:
• List;
• Set;
• Map.
 * 
 * List
 * A list is an interface of the super interface 'Collection'.
 * The List interface provides methods that can be used to store and process an 
 * ordered list of objects - the order that the elements are entered is preserved. An ordered list can contain duplicates. Whatever is stored in the list
 * will be stored in the order that it is provided.
 * The List interface has 2 implementations in the Java Collections Framework: ArrayList and LinkedList.
 *
 * ArrayList
 * This is essentially an array of objects.  The methods in the ArrayList class
 * manage the size of the array dynamically so that items can be added, which would be laborious if
 * using an array without pre written methods.  If items need to be added, then the array is copied to another location in memory with more
 * bytes added to it's total size.  It can therefore be quite slow to add new items to the list for large ArrayLists but the read time is very fast if the
 * index is known.
 * 
 * LinkedList
 * A linked list consists of pairs of data consisting of the item (e.g. an object) an then a reference/pointer to the next location in memory
 * that the next piece of information is stored in.  Unlike an array, when adding a new item, the data in the list doesn't need to be copied to a new
 * memory location.  Therefore the write time is Big O of 1 - much quicker than an array which is potential Big O of n.  
 * 
 * Set
 * The Set interface is also an interface of the super interface 'Collection'.
 * The Set interface also provides methods that can be used to manage an store data.  However this data is unordered, meaning that when retrieved it
 * is not in the same order as when it was entered.  You also cannot add duplicate data.  For example if storing number plates, you wouldn't be able to store
 * the same number plate twice.
 * Java provides three implementations of the Set interface: HashSet, TreeSet and LinkedHashSet.
 * 
 * HashSet
 * The HashSet Implementation of the Set Interface processes each piece of data that has been added to the Set by running it through a hashing algorithm generating a unique
 * hashcode. This means that 2 pieces of data that are the same (e.g. two numbers or identical strings) will have the same hashcode. This hashcode is further processed so that 
 * it maps to an array of an appropriate size.  The consequence of this is that 2 identical pieces of data will be assigned the same position in the array and it is therefore
 * possible to know whether that piece of data has been entered already or not.  Therefore 2 identical pieces of data will not be stored more than once.
 * You can therefore look up data using an index, as you would for an array or ArrayList, but the data wouldn't necessarily be in the order in which it was entered.
 * 
 * Map
 * The Map interface creates a data structure consisting of key - value pairs. A key is required to find an associated value.  The are three implementations of the Map interface
 * in the JCF: HashMap, TreeMap and LinkedHashMap.
 * 
 * HashMap
 * This represents the data entered as key-value pairs.  A key is required in order to access the data stored as the value.
 * This works in a similar way to the HashSet.  The key is run through a hashing algorithm, which gives an index of an array, where the value/data is stored.
 * Therefore, when someone enters the key, the same index is produced and it therefore unlocks the value. The speed of finding the data is limited to the speed of the 
 * hashing algorithm plus 1 so it is very fast.
 * 
 * 
 * 2. Identify, with reasons, the most appropriate Java collection type to implement
the following collections:
(a) An ordered collection of patient names waiting for a doctor;
(b) An unordered collection of patient names registered to a doctor;
(c) An unordered collection of BankAccount objects.
 * 
 * - An ordered collection of patient names waiting for a doctor;
 * 
 * An ArrayList of Strings would be the most appropriate java collection type for this because it would maintain the order that the patients were added to the list
 * with the first patient being at the 0 index.  The ArrayList would automatically create a new array whenever a patient is added or removed. It would also permit duplicate
 * names should a patient require two appointments and/or two patients have the same name.
 * 
 * - An unordered collection of patient names registered to a doctor;
 * 
 * A HashSet would be the most appropriate java collection type to use here as the same patient cannot be registered more than once. If middle names are used it is
 * less likely that patients will have the same name. If they still have the same name, an extra digit or symbol may need to be used so that they can both be stored.
 * 
 * - An unordered collection of BankAccount objects.
 * 
 * A HashMap would be the best Java collection to use here as it could store the bank account objects as the value with a unique account number as the key. Order is not
 * important and as a hashing algorithm is used to obtain the index that the relevant bank account object is stored in, retrieving the data would be very quick.
 * 
 * 3. Consider the following instruction:
 * 
Map <String, Student> javaStudents = new HashMap<>();

(a) Why is the type of this object given as Map and not HashMap?
Map is the superclass of HashMap.  This means that the type of map collection (HashMap) could be changed without changing the rest of the code as they would all be
Map objects as well as a HashMap, LinkedHashMap or TreeMap

(b) Assuming the object javaStudents has been created as above, why
would the following line cause a compiler error?

javaStudents.put("u0012345", "Jeet");

The value is an object and therefore would require the 'new' keyword to be used with the Student class Constructor method call along with its arguments
 * 
 * 4. Consider again the StockItem class from the programming exercises of Chap. 8. Here is the UML diagram:

(a) Identify the purpose of a toString method and define an appropriate toString method for this class.

A toString method overrides the default toString method inherited from the Object class. It enables the programmer to define how the toString method is implemented and
usually returns a concatenated string of the various attributes of the object.

@Override
public String toString()
{
	return "Stock Number: " + stockNumber + "name: " + name + "Price: " + price + "Total Stock: " + totalStock;
}

(b) Identify the purpose of an equals method and define an appropriate equals method for this class.

The purpose of an equals method is to define how two objects are to be compared when the equals method of that class is called.  The equals method is inherited from the Object
superclass and needs to be Overridden in order for it to compare two none primitive data types such as an object.  It should return true if the two items being compared are
the same.

@Override
public boolean equals(Object objIn)
{
	StockItem itemIn = (StockItem) objIn;
	if (name.equals(itemIn.getName()))
		return true;
	else
		return false;
}

(c) Identify the purpose of a hashCode method and define an appropriate
hashCode method for this class.

The hashcode method is a method inherited from the Object class and needs to be overridden to make the hashcode that is generated unique and relevant to the object.  
A hashcode is used in hashsets and hashmaps to determine which index in an array the data is to be stored in.  It is generated mathematically using the values of the data
that calls it.  For example, if a String calls the hashcode method, a method that has been written specifically for the String class by Oracle is called and a value returned.
This will be the hashcode that is then used to generate an array index.  This means that if someone provides the same data (e.g. a search term for a name) then it will
compute the same index and therefore retrieve the data immediately without having to search through the entire array.
  
@Override
	public int hashCode()
	{
		return name.hashCode();
	}
 * 
 * 
 * 5. In Sect. 15.5 a set called regNums was created to store a collection of car
registration numbers.

(a) Write a fragment of code that makes use of an enhanced for loop to display
all registrations ending in ‘S’.

for (String reg : regNums)
{
	if (reg.charAt(reg.length()-1) == 'S' || reg.charAt(reg.length()-1) == 's')
		System.out.println(reg);
}

(b) Write a fragment of code that makes use of a forEach loop to display all
registrations ending in ‘S’.

regNums.forEach(reg ->
{
	if (reg.charAt(reg.length()-1) == 'S' || reg.charAt(reg.length()-1) == 'S')
	{
		System.out.println(reg);
	}
});

(c) Write a fragment of code, which makes use of the iterator method, to
remove all registration numbers ending in ‘S’.

Iterator<String> elements = regNums.iterator();
		
while (elements.hasNext())
{
	String reg = elements.next();
	if (reg.charAt(reg.length()-1) == 'S' || reg.charAt(reg.length()-1) == 'S')
	{
		elements.remove();
	}
}

6. In Chap. 8 we introduced a BankAccount class and a collection class to hold
bank accounts called Bank. The Bank class was implemented using a List in
the form of an ArrayList class.

(a) If we were to change from a List to a Map, what would be the key type of
the Map and what would be the value type?
The key type would likely be an account number as this would be unique, unlike a name. This would be of type String.
The value type would be a BankAccount object.

(b) Write a fragment of code that declares a Map to hold BankAccount
objects and add two BankAccount objects into this map.

Map<String, BankAccount> bankAccounts = new HashMap<>();

bankAccounts.put("12345678", new BankAccount("12345678", "Olly Samuel"));
bankAccounts.put("56763589", new BankAccount("56763589", "Victoria Samuel"));

(c) Write a fragment of code that uses a forEach loop to display all
BankAccount objects in the map that have a balance over 100.

bankAccounts.forEach((key, account) ->
{
	if (account.getBalance() >= 100)
		System.out.println(account);
});

7. Consider the BankAccount class from Chaps. 7 and 8 once again. Assume we
have the following array to store a collection of BankAccount objects:
BankAccount[] accountList = new BankAccount[5];

Now assume five BankAccount objects have been added into this list.

(a) What method of the Arrays class would allow you to display this array?

Arrays.toString(accountList);

(b) What method of the Arrays class would you allow you to create an
equivalent List from this array?

Arrays.asList(accountList);

(c) Assuming the array has been converted to a list, describe how the Comparable<
T> and Comparator<T> interfaces can be used to help sort
the list, via the account number, by making use of the Collections.-
sort method and the sort method of List.

The comparable interface can be used to sort lists and arrays by being implemented by the class that needs sorting.  Inbuilt classes such as the wrapper classes (String,
Integer, Double etc.) have already implemented the Comparable interface in the header and have then implemented/overridden the compareTo method.  However, when creating a
custom class, the compareTo method needs to be re written so that a compiler error or Exception isn't thrown.  This essentially states what attributes are to be compared
when the sort method of the List class is used.
The Comparator interface allows us to more easily change the attributes that are to be compared by sending in the implementation as a lambda expression.  The comparator
doesn't need to be implemented by the class that needs to be sorted either so potentially adds a bit more flexibility.

Finally to sort the List or Array, you call the Array.sort() or List.sort(). In the case of the Comparator interface, the lambda expression is included in the argument for
sort.

To make the Comparator method with the lambda expression even more simple, you can use the comparing method with the method reference notation.


 * 
 * 
 */
}
