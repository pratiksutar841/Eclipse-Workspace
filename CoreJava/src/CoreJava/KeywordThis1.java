//reference variable
//used to refer any member of current class
//used to invoke current class constructor
package CoreJava;

class lmn
{
	int a,b,c; //instance variable
	lmn(int a, int b)   //local variable
	{
		this.a=a;
		this.b=b;
	}
	lmn(int a, int b, int c)   //local variable
	{
	    this(a,b);
		this.c=c;
	}
	void show()
	{
		System.out.println(+a);
		System.out.println(+b);
	}
	void show1()
	{
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
	}
}
public class KeywordThis1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        lmn ob = new lmn(10,20,40);
       
        ob.show1();
	}

}

