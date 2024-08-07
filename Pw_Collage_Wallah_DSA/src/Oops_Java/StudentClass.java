package Oops_Java;

public class StudentClass 
{
	public static class Student
	{
		//creating a new data type
		String name;
		int roll_no;
		double marks;
		
	}
	
	public static class Car
	{
		String name;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   Student x= new Student();//declaration
	   x.name="Pratik Sutar";
	   x.roll_no=56;
	   x.marks=97.30;
   	   System.out.println(x.name);
   	   System.out.println(x.roll_no);
   	   System.out.println(x.marks);
   	   
   	   Student s= new Student();
   	   s.name="Tanishka Sutar";
	   s.roll_no=16;
	   s.marks=100.2;
	   System.out.println(s.name);
   	   System.out.println(s.roll_no);
   	   System.out.println(s.marks);
   		
	}
}
  
																												