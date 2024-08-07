package CoreJava;

abstract class maths
{
	abstract void add();
	void subtraction()
	{
		System.out.println("Substraction");
		
	}
	abstract void multi();
}

 class maths1 extends maths
{
	void add()
	{
		System.out.println("Addition");
	}

	@Override
	void multi() {
		// TODO Auto-generated method stub
		
	}

	
}
public class Abstract {

	public static void main(String[] args) 
	{
		maths1 ob = new maths1();
		ob.add();
		ob.subtraction();

	}

}
