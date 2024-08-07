package CoreJava;


class abc
{
	int a= 5;
	void disp()
	{
		System.out.println("a is "+a);
	}
}
class def extends abc
{
	int c=3;
	void disp()
	{
		System.out.println("a is "+a);
		System.out.println("c is "+c);
	}
}
public class Overriding 
{
	public static void main(String[] args) 
	{
	
     def ob = new def();
     ob.disp();
	}

}