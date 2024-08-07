//charAt():used to get the character present at specific index in a string
//setchartAt():to set the character at specific index
package String_java;
public class String6 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("PratikSutar");
		System.out.println(s);
		s.setCharAt(0, 'T');
		System.out.println(s.charAt(3));
		System.out.println(s);
	}

}
