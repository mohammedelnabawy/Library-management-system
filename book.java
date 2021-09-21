package Book;

public class book {
	
	private String book_name;      //name of the book
	private String book_auther;    //name of auther
	private String book_publiser;  //name of publisher
	
	private int book_num;          //book num
	private int book_year;         //year of the publisher
	private int book_cost;         //cost of the book
	
	static private int number;     //all numbers of book in library  (static)
	
	// Class constractor
	public book(String book_name, String book_auther, String book_publiser, int book_num, int book_year,
			int book_cost) {
		
		super();
		number++;
		this.book_name = book_name;
		this.book_auther = book_auther;
		this.book_publiser = book_publiser;
		
		if(book_num < 0)
			this.book_num = number;
		else
			this.book_num = book_num;
		
		this.book_year = book_year;
		this.book_cost = book_cost;

	}
	
	// Getter and Setter for the book name
	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	
	// Getter and Setter for the book auther name
	public String getBook_auther() {
		return book_auther;
	}

	public void setBook_auther(String book_auther) {
		this.book_auther = book_auther;
	}
	
	
	// Getter and Setter for the book publisher name
	public String getBook_publiser() {
		return book_publiser;
	}

	public void setBook_publiser(String book_publiser) {
		this.book_publiser = book_publiser;
	}
	

	// Getter and Setter for number of the book
	public int getBook_num() {
		return book_num;
	}

	public void setBook_num(int book_num) {
		if(book_num < 0)
			this.book_num = number;
		else
			this.book_num = book_num;
		}
	

	// Getter and Setter for the book publisher year
	public int getBook_year() {
		return book_year;
	}

	public void setBook_year(int book_year) {
		this.book_year = book_year;
	}

	
	// Getter and Setter for the book cost
	public int getBook_cost() {
		return book_cost;
	}

	
	public void setBook_cost(int book_cost) {
		this.book_cost = book_cost;
	}
	
	//all book information
	public void book_inf() {
		System.out.println("Book Name      : " +this.book_name);
		System.out.println("Book Auther    : " +this.book_auther);
		System.out.println("Book Publisher : " +this.book_publiser);
		System.out.println("Book Num       : " +this.book_num);
		System.out.println("Book Year      : " +this.book_year);
		System.out.println("Book cost      : " +this.book_cost);
	}

	// return numbers of the book inside the library
	public static int get_Number_of_books_in_library() {
		return number;
	}


}
