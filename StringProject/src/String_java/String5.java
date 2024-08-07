//String Buffer class
//string class create Immutable  changeable
//StringBuffer class create Mutable object change
package String_java;
public class String5 
{
	public static void main(String[] args) 
	{
		String ob=new String("Java");
		ob.concat("Hello");
		System.out.println(ob);
		
		StringBuffer s=new StringBuffer("Java");
		s.append(" word");
		System.out.println(s);
		
		
	}
}