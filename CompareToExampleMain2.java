package stringMethods;

public class CompareToExampleMain2 
{
	public static void main(String ars[])
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//returns length of first string because s2 is empty 
		System.out.println(s2.compareTo(s3));//s2 is empty and s3 having length 2 so returns negative value of the length of sm
	}
 
}
