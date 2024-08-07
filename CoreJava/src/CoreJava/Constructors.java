package CoreJava;

class hello
{
	int a;
	hello()        //default constructor
	{
		System.out.println("default constructor");
		a=10;
	}
	void display()
	{
		System.out.println(a);
	}
}


public class Constructors 
{
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      hello ob = new hello();
      ob.display();
     
	
	}

}
