package CoreJava;
class pra
{
	int a=10;
	static int b=5;
	void show()
	{
		a=a+10;  //20  //20
		b=b+20;  //25  //45
		System.out.println(+a);
		System.out.println(+b);
	}
}
public class StaticF 
{
	public static void main(String[] args) 
	{
      pra ob = new pra();
      ob.show();
      
      pra ob1 = new pra();
      ob1.show();
	}
}
