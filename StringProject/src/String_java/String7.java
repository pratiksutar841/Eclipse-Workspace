//delete: delete some contiguous characters from a string
//deleteChartAt():Used to delete specific character of a string
//append: to concatenation
//insert:used to insert a character or a string at specific index
package String_java;
public class String7 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("PratikSutar");
		System.out.println(s);
		System.out.println(s.delete(0,3));
		System.out.println(s.deleteCharAt(6));
		System.out.println(s.append('r'));
		System.out.println(s.insert(0,"tanu"));
	}

}