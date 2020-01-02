package stringMethods;

public class ContainsExampleMain2 
{
	public static void main(String args[])
	{
		String str="hello F#A#C#E#@2.0readers";
		boolean isContains=str.contains("F#A#C#E");
	    System.out.println(isContains);
	    //Case sensitive
	    System.out.println(str.contains("FACe"));
	}
}
