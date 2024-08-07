/*
 1] Using string Literals
 2] Using new Keyword        */
package String_java;
public class String1 
{
	public static void main(String[] args) 
	{
		String s = "Pratik";
		System.out.println(s); //using literals
		
		
		String obj = new String("Java");
		System.out.println(obj);   ///new keyword
		System.out.println(obj.length());
		
		char owel[]= {'a','e','i','o','u'};
		String str1 =new String(owel);
		System.out.println(str1);
	}
}
   