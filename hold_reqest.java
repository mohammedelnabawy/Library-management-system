package Book;

import java.util.Date;
public class hold_reqest {
	
	private employee lib_employee; // the librarian name
	private book Borrower_book;		//The book we borrowed	
	private int request_num;
	private Date tack_day;
	private Date return_day;
	
	private static int num_of_requests;	// the number of all requests in the library
	
	// Class constractor
	public hold_reqest(book borrower_book) {
		super();
		num_of_requests++;	// increace the number of all requests after get a new object
		Borrower_book = borrower_book;
		request_num = num_of_requests;	//putting the request number
	}

	//Getter and Setter for the borrowed book
	public book getBorrower_book() {
		return Borrower_book;
	}

	public void setBorrower_book(book borrower_book) {
		Borrower_book = borrower_book;
	}

	//Getter and Setter for librarian name
	public employee getLib_employee() {
		return lib_employee;
	}

	public void setLib_employee(employee lib_employee) {
		this.lib_employee = lib_employee;
	}
	
	//Getter and Setter for Request Date
	public Date getTack_day() {
		return tack_day;
	}

	public void setTack_day(Date tack_day) {
		this.tack_day = tack_day;
	}

	//Getter and Setter for Return Date
	public Date getReturn_day() {
		return return_day;
	}

	public void setReturn_day(Date return_day) {
		this.return_day = return_day;
	}
	
	//Getter and Setter for request_num
	public int get_request_num() {
		return request_num;
	}
	
	//Returning the number of all requests
	public static int num_of_requests() {
		return num_of_requests;
	}
	
	//Information method
	public void reqest_inf() {
		System.out.println("............. Recuest information .............");
		System.out.println("The request_num    :" +request_num+ 
						   "\nThe Book Name      :" +Borrower_book.getBook_name()+
						   "\nThe Librarian Name :" +lib_employee.getName()+
						   "\nThe Request Date   :" +tack_day+
						   "\nThe Return Date    : "+return_day+ "\n");
	}


}
