package CoreJava;

class hello1
{
	int b;
	hello1(int a)//parameterized
	{
		b=a;
	}
	void display()
	{
		System.out.println(+b);
	}
}
public class Constructors1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     hello1 ob = new hello1(20);
     ob.display();
 
	}

}
