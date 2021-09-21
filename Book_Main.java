package Book;
import java.util.*;

public class Book_Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		book b1 = new book("book1","auther1","publisher1",1,2001,100);
		book b2 = new book("book2","auther2","publisher2",2,2002,200);
		book b3 = new book("book3","auther3","publisher3",3,2003,300);
		book b4 = new book("book5","auther5","publisher5",5,2005,500);
		
		
		hold_reqest r1 = new hold_reqest(b1);
		hold_reqest r2 = new hold_reqest(b2);
		hold_reqest r3 = new hold_reqest(b4);
		
		employee e1 = new employee("mohammed", 1111, 012030, 00000, 1000);
		employee e2 = new employee("ahmed", 2222, 012030, 11111, 2000);
		employee e3 = new employee("mahmoud", 3333, 012030, 22222, 3000);
		
		r1.setLib_employee(e1);
		r2.setLib_employee(e2);
		r3.setLib_employee(e3);
		
		
		student_borrowers s1 = new student_borrowers("donia", 1111,012030,9999,"CS");
		s1.set_requests(r1);
		s1.set_requests(r2);
		s1.set_requests(r3);
		
		s1.borrowe_book();
		
		s1.del_requests(2);
		
		s1.borrowe_book();

		s1.num_of_requests();
		s1.get_requests();
	}

}
