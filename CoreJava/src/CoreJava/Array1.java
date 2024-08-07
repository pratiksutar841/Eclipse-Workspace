package CoreJava;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]= {10,20,30,40,50,60};
      int b=0,i;
      for ( i = 0; i < a.length; i++) 
      {
		b=b+a[i];
	  }
      System.out.println("Total is "+b);
	}

}
