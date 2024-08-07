package CoreJava;

class Super
{
	int i,j;

	void set(int x, int y)
	{
		i=x;
		j=y;
	}
	
}
class Base extends Super
{
	int total;
	void sum()
	{
		total=i+j;
	}
}


public class Inheritance 
{
	public static void main(String[] args) 
	{
		Base ob = new Base();
		ob.set(10, 30);
		ob.sum();
		System.out.println(ob.total);
	}
}