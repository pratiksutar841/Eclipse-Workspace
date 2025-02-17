
package pkg_main;

import java.util.Scanner;

import pkg_book.Book;
import pkg_book.BookManager;
import pkg_exception.BookNotFoundException;
import pkg_exception.StudentNotFoundException;
import pkg_person.Student;
import pkg_person.StudentManager;
import pkg_transaction.BookTransactionManager;

public class Main {

	public static void main(String[] args) {
		int choice;
		
		Scanner sc  = new Scanner(System.in);
		
		BookManager bm = new BookManager();
		StudentManager sm = new StudentManager();
		BookTransactionManager btm = new BookTransactionManager();
		
		do {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter 1 if Student\nEnter 2 if Librarian\nEnter 3 if want to Exit:");
			choice = sc.nextInt();
			
			if (choice == 1) // if user is Student
			{
				System.out.println("Enter Your Roll Number");
				int rollNo = sc.nextInt();
				try {
					Student s = sm.get(rollNo);
					if (s == null)
						throw new StudentNotFoundException();
					int stud_choice;
					
					do {
						System.out.println("Enter 1 to View All Books\nEnter 2 to Search Book by ISBN\nEnter 3 to List Books By Subject\nEnter 4 to Issue a Book\nEnter 5 to Return a Book\nEnter 99 to Exit");
						stud_choice = sc.nextInt();
						switch(stud_choice){
						case 1:
							System.out.println("All the Book Records are");
							bm.viewAllBooks();
							break;
						case 2:
							System.out.println("Please Enter ISBN To Search");
							System.out.println("Enter ISBN of the Book to Search");
							int search_isbn = sc.nextInt();
							Book book = bm.searchBookByIsbn(search_isbn);
							if (book == null)
								System.out.println("No Book with this ISBN Exists in Our Library");
							else
								System.out.println(book);
							break;
							
						case 3:
							System.out.println("Enter the Subject to Search");
							sc.nextLine();
							String search_subject = sc.nextLine();
							bm.listBooksBySubject(search_subject);
							break;
						case 4:
							System.out.println("Enter the ISBN to Issue a Book");
							int issue_isbn = sc.nextInt();
							book = bm.searchBookByIsbn(issue_isbn);
							try {
								if (book == null) {
									throw new BookNotFoundException();				
								}
								if (book.getAvailable_quantity() > 0)
								{
									if (btm.issueBook(rollNo, issue_isbn)) {
										book.setAvailable_quantity(book.getAvailable_quantity()-1);
										System.out.println("Book Has Been Issued");
									}
								}
								else {
									System.out.println("The Book has Been Issued...");
								}
								
							}
							catch(BookNotFoundException bnfe) {
								System.out.println(bnfe);
							}
							
							break;
						case 5:
							System.out.println("Please Enter the ISBN to Return a Book");
							int return_isbn = sc.nextInt();
							book = bm.searchBookByIsbn(return_isbn);
							if (book != null) {
								if (btm.returnBook(rollNo, return_isbn)) {
									book.setAvailable_quantity(book.getAvailable_quantity()+1);
									System.out.println("Thank You for Returning the Book");
								}
								else
									System.out.println("Could Not Return the Book");
							}
							else
								System.out.println("Book with this ISBN Does not Exists");
							break;
						case 99:
							System.out.println("Thank You for Using Library");
							break;
						default:
							System.out.println("Invalid Choice");
						}
					}while(stud_choice != 99);
					
				}
				catch(StudentNotFoundException snfe) {
					System.out.println(snfe);
				}
				
			}
			else if (choice == 2) // user is a Librarian
			{
				int lib_choice;
				do {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Enter 11 to View all Students\nEnter 12 to Print a Student by Roll Number\nEnter 13 to Register a Student\nEnter 14 to Update a Student\nEnter 15 to Delete a Student");
					System.out.println("Enter 21 to View all Books\nEnter 22 to Print a Book by ISBN\nEnter 23 to Add a  New Book\nEnter 24 to Update a Book\nEnter 25 to Delete a Book");
					System.out.println("Enter 31 to view all Transactions");
					System.out.println("Enter 99 to to Exit");
					lib_choice = sc.nextInt();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					switch(lib_choice) {
					case 11: // view all students 
						System.out.println("All the Students Records");
						sm.viewAllStudents();
						break;
					case 12: // search a student based on roll number
						System.out.println("Enter Roll Number to Fetch Student's Record");
						int get_rollNo = sc.nextInt();
						Student student = sm.get(get_rollNo);
						if (student == null) {
							System.out.println("No Record Matches this Roll Number");
						}
						else
							System.out.println(student);
						break;
					case 13:   // adding a student
						System.out.println("Enter Students Details to Add");
						String name;
						String emailId;
						String phoneNumber;
						String address;
						String dob;
						int rollNo;
						int std;
						String division;
						sc.nextLine();
						System.out.print("Name = ");
						name = sc.nextLine();
						
						System.out.print("EmailId = ");
						emailId = sc.nextLine();
						
						System.out.print("Phone Number = ");
						phoneNumber = sc.nextLine();
						
						System.out.print("Address = ");
						address = sc.nextLine();
						
						System.out.print("Date of Birth = ");
						dob = sc.nextLine();
						
						System.out.print("Roll Number as Integer = ");
						rollNo = sc.nextInt();
						
						System.out.print("Standard as Integer = ");
						std = sc.nextInt();
						
						sc.nextLine();
						
						System.out.print("Division = ");
						division = sc.nextLine();
						
						student = new Student(name, emailId, phoneNumber, address,  dob, rollNo,  std, division);
						sm.addAStudent(student);
						System.out.println("Student is Added");
						break;
					
					case 14: //update a student
						System.out.println("Enter The Roll Number to Modify the Record");
						int modify_rollNo;
						modify_rollNo = sc.nextInt();
						student = sm.get(modify_rollNo);
						try {
							if (student == null)
								throw new StudentNotFoundException();
							
							sc.nextLine();
							System.out.print("Name = ");
							name = sc.nextLine();
							
							System.out.print("EmailId = ");
							emailId = sc.nextLine();
							
							System.out.print("Phone Number = ");
							phoneNumber = sc.nextLine();
							
							System.out.print("Address = ");
							address = sc.nextLine();
							
							System.out.print("Date of Birth = ");
							dob = sc.nextLine();
							
							System.out.print("Standard as Integer = ");
							std = sc.nextInt();
							
							sc.nextLine();
							
							System.out.println("Division = ");
							division = sc.nextLine();
							
							sm.updateStudent(modify_rollNo, name, emailId, phoneNumber, address, dob, std, division);
							System.out.println("Student Record is Update");
						}
						catch(StudentNotFoundException snfe) {
							System.out.println(snfe);
						}
						break;
					case 15:  //to delete student
						System.out.println("Enter The Roll Number to Delete the Record");
						int delete_rollNo;
						delete_rollNo = sc.nextInt();
						if (sm.deleteStudent(delete_rollNo))
							System.out.println("Student Record is Removed");
						else
							System.out.println("No Record with Given Roll Number Exists");
						break;
					
					case 99:
						System.out.println("Thank You for Using Library");
						break;
					default:
						System.out.println("Invalid Choice");
					
					}
				}while(lib_choice != 99);	
				
			}
			
			
		}while(choice != 3);
		sm.writeToFile();
		
	}
	
}
