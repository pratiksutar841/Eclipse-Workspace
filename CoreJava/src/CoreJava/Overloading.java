package CoreJava;


class abcd
{
	void add()
	{
		System.out.println("Hey !");
	}
	void add(int x)
	{
		int i;
		i=x;
		System.out.println(+i);
	}
}
public class Overloading 
{

	public static void main(String[] args) 
	{
		abcd ob = new abcd();
		ob.add();
		ob.add(10);

	}

}
