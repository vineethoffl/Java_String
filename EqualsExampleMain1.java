package stringMethods;

public class EqualsExampleMain1 
{
	public static void main(String args[])
	{
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenxt";
		System.out.println(s1.contentEquals(s2));//true; content and case same
		System.out.println(s1.contentEquals(s3));//false; content is not same
		System.out.println(s1.contentEquals(s4));//false; content is not same
	}
}
