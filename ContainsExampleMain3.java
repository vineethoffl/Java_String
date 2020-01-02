package stringMethods;

public class ContainsExampleMain3 
{
	public static void main(String args[])
	{
		String str="To learn java visit focusacademy";
		if(str.contains("focus Acadmey.in.com"))//condition fails
		{
			System.out.println("this string contains focusacademy.in");
		}
		else
			System.out.println("Result not found");//prints the statement
	}
}
