package CoreJava;


class poly
{
	void add()
	{
		System.out.println("No parameter");
	}
	void add(int x)
	{
		System.out.println("parameterized = "+x);
	}
	void add(int x, int y)
	{
		System.out.println("2 parameters = "+x+" and "+y);
	}
}

public class Polymorphism 
{

	public static void main(String[] args) 
	{
		poly ob = new poly();
		ob.add();
		ob.add(10);
		ob.add(20, 40);

	}

}
