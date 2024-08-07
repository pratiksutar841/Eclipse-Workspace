// Concatenation of 2 or more strings:
//1] using '+' operator
//2] using concat()  in build
package String_java;
public class String2 
{
	public static void main(String[] args) 
	{
     	String a = "Pratik";
     	String b = " Sutar";
     	String c = a+b+"  tanu" +10+20+(10+20);          //+ oprator
     	System.out.println(c);
     	
     	String str = "Tanishka";
     	String str1=str.concat(" Sutar");
     	System.out.println(str1);
     	
     	
	}
}
