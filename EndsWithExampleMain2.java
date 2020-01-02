package stringMethods;

public class EndsWithExampleMain2 
{
	public static void main(String args[])
	{
		String str="Welcome to FACE.in";
		System.out.println(str.endsWith("in"));//returns true
		if(str.endsWith(".com"))//condition fails
		{
			System.out.println("String ends with .com");
		}
		else
			System.out.println("it does not end with .com");//prints the statement
	}
}
