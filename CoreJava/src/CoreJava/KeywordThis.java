//reference variable
//used to refer any member of current class
package CoreJava;

class pqr
{
	int a,b; //instance variable
	void setdata(int a, int b)   //local variable
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println(+a);
		System.out.println(+b);
	}
}
public class KeywordThis 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        pqr ob = new pqr();
        ob.setdata(10, 20);
        ob.show();
	}

}
