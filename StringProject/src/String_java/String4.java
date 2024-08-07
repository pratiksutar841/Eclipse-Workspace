//String Buffer class
//string class create Immutable  changeable
//StringBuffer class create Mutable object not change
package String_java;
public class String4 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Java");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.charAt(2));
	}
}