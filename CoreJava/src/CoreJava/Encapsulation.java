package CoreJava;


class encaps
{
	private int a;
	private double b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encaps ob = new encaps();
		ob.setA(2);
		ob.setB(2.3);
		
		System.out.println(ob.getA());
		System.out.println(ob.getB());

	}

}
