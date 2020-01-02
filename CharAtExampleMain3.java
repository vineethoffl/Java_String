package stringMethods;

public class CharAtExampleMain3
{
	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int strlength=str.length();
		//fetching first character 
		System.out.println("Character at 1st Index is :"+ str.charAt(1));
		//last index at (string length-1)th index
		System.out.println("Character at the last index is: "+str.charAt(strlength-1));
	}
}
