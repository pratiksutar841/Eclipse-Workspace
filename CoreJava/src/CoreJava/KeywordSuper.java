//used in the concept of inheritance
//used to access parent class members
//used to call parent class constructors

package CoreJava;
class efg
{
	int a;
}
class defh extends efg
{
	int a;
	void show()
	{
		a=10; //variable of class defh
		super.a=20; // variable of class efg
		
		System.out.println("parent class "+super.a);
		System.out.println("subclass class "+a);
		
	}
}
public class KeywordSuper 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        defh ob = new defh();
        ob.show();
	}

}
