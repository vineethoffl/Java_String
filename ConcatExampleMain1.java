package stringMethods;

public class ConcatExampleMain1
{
	public static void main(String args[])
	{
		String s1="java string";
		s1.concat("is immutable");
		System.out.println(s1);// prints "java string" as output
		s1=s1.concat("is immutable so assign it explicitly");// assigning explicitly to an instance and gets the muted string as output
		System.out.println(s1);
	}
}
