package stringMethods;

public class ConcatExampleMain3 
{
	public static void main(String args[])
	{
		String str1="hello";
		String str2="face@2.0";
		String str3="reader";
		//concatenating space among string
		String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3);
		System.out.println(str4);
		//concatenating special chars
		String str5=str1.concat("@").concat(str2);
		System.out.println(str5);
	}
}
