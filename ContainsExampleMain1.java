package stringMethods;

public class ContainsExampleMain1
{
	public static void main(String args[])
	{
		String name="what do you know about me";
		//search for the given sequence inside the string
		System.out.println(name.contains("do you know"));//returns true
		System.out.println(name.contains("about"));//returns true
		System.out.println(name.contains("hello"));//returns false
	}
}
