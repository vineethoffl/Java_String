package stringMethods;

public class CharAtExampleMain4
{
	public static void main(String args[])
	{
		String str="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='t')//checks whether the character is t
			{
				count++;//counts the occurrence of t
			}
		}
		System.out.println("Frequency of t is: "+count);
	}
}
